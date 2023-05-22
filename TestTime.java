public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(0, 0, 0);
        t1.setTime(21, 10, 15);
        Time t2 = new Time(0, 0, 0);
        t2.setHour(10);
        t2.setMinuet(20);
        t2.setSecond(25);
    
        t1.nextSecond();
        t2.previousSecond();

        System.out.println(t1);
        System.out.println(t2);
    }
   
}
