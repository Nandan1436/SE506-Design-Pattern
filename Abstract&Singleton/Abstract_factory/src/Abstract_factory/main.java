package Abstract_factory;

public class main {

	public static void main(String[] args) {
		FurnitureFactory modernFactory=ModernFurniture.getInstance();
		Chair modernChair=modernFactory.createChair();
		modernChair.sitOnChair();
		
		FurnitureFactory victorianFactory=VictorianFurniture.getInstance();
		Sofa victorianSofa=victorianFactory.createSofa();
		victorianSofa.sitOnSofa();
		
	}

}
