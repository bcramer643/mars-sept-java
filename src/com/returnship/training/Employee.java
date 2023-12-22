package com.returnship.training.collection;

public class Employee {

		private String name;
		private String joiningDate;
		private int salary;
		private String designation;
		private int deptId;
		
		public Employee(String name, String joiningDate, int salary, String designation,int deptId) {
			super();
			this.name = name;
			this.joiningDate = joiningDate;
			this.designation = designation;
			this.salary = salary;
			this.deptId = deptId;
}
		
		public String getName() {
			return name;
		}
		
		public void setName() {
			this.name = name;
		}
		
		public String getJoiningDate() {
			return joiningDate;
		}
		
		public String getDesignation() {
			return designation;
		}
		
		public int getSalary() {
			return salary;
		}
		
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public int getDeptId() {
			return deptId;
		}
		
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Employee [name=" + name + ", joiningDate=" + joiningDate + ", designation=" + designation 
								+ ", salary=" + salary + ", deptId=" + deptId + "]";
		}
		
		
}