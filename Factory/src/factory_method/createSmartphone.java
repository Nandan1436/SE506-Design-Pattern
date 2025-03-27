package factory_method;

public class createSmartphone extends CreateDevice{
	@Override
	public Device createDevice(String modelName) {
		return new Smartphone(modelName);
	}

}
