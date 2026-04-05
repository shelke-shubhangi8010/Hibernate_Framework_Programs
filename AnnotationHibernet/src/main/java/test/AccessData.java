package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccessData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Configuration conf =new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		// step-2
		
		SessionFactory factory =conf.buildSessionFactory();
		
		// step-3
		Session session=factory.openSession();
		
		// step -4
		Transaction tx=session.beginTransaction();
		
		// create persistance object
		
		 Employee emp= new  Employee ();
		 
		 emp.setId(101);
		 emp.setName("riya");
		 emp.setSalary(35000);
		session.save(emp);
		tx.commit(); 
		session.close();
		factory.close();
		
		System.out.println("Details Added Successfully...");
		
		
	}

}
