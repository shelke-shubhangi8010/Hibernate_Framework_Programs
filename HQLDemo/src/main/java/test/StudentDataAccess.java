package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDataAccess {

	public static void main(String[] args) {
		
		
		 Configuration conf =new Configuration();
			
			conf.configure("hibernate.cfg.xml");
			
			// step-2
			
			SessionFactory factory =conf.buildSessionFactory();
			
			// step-3
			Session session=factory.openSession();
			
			// step -4
			Transaction tx=session.beginTransaction();
			
			
			session.save(new Student("Pawan",32));
			session.save(new Student("Aniket",45));
			session.save(new Student("Priya",56));
			session.save(new Student("Rutuja",22));
			session.save(new Student("Neha",12));
			
			
			
			
			tx.commit(); 
			session.close();
			factory.close();
			
			System.out.println("Details Added Successfully...");
			
		
		
	}

}
