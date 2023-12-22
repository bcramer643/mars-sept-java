package com.returnship.training.collection;


	import java.util.HashSet;
	import java.util.Set;

	public class EmployeeCollection {
		public static void main(String [] args) {
			
			Set <Employee> employee = new HashSet<>();
			
			employee.add(new Employee("George", "2023-02-18", 64000, "Engineer", 1));
			employee.add(new Employee("Jerry", "2022-01-08", 30000, "Agent", 2));
			employee.add(new Employee("Elaine", "2017-06-29", 42000, "Spy", 33));
			employee.add(new Employee("Kramer", "2006-01-12", 66000, "Engineer", 4));
			employee.add(new Employee("Bart", "2019-09-23", 65000, "Engineer", 7));
			employee.add(new Employee("Homer", "2015-04-08", 53000, "Spy", 4));
			employee.add(new Employee("Lisa", "2020-05-03", 41000, "Agent", 9));
			employee.add(new Employee("Marge", "2015-07-12", 60000, "Engineer", 5));
			employee.add(new Employee("Lisa", "2022-01-08", 42000, "Spy", 16));
			employee.add(new Employee("Larry", "2023-02-02", 40000, "Agent", 18));
			
			
			for(Employee emp: employee) {
				String department = emp.getDesignation();
				if(department == "Engineer") {
					
					Set<Employee> engineer = new HashSet<>();
					engineer.add(emp);
					System.out.println("Engineer  :"+ engineer);
				}
				else if(department == "Spy") {
					
					Set<Employee> spy = new HashSet<>();
					spy.add(emp);
					System.out.println("Spy  :"+ spy);
					
				}
				else if(department == "Agent") {
					Set<Employee> agent = new HashSet<>();
					agent.add(emp);
					System.out.println("Agent  :"+ agent);
				}
				
			}	
			
		}
}
