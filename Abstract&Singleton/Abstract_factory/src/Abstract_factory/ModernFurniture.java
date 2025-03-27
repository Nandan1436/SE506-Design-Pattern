package Abstract_factory;

public class ModernFurniture implements FurnitureFactory{
	private static ModernFurniture modernFurniture;
	private ModernFurniture() {
		
	}
	
	public static synchronized ModernFurniture getInstance() {
		if(modernFurniture==null) {
			modernFurniture=new ModernFurniture();
		}
		return modernFurniture;
	}
	
	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public Table createTable() {
		return new ModernTable();
	}

	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}

}
