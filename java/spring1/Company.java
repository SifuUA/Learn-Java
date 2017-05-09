package spring1;

public class Company {
	
	private Car car;
	private Human human;
	Company() {
		
	}
	public Company(Car car, Human human) {
		super();
		this.car = car;
		this.human = human;
	}
	

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}


	@Override
	public String toString() {
		return "Company [car=" + car + ", human=" + human + "]";
	}
	
}
