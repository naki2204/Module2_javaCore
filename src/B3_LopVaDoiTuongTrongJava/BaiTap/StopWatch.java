package B3_LopVaDoiTuongTrongJava.BaiTap;

import java.util.Date;

public class StopWatch {
    private Date startTime,endTime;

    public StopWatch() {
        this.startTime=new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public Date start(){
        return this.startTime=new Date();
    }
    public Date stop(){
        return this.endTime=new Date();
    }
    public long getElapsedTime(){
        return (this.getStartTime().getTime()-this.getEndTime().getTime());
    }
}
