
public class ThrowExClass {
	public ThrowExClass() {
		// TODO Auto-generated constructor stub
		actionC();
	}
	
	private void actionA() throws Exception{
		// TODO Auto-generated method stub
		System.err.println("actionA S");
		
		int a[] = {1,2,3,4};
		System.out.println(a[4]);
		
		System.out.println("actionA E");
	}
	
	private void actionB() {
		// TODO Auto-generated method stub
		System.err.println("actionB S");
		
		try {
			actionA();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception process");
			System.out.println(e.getMessage());
		}	
		System.out.println("actionB E");
	}
	
	private void actionC() {
		// TODO Auto-generated method stub
		System.err.println("actionC S");
		
		actionB();
			
		System.out.println("actionC E"); 
	}
}
