public class helloworld {
	
	
	public static void main(String[] args) {
	
		double pole;
		Triangle trojkat = new Triangle(1,2,3,4,5,6);
		
		System.out.print("Boki w kolejno�ci: ");
		trojkat.boki(2,4,3);
		pole = trojkat.pole(3,4,5);
		System.out.println("Pole tr�jk�ta: " + pole);
		System.out.print("Czy tr�jk�t prostok�tny: ");
		if(trojkat.czyProstokatny(3, 4, 5)) {
			System.out.println("Tak");			
		}
		else {System.out.println("Nie");}
		System.out.print("Czy tr�jk�t rozwartok�tny: ");
		if(trojkat.czyRozwartokatny(20, 40, 9)) {
			System.out.println("Tak");			
		}
		else {System.out.println("Nie");}
		
	}
}
