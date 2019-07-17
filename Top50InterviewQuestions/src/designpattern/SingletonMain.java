package designpattern;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj = Singleton.getInstance();
		System.out.println(obj.id);
		obj.id=9;
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj2.id);
	}

}
