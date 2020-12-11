package test2;

public class testClass2 {
	private String carModel; 
	private String color;
	boolean isElectric;
	
	testClass2(String carModel, String color, boolean isElectric){
		this.carModel = carModel;
		this.color = color;
		this.isElectric = isElectric;	 
	}
	
	public String getCarModel() {
		return this.carModel;
	}
	
	public String getColor() {
		return this.color;
	}
	 
	public boolean getIsElectric() {
		return this.isElectric;
	}
}
