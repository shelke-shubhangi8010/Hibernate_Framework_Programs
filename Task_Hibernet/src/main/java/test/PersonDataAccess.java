package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDataAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// step 1= Reading data from hibernate configuration
		
		Configuration conf =new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		// step-2
		
		SessionFactory factory =conf.buildSessionFactory();
		
		// step-3
		Session session=factory.openSession();
		
		// step -4
		Transaction tx=session.beginTransaction();
		
		// create persistance object
		
		 Person p= new  Person ("Shubhangi",23,"AhilyaNagar",87000);				
		session.save(p);
		tx.commit(); 
		session.close();
		factory.close();
		
		System.out.println("Details Added Successfully...");
	}

}
