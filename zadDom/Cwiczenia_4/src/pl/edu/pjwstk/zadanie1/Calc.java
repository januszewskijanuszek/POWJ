package pl.edu.pjwstk.zadanie1;

public class Calc {
    private int first;
    private int second;

    public Calc(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int sum(){
        return this.first + this.second;
    }

    public int difference(){
        return this.first - this.second;
    }

    public int times(){
        return this.first * this.second;
    }

    public void dev(){
        if(this.second == 0){
            System.out.print("Nie można dzielić przez 0!");
        }
        else{
            if(this.first % this.second == 0){
                System.out.print(this.first / this.second);
            }
            else{
                for(;;) {
                    if (first(this.second)) {
                        System.out.print(this.first + "/" + this.second);
                        break;
                    }
                    else if(first(this.first) && this.second % this.first != 0){
                        System.out.print(this.first + "/" + this.second);
                        break;
                    }
                    else{
                        for(int i = 1 ; i < this.second ; i++){
                            if(this.second % i == 0 && this.first % i == 0){
                                this.first /= i;
                                this.second /= i;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean first(int input){
        for(int i = 2 ; i < (input+2)/2 ; i++){
            if(input % i == 0){
                return false;
            }
        }
        return true;
    }
}
