package pl.edu.pjwstk.zadanie4;

public class Time {
    private int hour;
    private int minutes;

    public Time(int hour, int minutes) {
        boolean exit = true;
        do{
            if(minutes >= 60){
                minutes = minutes - 60;
                hour++;
            }
            else exit = false;
        }while(exit);

        this.hour = hour;
        this.minutes = minutes;
    }

    public String toString(){
        return (this.hour + "h " + this.minutes + "min");
    }

    public Time addTime(int newHour, int newMinutes){
        return new Time(newHour + hour, newMinutes + minutes);
    }

    public void multiple(int multiple){
        this.hour = this.hour * multiple;
        this.minutes = this.minutes * multiple;
        boolean exit = true;
        do{
            if(minutes >= 60){
                this.minutes = minutes - 60;
                this.hour++;
            }
            else exit = false;
        }while(exit);
    }
}
