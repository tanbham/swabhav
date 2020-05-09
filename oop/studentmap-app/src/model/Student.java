package model;

public class Student implements Comparable<Student>{
	int roll;
	int standard;
	String name;
	double cgpa;
	
	public Student(int roll , int standard , String name , double cgpa) {
		this.roll = roll;
		this.standard = standard;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public int getStandard() {
		return standard;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roll;
		result = prime * result + standard;
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
		Student other = (Student) obj;
		if (roll != other.roll)
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Student o) {
		//return Integer.valueOf(this.roll+this.standard).compareTo(Integer.valueOf(o.getRoll())+Integer.valueOf(o.getStandard()));
		if(this.roll == o.getRoll() && this.standard == o.getStandard()) {
			return 0;
		}
		else {
			return -1;
		}
	}

}
