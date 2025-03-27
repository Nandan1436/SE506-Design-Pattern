package Abstract_factory;

public class RusticFurniture implements FurnitureFactory{
	private static RusticFurniture rusticFurniture;
	private RusticFurniture() {
		
	}
	
	public static synchronized RusticFurniture getInstance() {
		if(rusticFurniture==null) {
			rusticFurniture=new RusticFurniture();
		}
		return rusticFurniture;
	}
	
	@Override
	public Chair createChair() {
		return new RusticChair();
	}

	@Override
	public Table createTable() {
		return new RusticTable();
	}

	@Override
	public Sofa createSofa() {
		return new RusticSofa();
	}

}
