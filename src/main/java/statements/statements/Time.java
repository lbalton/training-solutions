package statements.statements;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinutes(){
        int hourInMinute = 60;
        return (hour * hourInMinute) + minute;
    }
    public int getInSecond(){
        int minuteInSecond = 60;
        return (getInMinutes() * minuteInSecond) + second;
    }
   public String toString(){
       return hour+" : " + minute + " : " + second;
   }


}
