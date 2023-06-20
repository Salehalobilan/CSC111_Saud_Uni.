//Saleh ALobilan 441102323
public class Ball {
	private double x,y;
	private double distTravledX,distTravledY;
	private double totDistXAllBalls, totDistYAllBalls, LastX, LastY;
	
	public double getTotDistXAllBalls() {
		return totDistXAllBalls;
	}

	public double getTotDistYAllBalls() {
		return totDistYAllBalls;
	}

	public Ball() {
		x = 0; y = 0 ; distTravledX = 0; distTravledY = 0;
	}
	
	public Ball(double newX, double newY) {
		x = newY; y = newY ; distTravledX = 0; distTravledY = 0;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getDistTravledX() {
		return distTravledX;
	}
	public double getDistTravledY() {
		return distTravledY;
	}
	
	public void move(double xDisp, double yDisp) {
		if(!(x + xDisp == LastX && y + yDisp == LastY)) {
		
		x += xDisp;
		y += yDisp;
		LastX = x;
		LastY = y;
		
		distTravledX += Math.abs(xDisp);
		distTravledY += Math.abs(yDisp);
		totDistXAllBalls += Math.abs(xDisp);
		totDistYAllBalls += Math.abs(yDisp);
		}
	}
	
	public String toString() {
		return "Ball @ (" + x +", " + y + ")";
	}
	
} //Sorry i didn't continue there is too much pressure on us we have to start studying there is no time for labs :(
