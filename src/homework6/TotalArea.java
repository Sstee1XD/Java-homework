package homework6;

public class TotalArea {

	public static void main(String[] args) {
		// Declare circleArray
		CircleWithPrivateDataFields[] circleArray;
		
		// Create circleArray
		circleArray = createCircleArray();
		
		// print circleArray and total areas of the circles
		printCIrcleArray(circleArray);
	}


	/* Create an array of CIrcle objects */
	private static CircleWithPrivateDataFields[] createCircleArray() {
		CircleWithPrivateDataFields[] circleArray =
		  new CircleWithPrivateDataFields[5];
		for (int i = 0; i < circleArray.length; ++i) {
			circleArray[i] = 
			  new CircleWithPrivateDataFields(Math.random() * 100);
		}
		// Return Circle array
		return circleArray;
	}
	
	/* Print an array of circles and their total area */
	private static void printCIrcleArray(CircleWithPrivateDataFields[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0; i < circleArray.length; ++i) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
			  circleArray[i].getArea());
		}
		
		System.out.println("--------------------------------------------");
		
		// Compute and display the result
		System.out.printf("%-30s%-15f\n", "The total area of circles is",
		  sum(circleArray));
	}

	/* Add circle areas */
	private static double sum(CircleWithPrivateDataFields[] circleArray) {
		// Initialize sum
		double sum = 0;
		
		// Add areas to sum
		for (int i = 0; i < circleArray.length; ++i) {
			sum += circleArray[i].getArea();
		}
		return sum;
	}
	

}
