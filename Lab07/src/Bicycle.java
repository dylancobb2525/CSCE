// Dylan Cobb
public class Bicycle {
    // Instance variables
    private String make;
    private Wheel frontWheel;
    private Wheel backWheel;
    private Frame frame;

    // Default values
    private static final String DEFAULT_MAKE = "none";

    // Default constructor
    public Bicycle() {
        this.make = DEFAULT_MAKE;
        this.frontWheel = new Wheel();
        this.backWheel = new Wheel();
        this.frame = new Frame();
    }

  
    public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) {
        this.setMake(make);
        this.setFrontWheel(frontWheel);
        this.setBackWheel(backWheel);
        this.setFrame(frame);
    }

  
    public String getMake() {
        return make;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public Frame getFrame() {
        return frame;
    }

    
    public void setMake(String make) {
        if (make != null && !make.isEmpty()) {
            this.make = make;
        } else {
            this.make = DEFAULT_MAKE;
        }
    }

    public void setFrontWheel(Wheel frontWheel) {
        this.frontWheel = frontWheel != null ? frontWheel : new Wheel();
    }

    public void setBackWheel(Wheel backWheel) {
        this.backWheel = backWheel != null ? backWheel : new Wheel();
    }

    public void setFrame(Frame frame) {
        this.frame = frame != null ? frame : new Frame();
    }

    // Equals method
    public boolean equals(Bicycle other) {
        return this.make.equalsIgnoreCase(other.make) &&
               this.frontWheel.equals(other.frontWheel) &&
               this.backWheel.equals(other.backWheel) &&
               this.frame.equals(other.frame);
    }

    // toString method
    public String toString() {
        return "[Bicycle] Make: " + make + " Front Wheel: " + frontWheel +
               " Back Wheel: " + backWheel + " Frame: " + frame;
    }
}
