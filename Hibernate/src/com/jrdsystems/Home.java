package com.jrdsystems;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Home {

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		actions a = new actions();
		while(true){  
			  
			System.out.println("Welcome to Home Page.\nChoose Anyone options below.\nAdd student press 1 ."
					+ "\nUpdate student press 2.\nSelect student press 3.\nDelete student press 4.");

			System.out.println("Enter the number : ");
			int n = sc.nextInt();  
			
			if(n<5 && n>0)
			{
				switch(n)
				{
				case 1:
					System.out.println("Add Student");
					System.out.println("Enter your name : ");
					String name = sc.next();
					System.out.println("Enter your mobile : ");
					long mobile = sc.nextLong();
					System.out.println("Enter your email : ");
					String email = sc.next();
					System.out.println("Enter your address line 1 : ");
					String address = sc.next();
					System.out.println("Enter your district : ");
					String district = sc.next();
					System.out.println("Enter your state : ");
					String state = sc.next();
					System.out.println("Enter your pincode : ");
					int pin = sc.nextInt();
					System.out.println("Enter int value like 123");
					int xyz = sc.nextInt();
					System.out.println("Enter path of image : ");
					String path = sc.next();
					a.add(name, mobile, email, xyz, path, address, district, state, pin);
					break;
				case 2:
					System.out.println("Update Student");
					System.out.println("Enter id for delete : ");
					int id = sc.nextInt();
					System.out.println("Enter name to Update :");
					String na = sc.next();
					a.update(id,na);
					break;
				case 3:
					System.out.println("Select Student");
					System.out.println("Enter all for view all profile or enter name to find specific one :");
					String nam = sc.next();
					a.view(nam);
					break;
				case 4:
					System.out.println("Delete Student");
					System.out.println("Enter id for delete : ");
					int i = sc.nextInt();
					a.delete(i);
					break;
				}
			}
			else{
				System.out.println("Enter number between 1 to 4.");
			}
			System.out.println("If you want to continue enter y/n");  
			String ans=sc.next();  
			if(ans.equals("n")){  
			break;
			}
		} 
		sc.close();
	}

}
class actions
{
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	public void add(String name, long mobile, String email, int xyz, String path, String address2, String district, String state, int pin) throws IOException 
	{
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Profile p = new Profile( );
		p.setName(name);
		p.setMobile(mobile);
		p.setEmail(email);
		p.setXyz(xyz);
		
		FileInputStream fis = new FileInputStream(path);
		byte[] data = new byte[fis.available()];
		fis.read(data);
		p.setImage(data);
		
		p.setDate(new Date());
		
		Address address = new Address();
		address.setAddrline1(address2);
		address.setDistrict(district);
		address.setState(state);
		address.setPincode(pin);
		
		p.setAddress(address);
		session.save(p);
		
		tr.commit();
		session.close();
		fis.close();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		
		Query q = session.createQuery("delete from Profile where id=:i");
		q.setParameter("i", id);
		int status = q.executeUpdate();
		if(status>0) {
			System.out.println("Deleted successfully.");
		}
		session.close();
	}

	public void view(String nam) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		if(nam.equalsIgnoreCase("all")) 
		{
		String query = "from Profile";
		Query q = session.createQuery(query);
		List<Profile> list = q.list();
		
		for(Profile p:list)
		{
			System.out.println(p);
		}
		}else {
			String query = "from Profile where name =:n";
			Query q = session.createQuery(query);
			q.setParameter("n", nam);
			List<Profile> list = q.list();
			
			for(Profile p:list)
			{
				System.out.println(p);
			}
		}
		session.close();
	}

	public void update(int id, String name) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();  
		
		Query q = session.createQuery("update Profile set name=:n where id=:i");
		q.setParameter("n", name);
		q.setParameter("i", id);
		int status = q.executeUpdate();
		if(status>0) {
			System.out.println("Updated successfully.");
		}
		tx.commit();
		session.close();
	}
	
}
