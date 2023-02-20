package classTest;

public class MainClass {
	public static void main(String[] args) {
	
		ChildClass cc = new ChildClass();
		
		//cc.method1();
		//cc.method3();
		
		
		MyStore my = new MyStore();
		
		//my.menuA();
		Headquarter hq = new MyStore();
		
		hq.menuA();
		hq.menuB();
		hq.menuC();
		hq.menuD();
		hq.menuE();
		System.out.println("------------------------");
		my.menuA();
		my.menuB();
		my.menuC();
		my.menuD();
		my.menuE();
		
		
		
		
	}
}
