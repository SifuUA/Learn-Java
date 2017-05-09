package spring1;

public class Car {

	private String marka;

	Car() {
		
	}
	public Car(String marka) {
		super();
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Override
	public String toString() {
		return "Car [marka=" + marka + "]";
	}
	

	

	
	
	
}
