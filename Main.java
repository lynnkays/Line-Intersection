/*******************************************************************
* <Kaylynn Diaz-Schott>
*
*<Checks whether 2 lines cross each other or not>
*******************************************************************/
import java.util.*;

public class Main {
 public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	Point[] points = new Point[4];
	String input;
	
	//fill the rest of the array with the points (3,2), (0,4), and (1,6)
	points[0] = new Point(1,1);
	points[1] = new Point (3,2);
	points[2] = new Point (0,4);
	points[3] = new Point (1,6); 

  Line line1 = new Line(points[0], points[1]);
	Line line2 = new Line (points[2], points [3]);

	//Store the result in a boolean variable.
	boolean intersect = line1.intersects(line2);

	if (intersect == true){
		System.out.println("Lines intersect");
	} else {
		System.out.println("Lines do NOT intersect");
	}
	
	System.out.print("Enter in a new x1-value: ");
	input = s.nextLine();
	double pointx1 = Double.parseDouble(input);
	
	System.out.print("Enter in a new y1-value: ");
	input = s.nextLine();
	double pointy1 = Double.parseDouble(input);
	points[0] = new Point (pointx1, pointy1);
	
	System.out.print("Enter in a new x2-value: ");
	input = s.nextLine();
	double pointx2 = Double.parseDouble(input);
	
	System.out.print("Enter in a new y2-value: ");
	input = s.nextLine();
  s.close();
	double pointy2 = Double.parseDouble(input);
	points[1] = new Point (pointx2,pointy2);
	line1 = new Line(points[0], points[1]);
	
	line1.display();
	line2.display();

	intersect = line1.intersects(line2);

	if (intersect == true){
		System.out.println("Lines intersect");
	} else {
		System.out.println("Lines do NOT intersect");
	}
	} // end main
} // end class