// Dylan Cobb
public class Wheel {
    // Instance variables
    private double diameter;
    private double width;

    // Default values
    private static final double DEFAULT_DIAMETER = 16.0;
    private static final double DEFAULT_WIDTH = 1.0;

    // Default constructor
    public Wheel() {
        this.diameter = DEFAULT_DIAMETER;
        this.width = DEFAULT_WIDTH;
    }

    
    public Wheel(double diameter, double width) {
        this.setDiameter(diameter);
        this.setWidth(width);
    }

   
    public double getDiameter() {
        return diameter;
    }

    public double getWidth() {
        return width;
    }

    // Mutators
    public void setDiameter(double diameter) {
        if (diameter >= 16 && diameter <= 55) {
            this.diameter = diameter;
        } else {
            this.diameter = DEFAULT_DIAMETER;
        }
    }

    public void setWidth(double width) {
        if (width >= 1 && width <= 2.5) {
            this.width = width;
        } else {
            this.width = DEFAULT_WIDTH;
        }
    }

    // Equals method
    public boolean equals(Wheel other) {
        return this.diameter == other.diameter && this.width == other.width;
    }

    // toString method
    public String toString() {
        return "[Wheel] Diameter: " + diameter + " Width: " + width;
    }
}
