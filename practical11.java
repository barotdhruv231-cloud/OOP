public class Time {
    private int hours;
    private int minutes;
    
    public void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }
    
    public void displayTime() {
        System.out.println("Time: " + hours + " hours and " + minutes + " minutes");
    }
    
    public void addTime(Time t1, Time t2) {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours;
        
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }
    
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.setTime(2, 45);
        
        Time time2 = new Time();
        time2.setTime(3, 30);
        
        Time result = new Time();
        result.addTime(time1, time2);
        
        System.out.print("Time 1: ");
        time1.displayTime();
        
        System.out.print("Time 2: ");
        time2.displayTime();
        
        System.out.print("Sum: ");
        result.displayTime();
    }
}