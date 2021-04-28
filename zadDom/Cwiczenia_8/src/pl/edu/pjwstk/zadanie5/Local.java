package pl.edu.pjwstk.zadanie5;

public class Local {
    // Enums
    private static String SPACE = " ";
    private static String EMPTY = "";
    private static String DOT = ",";

    // attributes
    private final String name;
    private String city;
    private String postalCode;
    private String street;
    private String houseNumber;

    public Local(String name, String adders) {
        this.name = name;
        String[] arrayString = adders.split(" ");
        boolean state1 = true;
        boolean state2 = true;
        for(int i = 0 ; i < arrayString.length ; i++){
            if(i == 0)
                this.street = arrayString[i];
            else if(!isNumber(arrayString[i].charAt(0)) && state1){
                this.street = this.street + SPACE + arrayString[i];
            }
            else if(isNumber(arrayString[i].charAt(1)) && state2){
                this.houseNumber = arrayString[i].replace(DOT, EMPTY);
                state1 = false;
                state2 = false;
            }
            else if(i == arrayString.length - 1){
                this.city = arrayString[i];
            }
            else{
                this.postalCode = arrayString[i];
            }
        }

    }
    private boolean isNumber(char stringNum) {
        try {
            double buffer = Double.parseDouble(String.valueOf(stringNum));
        } catch (NumberFormatException exp) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name + " \n"
                + "City: " + city + "\n"
                + "PostalCode: " + postalCode + "\n"
                + "Street: " + street + "\n"
                + "House/Local: " + houseNumber;
    }
}
