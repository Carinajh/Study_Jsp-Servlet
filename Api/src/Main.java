import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.random());
		
		Random rm =new Random();
		System.out.println(rm.nextInt(100));
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println(a);
	}

}
