package pl.edu.pjwstk.zadanie3;

public class MyDate {
    private final int day;
    private final int month;
    private final int year;

    public MyDate(int day, int month, int year) {
        if(day < 1 || day > 31){ this.day = 1;}
        else this.day = day;
        if(month < 1 || month > 13){ this.month = 1;}
        else this.month = month;
        this.year = Math.max(year, 0);
    }

    // Version a
    //public String toString(){
    //    return (day + "." + month + "." + year);
    //}

    // Version b
    //public String toString(){
    //    boolean day0 = false;
    //    boolean month0 = false;
    //    if(this.day / 10 == 0){ day0 = true;}
    //    if(this.month / 10 == 0){ month0 = true;}
    //    if(day0 && month0){
    //        return ("0" + day + "." + "0" + month + "." + year);
    //    }
    //    if(day0){
    //        return ("0" + day + "." + month + "." + year);
    //    }
    //    if(month0){
    //        return (day + "." + "0" + month + "." + year);
    //    }
    //    else{
    //        return (day + "." + month + "." + year);
    //    }
    //}

    // Version c
    public String toString(){
        String monthText;
        switch(this.month){
            case 1:{ monthText = "sty"; break;}
            case 2:{ monthText = "lut"; break;}
            case 3:{ monthText = "marz"; break;}
            case 4:{ monthText = "kwi"; break;}
            case 5:{ monthText = "maj"; break;}
            case 6:{ monthText = "czer"; break;}
            case 7:{ monthText = "lip"; break;}
            case 8:{ monthText = "sier"; break;}
            case 9:{ monthText = "wrz"; break;}
            case 10:{ monthText = "paź"; break;}
            case 11:{ monthText = "lis"; break;}
            case 12:{ monthText = "gru"; break;}
            default:
                throw new IllegalStateException("Unexpected value: " + this.month);
        }
        return (day + "." + monthText + "." + year);
    }
}
