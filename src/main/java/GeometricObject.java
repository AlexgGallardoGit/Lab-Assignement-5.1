public class GeometricObject {
    //data attributes
    private String color;
    private boolean filled;

    //construct a default geometric object
    public GeometricObject() {
        color = "white";
        filled = false;
    }

    //construct a geometric object with the specified color and filled value
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Return color
    public String getColor() {
        return color;
    }

    //Set a new color
    public void setColor(String color) {
        this.color = color;
    }

    //Return filled. Since filled is boolean its get method is named isFilled
    public boolean isFilled() {
        return filled;
    }

    //Set a new filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "color: " + color + " filled: " + filled;
    }
}
