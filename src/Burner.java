public class Burner {
	
	enum Temperature {
		ICECOLD,
		WARMINGUP,
		GETTINGHOT,
		FIREFIREFIRE
		
	}
	
	private Temperature myTemp;
	private Setting mySetting;
	private int clock;
	boolean fireCheck = false;
	private final static int TIME_LENGTH = 2;
	
	public Burner() {
		myTemp = Temperature.ICECOLD;
		mySetting = Setting.OFF;
	}
	
	public Temperature getMyTemp() {
		return myTemp;
	}
	
	public void addTemp() {
		clock = TIME_LENGTH;
		
		switch(mySetting) {
		
		case OFF:
			mySetting = Setting.LOWHEAT;
			break;
		
		case LOWHEAT:
			mySetting = Setting.MEDIUMHEAT;
			break;
			
		case MEDIUMHEAT:
			mySetting = Setting.HIGHHEAT;
			break;
			
		case HIGHHEAT:
			return;
		}
		return;
	}
	
	public void lowerTemp() {
		clock = TIME_LENGTH;
		
		switch(mySetting) {
		
		case OFF:
			return;
		
		case LOWHEAT:
			mySetting = Setting.OFF;
			break;
			
		case MEDIUMHEAT:
			mySetting = Setting.LOWHEAT;
			break;
			
		case HIGHHEAT:
			mySetting = Setting.MEDIUMHEAT;
			break;
		}
		return;
	}
	
	public void updateTemperature() {
		
	}
	
	public void displayTemperature() {
		
	}
	
	
}
