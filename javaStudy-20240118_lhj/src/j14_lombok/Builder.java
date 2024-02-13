package j14_lombok;

public class Builder extends CarBuilder{
	
	@Override
	public CarBuilder color(String color) {
		// TODO Auto-generated method stub
		car.setCompany(color);
		return this;
	}
	
	@Override
	public CarBuilder model(String model) {
		// TODO Auto-generated method stub
		car.setModel(model);
		return this;
	}
	
	@Override
	public CarBuilder company(String company) {
		// TODO Auto-generated method stub
		car.setColor(company);
		return this;
	}

}
