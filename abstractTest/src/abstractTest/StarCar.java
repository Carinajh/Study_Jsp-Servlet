package abstractTest;

public abstract class StarCar {
	public String Color;
	public String tire;
	public int displacement;
	public String handle;
	
	public StarCar(String color,String tire,int displacement, String handle) {
		this.Color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
	}
	
	public abstract void getSpec();
}
