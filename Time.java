public class Time {
    private int hour;
    private int minuet;
    private int second;
//private instant variables for time 
    public Time(int hour, int minuet, int second){
        this.hour = hour;
        this.minuet = minuet; 
        this.second = second;
    }
//public varible for time

public int getHour() {
    return hour;
}
//gets the hour

public int getMinuet() {
    return minuet;
}
//gets the minuet
public int getSecond() {
    return second;
}
//gets the second

public void setHour(int hour) {
    this.hour = hour;
}
//overwrites the hour

public void setMinuet(int minuet) {
    this.minuet = minuet;
}
//overwrites the minuet

public void setSecond(int second) {
    this.second = second;
}
//overwrites the second

public void setTime(int hour, int minuet, int second){
    this.hour = hour;
    this.minuet = minuet;
    this.second = second;
}
//sets the time 
//sets time to a string 
public String toString() {
    return String.format("%02d:%02d:%02d", hour, minuet, second);
}
//gives the next second 
public Time nextSecond() {
    this.second = (this.second + 1) % 60;
    if (this.second == 0) {
        this.minuet = (this.minuet + 1) % 60;
        if (this.minuet == 0) {
            this.hour = (this.hour + 1) % 24;
        }
    }
    return this;
}
//gives previous second
public Time previousSecond() {
    this.second = (this.second - 1) % 60;
    if (this.second == 0) {
        this.minuet = (this.minuet - 1) % 60;
        if (this.minuet == 0) {
            this.hour = (this.hour - 1) % 24;
        }
    }
    return this;
}}





