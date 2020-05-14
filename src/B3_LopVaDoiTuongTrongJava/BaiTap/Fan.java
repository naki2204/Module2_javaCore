package B3_LopVaDoiTuongTrongJava.BaiTap;

public class Fan {
    final int Slow=1;
    final int Medium=2;
    final int Fast=3;
    private int sleep;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        sleep=Slow;
        on=false;
        radius=5;
        color="blue";
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
