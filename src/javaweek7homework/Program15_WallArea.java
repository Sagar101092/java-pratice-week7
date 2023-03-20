package javaweek7homework;

/**
 * Wall Area
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 */
public class Program15_WallArea {
    double width = 0.0;//Declare Instance variable
    double height = 0.0;//Declare Instance variable

    // Declare parameterized constructor
    public Program15_WallArea(double widthCon, double heightCon) {
        this.width = widthCon;
        this.height = heightCon;
    }

    // Main method
    public static void main(String[] args) {

        Program15_WallArea wall = new Program15_WallArea(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    /**
     * This method is used to get width
     *
     * @return
     */
    public double getWidth() {
        return width;
    }

    /**
     * This method is used to get Height
     *
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * This method is used to Set width
     *
     * @param width1
     */
    public void setWidth(double width1) {
        if (width1 < 0) {
            width = 0.0;
        } else {

            width = width1;
        }
    }

    /**
     * This method is used to set Height
     *
     * @param height1
     */
    public void setHeight(double height1) {
        if (height1 < 0) {
            height = 0.0;
        } else {

            height = height1;
        }
    }

    /**
     * This method is use to get the value of area
     *
     * @return
     */
    public double getArea() {
        double area = width * height;
        return area;
    }
}
