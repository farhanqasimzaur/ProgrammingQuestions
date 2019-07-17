package designpattern;

public class Singleton {
	
	public int id;
	
	private static final Singleton instance = new Singleton();
	
	private Singleton(){
		this.id = 5;
	}
	
	public static  Singleton getInstance(){
		return instance;
	}

}
