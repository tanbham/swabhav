package model;

public class Employee {
	private int empid;
	private String name;
	private String role;
	private String managerId;
	private String dateOfJoining;
	private double salary;
	private String commission;
	private int deptNumber;
	
	public Employee(String empid , String name , String role, String managerId, String dateOfJoining ,String salary, String comm,String deptNumber) {
		this.empid = Integer.valueOf(empid);
		this.name = name;
		this.role = role;
		this.managerId = managerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = Double.parseDouble(salary);
		this.commission = commission;
		this.deptNumber = Integer.valueOf(deptNumber);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getDesignation() {
		return role;
	}

	public int getDeptNumber() {
		return deptNumber;
	}

	public int compareTo(Employee o) {
		return Integer.valueOf(this.empid).compareTo(Integer.valueOf(o.empid));
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	
	public String toString() {
		return("ID:"+this.empid+" , "+"Salary:"+this.salary+" , "+"Name:"+this.name+" , "+"Role:"+this.role+" , "+"ManagerId:"+this.managerId+" , "+"JoiningDate:"+this.dateOfJoining+" , "+"Commission:"+this.commission+" , "+"DepartmentNumber:"+this.deptNumber);
	}
}
