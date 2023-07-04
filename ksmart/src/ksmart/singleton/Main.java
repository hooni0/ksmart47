package ksmart.singleton;

public class Main {
	
	public static void main(String[] arg) {
		/*
		Singleton single1 = new Singleton();
		Singleton single2 = new Singleton();
		System.out.println(single1 == single2); // false
		*/
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.println(single1 == single2); // true
		System.out.println(single1);
		System.out.println(single2);
	}
}
