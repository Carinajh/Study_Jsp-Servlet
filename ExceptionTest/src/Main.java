import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 0;
		
		
		
//		try {
//			System.out.println(i+j);
//			System.out.println(i-j);
//			System.out.println(i/j);
//			System.out.println(i*j);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("exception!");
//		} finally {
//			System.out.println("jyoukennnasijikkou");
//		}
		
		//ThrowExClass th = new ThrowExClass();
		
		ArrayList<String>  str = new ArrayList<String>();
		str.add("str1");
		str.add("str2");
		str.add("str3");
		str.add("str4");
		str.add("str5");
		
		System.out.println(str.toString());
		System.out.println(str.get(0));
		System.out.println(str.set(2, "@@@@"));
		System.out.println(str.toString());
		System.out.println(str.size());
		str.clear();
		System.out.println(str.toString());
		str = null;
		System.out.println(str);
		System.out.println(str.size());
		
	}

}
