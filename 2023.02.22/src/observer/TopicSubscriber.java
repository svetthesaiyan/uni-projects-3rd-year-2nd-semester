package observer;

public class TopicSubscriber implements Observer
{
	private String name;
	private Observable topic;

	public TopicSubscriber(String name)	{this.name=name;}

	@Override
	public void update() {System.out.println(this.name + ": Updated with: " + this.topic.getUpdate());}

	@Override
	public void setTopic(Observable topic) {this.topic=topic;}
}
