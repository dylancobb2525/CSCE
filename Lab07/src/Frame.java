// Dylan Cobb
public class Frame {
    // Instance variables
    private double size;
    private String type;

    // Default values
    private static final double DEFAULT_SIZE = 18.5;
    private static final String DEFAULT_TYPE = "Diamond";

    // Valid types
    private static final String[] VALID_TYPES = {"Diamond", "Step-Through", "Truss", "Penny-Farthing"};

    // Default constructor
    public Frame() {
        this.size = DEFAULT_SIZE;
        this.type = DEFAULT_TYPE;
    }

 
    public Frame(double size, String type) {
        this.setSize(size);
        this.setType(type);
    }

    
    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

   
    public void setSize(double size) {
        if (size >= 18.5 && size <= 60) {
            this.size = size;
        } else {
            this.size = DEFAULT_SIZE;
        }
    }

    public void setType(String type) {
        for (String validType : VALID_TYPES) {
            if (validType.equalsIgnoreCase(type)) {
                this.type = validType;
                return;
            }
        }
        this.type = DEFAULT_TYPE;
    }

   
    public boolean equals(Frame other) {
        return this.size == other.size && this.type.equalsIgnoreCase(other.type);
    }

    // toString method
    public String toString() {
        return "[Frame] Size: " + size + " Type: " + type;
    }
}
