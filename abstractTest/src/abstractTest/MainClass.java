package abstractTest;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarCar lg = new Low(Common.COLOR_BLUE, Common.HAND_NM, Common.DISP_2000, Common.TIRE_NM);
		StarCar hg = new High(Common.COLOR_RED, Common.HAND_PW, Common.DISP_2200, Common.TIRE_WD);
		
		lg.getSpec();
		hg.getSpec();
		
	}

}
