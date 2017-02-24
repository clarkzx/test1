package test1;

public class People {
	int hight;
	int weight;
	String name;
	//People()
	//{
		
	//}
	
	People(int hight, int weight)
	{
		System.out.println(hight);
		System.out.println(weight);
	//	super();
	//	this.hight = hight;
	//	this.weight = weight;
	};
	
	People(String name)
	{
		System.out.println(name);
	//	super();
	//	this.hight = hight;
	//	this.weight = weight;
	};
	
	public void run()
	{
		System.out.println(hight);
		System.out.println(weight);
		this.speak("Run!");
	};
	
	public void speak()
	{
		System.out.println(name);
	};

	public void speak(String say)
	{
		System.out.println(say);
	};
}
