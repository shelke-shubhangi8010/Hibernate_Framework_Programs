package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 Configuration conf =new Configuration();
			
			conf.configure("test/hibernate.cfg.xml");
			
			// step-2
			
			SessionFactory factory =conf.buildSessionFactory();
			
			// step-3
			Session session=factory.openSession();
			
			// step -4
			// FEtch All Details
			
		/*	List<Student>l1=session.createQuery("from student",Student.class).list();
			
			for(Student s1:l1)
			{
				System.out.println(s1.getName()+" "+s1.getAge());
			}*/
			
			
	//=====================================================================		
			// Where name= Aniket
			
			/*Query<Student> q1=session.createQuery("from Stuudent s where s.name= :n",Student.class);
					 
					 
				q1.setParameter("n", "Aniket");
				
				List<Student>list=q1.list();
				
				for(Student s1:list)
				{
					System.out.println(s1.getId()+""+s1.getName()+" "+s1.getAge());
				}*/
			
//===============================================================
			//select specific column data
			
		/*	Query<String>q1=session.createQuery("SELECT s.name FROM Student s",Student.class);
			List<String> list = q1.list();
			for(String s1:list)
			{
				System.out.println(s1);
			}*/
	//============================================================		
		
			// select student where age>35
			
			Query<Student> q1 = session.createQuery("FROM Student s WHERE s.age >:a",Student.class);	
			
			q1.setParameter("a", 35);
			List<Student> list = q1.list();
			for(Student s1:list)
			{
				System.out.println(s1.getId()+""+s1.getName()+" "+s1.getAge());
			}
			
			
			session.close();
			factory.close();
			
			System.out.println("Details Added Successfully...");
			
	}

}
