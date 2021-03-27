package pl.edu.pjwstk.zadanie3;

public class Main {
    private static void clearScreen() {
        System. out. print("\033[H\033[2J");
        System. out. flush();
    }

    public static void main(String[] args)  {
        // Uznałem że ciekawiej będzie wprowadzić enum z programami
        // Bo co to za telewizor co programów nie wyswietla

        Remote pilot = new Remote();

        boolean switchInterface = true;
        do {
            if(!pilot.isOn()){
                clearScreen();
                pilot.switchPower(pilot.isOn());
            }
            else{
                clearScreen();
                if (switchInterface){
                    pilot.tv.interFace();
                }
                switchInterface = false;
                pilot.switchRemote();
            }
        }while(pilot.isOn());
        System.out.println("To jest tenmoment gdy gaśnie dioda na telewizorze");
    }
}
