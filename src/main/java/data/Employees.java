package data;

public class Employees {

	private long empId = 0;
	private String empName = "";

	public Employees(long id, String empName) {
		this.empId = id;
		this.empName = empName;
	}

	public long getId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}
}
