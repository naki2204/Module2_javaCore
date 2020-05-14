package B3_KeThua.BaiTap.LopCircleVaLopCylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return getRadius()*2*3.14*height;
    }

    public double getVolume(){
        return getRadius()*getRadius()*3.14*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "radius"+getRadius()+
                "color"+getColor()+
                '}';
    }
}
