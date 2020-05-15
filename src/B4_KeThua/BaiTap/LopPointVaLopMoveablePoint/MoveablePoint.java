package B4_KeThua.BaiTap.LopPointVaLopMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed(){
        float[] array=new float[2];
        array[0]=xSpeed;
        array[1]=ySpeed;
        return array;
    }

    @Override
    public String toString() {
       return "Speed: "+getSpeed()[0]+"  "+getSpeed()[1];
    }
    public MoveablePoint move(MoveablePoint moveablePoint) {
        moveablePoint.setX(super.getX()+this.getxSpeed());
        moveablePoint.setY(super.getY() + this.getySpeed());
        return moveablePoint;
    }
}
