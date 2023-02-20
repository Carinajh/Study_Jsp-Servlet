package abstractTest;

public class High extends StarCar {
	
	private int tax = 1000;
	
	public High(String color,String tire,int displacement, String handle) {
		// TODO Auto-generated constructor stub
		super(color,tire,displacement,handle);
	}
	
	@Override
	public void getSpec() {
		// TODO Auto-generated method stub
		System.out.println("color : " + Color);
		System.out.println("tire  : " + tire);
		System.out.println("displ : " + displacement);
		System.out.println("handle: " + handle);
		
		if(displacement > 2000) {
			tax = 1500;
			System.out.println("tax  : "+tax);
		}
	}
}
