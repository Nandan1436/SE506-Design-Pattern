package Lab_03;

import java.util.Random;

public class Printer {
	private String departmentName;
	private Integer ID;
	public Printer(String departmentName) {
		this.departmentName=departmentName;
		Random rand= new Random();
		this.ID=rand.nextInt(20000);
	}
	public void printStr(String str) {
		System.out.println(str+", Printed by "+departmentName+" Printer " + ID);
		System.out.println();
	}
}
