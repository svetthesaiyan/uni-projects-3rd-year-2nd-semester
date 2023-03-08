package composite;

public class Developer implements Employee
{
	private String name;
	private double salary;
	
	public Developer(String name, double salary)
	{
		super();
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public void add	  (Employee employee) {}
	@Override
	public void remove(Employee employee) {}

	@Override
	public String getName()   {return name;}
	@Override
	public double getSalary() {return salary;}

	@Override
	public void printInfo()	{System.out.println("---> Developer: " + this.name + " - " + this.salary);}
}
