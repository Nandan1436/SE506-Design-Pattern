package factory_method;

public class createTablet extends CreateDevice{

	@Override
	public Device createDevice(String modelName) {
		return new Tablet(modelName);
	}
	
}
