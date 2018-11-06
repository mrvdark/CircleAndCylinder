

public class Cylinder extends Circle{
    protected double heigh;

    public Cylinder() {
        super();
        heigh=1;
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double heigh, double radius, String color) {
        super(radius, color);
        this.heigh = heigh;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    @Override
    public String toString() {
        return "A Cylinder radius = "+radius+", heigh = "+heigh+", color "+color; //To change body of generated methods, choose Tools | Templates.
    }


}