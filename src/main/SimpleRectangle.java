package Rectangle.src.main;
//
public class SimpleRectangle {
    
    public static void main(String[] args) {
        // Create a default rectangle
		Rectangle rectangle1 = new Rectangle();

		// Create a Rectangle with width and height input
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		// Display the width, height, area, and perimeter of rectangle1
		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle1.width);
		System.out.println("Height:    " + rectangle1.height);
		System.out.println("Area:      " + rectangle1.getArea());
		System.out.println("Perimeter: " + rectangle1.getPerimeter());

		// Display the width, height, area, and perimeter of rectangle2
		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle2.width);
		System.out.println("Height:    " + rectangle2.height);
		System.out.println("Area:      " + rectangle2.getArea());
		System.out.println("Perimeter: " + rectangle2.getPerimeter());

        
    }
}

// Define the Rectangle class
class Rectangle {
	double width;	// Width of rectangle
	double height;	// Height of rectangle

	/** A no-arg constructor that creates a default rectangle */
	Rectangle() {
		width = 1;
		height = 1;
	}

	/** A constructor that creates a rectangle
	    with the specified width and height    */
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	/** Return the area of this rectangle */
	double getArea() {
		return width * height;
	}

	/** Return the perimeter of this rectangle */
	double getPerimeter() {
		return 2 * (width + height);
	}
}