package command;

public class Lights
{
	private Boolean LightsOn;

	public void switchOn()
	{
		System.out.println("The lights are on.");
		
		this.LightsOn=true;
	}

	public void switchOff()
	{
		System.out.println("The lights are off.");
		
		this.LightsOn=false;
	}
}
