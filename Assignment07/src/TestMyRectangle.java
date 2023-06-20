
public class TestMyRectangle extends MyRectangle {
	public static void main(String[] args) {
		 
		 MyRectangle FR = new MyRectangle();
		 
		 FR.width = 4;
		 FR.height = 8 ;
		 FR.area = FR.width * FR.height ;
		 FR.perimeter = (FR.width + FR.height)*2;
		 System.out.println("The area of a rectangle with width "+ FR.width +" and height "+ FR.height +" is "+ FR.area);
		 System.out.println("The Perimeter of rectangle is "+ FR.perimeter);

		 
		 MyRectangle SR = new MyRectangle();
		 SR.width = 3.5;
		 SR.height = 35.9;
		 SR.area = SR.width * SR.height ;
		 SR.perimeter = (SR.width + SR.height)*2;
		 System.out.println("The area of a rectangle with width "+ SR.width +" and height "+ SR.height +" is " + SR.area);
		 System.out.println("The Perimeter of a rectangle is "+ SR.perimeter);
		 
		 FR.printRectangle();

		 }
}
