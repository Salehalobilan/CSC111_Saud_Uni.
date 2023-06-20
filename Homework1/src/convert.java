//441102323
//Saleh ALobaylan
public class convert {

	public static void main(String[] args) {
		
		int price;
		
		for (int width = 11; width <=20; width++) {
			
			for (int length = 5; length <=25; length+=5) {
				
				price = width * length * 19;
				System.out.print("  " + price);
							
			}
			
			System.out.println("");
		    		
		}
		
	}

}
