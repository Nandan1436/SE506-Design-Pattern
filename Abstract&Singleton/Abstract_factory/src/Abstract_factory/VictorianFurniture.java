package Abstract_factory;

public class VictorianFurniture implements FurnitureFactory{
	private static VictorianFurniture victorianFurniture;
	private VictorianFurniture() {
		
	}
	
	public static synchronized VictorianFurniture getInstance() {
		if(victorianFurniture==null) {
			victorianFurniture=new VictorianFurniture();
		}
		return victorianFurniture;
	}
	
	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Table createTable() {
		return new VictorianTable();
	}

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

}
