package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDataAccess {
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
				
				Employee e1= new Employee();
				e1.setName("shubhangi");
				
				Regular_Employee e2=new Regular_Employee();
				e2.setName("Aniket");
				e2.setSalary(20000);
				e2.setBonus(5);
				
				Contract_Employee e3=new Contract_Employee();
				
				e3.setName("Riya");
				e3.setPay_per_hour(18);
				e3.setContract_period("15 Hours");
				
				
				session.persist(e1);
				session.persist(e2);
				session.persist(e3);
				
				tx.commit(); 
				
				session.close();
				factory.close();
				
				System.out.println("Details Added Successfully...");
		
	}
}
