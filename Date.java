public class Date {
    //private instant varibales for date
    private int day;
    private int month;
    private int year;
// date constructor that accepts day,month,year
public Date(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
}
//returns the day
public int getday(){
    return day;
}
//method that returnsmonth
public int getmonth(){
    return month;
}

//returns the year
public int getyear(){
    return year;
}
//overwrites the day
public void setDay(int day) {
    this.day = day;
}
//overwrites the month
public void setMonth(int month) {
    this.month = month;
}
//overwrites the year
public void setYear(int year) {
    this.year = year;
}
//overwrites the date
public void setDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
}
//sets the date 
public String toString() {
    return String.format("%02d/%02d/%04d", day, month, year);
}
//formates date to a string
}

