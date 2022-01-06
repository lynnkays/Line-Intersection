import java.text.*;
public class Line {
	private Point p1, p2;
	private double slope;
	private double y_intercept;
	
	DecimalFormat df = new DecimalFormat("##.00");

	public Line(Point first, Point second) {
		Point p1 = first;
		Point p2 = second;
		slope = (second.getY()- first.getY())/(second.getX()- first.getX()); 
			
		y_intercept = p1.getY()- slope * p1.getX();
	
	} 

	public void display() {
		System.out.println("y = " + df.format(slope) + "x + " + df.format(y_intercept));
	}

	public boolean intersects(Line another) {
		if (slope != another.slope){
			return true;
		}
		else if (slope == another.slope && y_intercept == another.y_intercept){
			return true;
		} else {
			return false;
		}
	} 
}