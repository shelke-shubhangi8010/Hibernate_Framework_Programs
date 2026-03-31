package test;

public class Person {
	private String name;
	private int id, age;
	private String city;
	private double salary;
	
	public Person()
	{
		
	}
		public Person(String name,int age, String city,double salary) 
		{
			
			super();
			this.age=age;
			this.city=city;
			
			this.salary=salary;
			this.name=name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
	
	

}
