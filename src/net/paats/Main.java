package net.paats;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long         value alway's ends with the character "L"
        // float        value alway's ends with the character "f"
        // double       value alway's ends with the character "d"
        // char         value alway's contains one character between singel quots:  'A' or '\u0A00' for unicode
        // boolean

        String myString = "This is a string";
        System.out.println("\nmyString is equil to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("\nmyString is now equil to " + myString);
        myString = myString + "  \u00A9 2015";
        System.out.println("En nog meer toegevoegde data " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("uitkomst nummer = " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("\nDe uitkomst is : " + lastString);

        double lastDouble = 120.47;
        lastString = lastString + lastDouble;
        System.out.println("\nNu de truuk met een Doubel : " + lastString);

    }
}
