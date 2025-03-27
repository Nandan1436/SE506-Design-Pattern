package factory_method;

public class createLaptop extends CreateDevice{

	@Override
	public Device createDevice(String modelName) {
		return new Laptop(modelName);
	}
	
}
