package pl.edu.pjwstk.zadanie1;

public class Person {

    private static final String EMPTY = "";

    private final String firstName;
    private final String lastName;
    private final String birthYear;

    public Person(final String firstName, final String lastName, final String birthYear) throws Exception {
        validationPersonalData(firstName, lastName, birthYear);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    private void validationPersonalData(final String firstName, final String lastName, final String birthYear) throws Exception {
        if (firstName == null || EMPTY.equals(firstName)){
            throw new Exception("First name is incorrect!");
        }
        if(lastName == null || EMPTY.equals(lastName)){
            throw new Exception("Last name is incorrect!");
        }
        int birthYearNumber = toInt(birthYear);
        if (birthYearNumber < 1900 || birthYearNumber > 2021){
            throw new Exception("Invalid date");
        }

    }

    private int toInt(final String value) throws Exception {
        try{
            return Integer.parseInt(value);
        }
        catch (final NumberFormatException e){
            throw new Exception("Invalid date");
        }
        finally {
            System.out.println("finally");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }
}
