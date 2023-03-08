package composite;

public class CompositeMain
{
	public static void main(String[] args)
	{
		Manager man1=new Manager("CEO"			, 15000);
		Manager man2=new Manager("Vice-chairman", 12000);
		
		Developer dev1=new Developer("George", 8000);
		Developer dev2=new Developer("Peter" , 9000);
		Developer dev3=new Developer("Ivan"  , 7000);
		
		man1.add(dev1);
		man1.add(man2);
		
		man2.add(dev2);
		man2.add(dev3);
		
		man1.printInfo();
		
		Manager   man3=new Manager	("Executive director", 10000);
		Developer dev4=new Developer("Gergana"			 , 3000);
		
		man2.add(man3);
		man3.add(dev4);
		
		man2.printInfo();
	}
}
