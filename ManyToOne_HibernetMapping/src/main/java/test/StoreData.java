package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

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
			
			Employee e1=new Employee();
			e1.setName("Shelke Shubhangi");
			e1.setEmail("abc@gmail.com");
			
			Employee e2=new Employee();
			e2.setName("Aniket Buge");
			e2.setEmail("abc@gmail.com");
			
			Employee e3=new Employee();
			e3.setName("Sakshi Pakle");
			e3.setEmail("abc@gmail.com");
			
			Address a1=new Address();
			a1.setAddressline("Hinjwadi Phase 1");
		a1.setCity("pune");
		a1.setState("Maharashtra");
		a1.setCountry("India");
		a1.setPincode(414502);
			
		e1.setAddress(a1);
		e2.setAddress(a1);
		
       session.persist(e1);
       session.persist(e2);
       
			tx.commit(); 
			session.close();
			factory.close();
			
			System.out.println("Details Added Successfully...");
			
	}

}
