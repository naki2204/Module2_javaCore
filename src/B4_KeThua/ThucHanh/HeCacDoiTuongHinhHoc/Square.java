package B4_KeThua.ThucHanh.HeCacDoiTuongHinhHoc;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side,side);
    }
    public double getSide(){
        return this.getWidth();
    }

    public void setSide(double side){
        this.setWidth(side);
        this.setLenght(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLenght(double side) {
        super.setLenght(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "+
                super.toString();
    }
}