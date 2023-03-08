package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee
{
	private String name;
	private double salary;
	List<Employee> employeeList;
	
	public Manager(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
		this.employeeList=new ArrayList<>();
	}

	@Override
	public void add	  (Employee employee) {this.employeeList.add   (employee);}
	@Override
	public void remove(Employee employee) {this.employeeList.remove(employee);}
	
	@Override
	public String getName()   {return name;}
	@Override
	public double getSalary() {return salary;}

	@Override
	public void printInfo()
	{
		System.out.println("Manager: " + this.name + " - " + this.salary);
		
		for(Employee employee : this.employeeList)
			employee.printInfo();
	}
}
