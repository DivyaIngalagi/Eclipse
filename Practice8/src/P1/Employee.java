package P1;

public class Employee{// implements Comparable<Employee>{

	private int empID;
	private String name;
	private String phone;
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", phone=" + phone + "]";
	}
	public Employee(int empID, String name, String phone) {
		super();
		this.empID = empID;
		this.name = name;
		this.phone = phone;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.empID-o.empID;
//	}
	
	
}
