package test1;

public class Go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People Jerry = new People(180,80);
		Jerry.run();
		People Tom = new People("Tom");
		Tom.speak();
		Tom.speak("Hello");
		Woman Sophia = new Woman();
		Bird Yanzi1 = new Yanzi(); 
		Bird Yingwu2 = new Yingwu();
		Sophia.listen(Yanzi1);
		Sophia.listen(Yingwu2);
	}

}
