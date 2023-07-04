package ksmart.singleton;

// 객체를 딱 한번만 생성하는 클래스
public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton() {}
	
	// synchronized -> 스레드
	// 비동기 통신을 동기적으로 만들기 위함
	// 처음 실행 하는 작업을 보장하기 위해서 잠금
	public static synchronized Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
