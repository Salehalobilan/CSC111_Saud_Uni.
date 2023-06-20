//441102323
//Saleh ALobaylan
public class Convert2while {

	public static void main(String[] args) {
		
		int price, width = 11;
		
		while (width <=20) {
			int length = 5;
			while (length <= 25) {
				
				price = width * length * 19;
				System.out.print("  " + price);
				length+= 5;
			}
			
			System.out.println("");
			width++;
		}

	}

}
