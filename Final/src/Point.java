//saleh alobaylan 441102323
public class Point {

		private double x1;
		
		private double y1;
		
		private double x2;
		
		private double y2;
		
		
		// i generate those by source icon
		public double getX1() {
			return x1;
		}

		public void setX1(double x1) {
			this.x1 = x1;
		}


		public double getY1() {
			return y1;
		}


		public void setY1(double y1) {
			this.y1 = y1;
		}


		public double getX2() {
			return x2;
		}

		public void setX2(double x2) {
			this.x2 = x2;
		}

		public double getY2() {
			return y2;
		}

		public void setY2(double y2) {
			this.y2 = y2;
		}

		public double distance() {
			double y1 = Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2);
			double DistanceEquation = Math.pow( y1 ,0.5); 
			return DistanceEquation;
		
		
		
			
			
			
			
			
			

		}

	}
}
