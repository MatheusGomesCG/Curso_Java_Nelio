package entitites;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addSalary(double salary) {
		this.salary *= ((salary / 100) + 1);
	}
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
