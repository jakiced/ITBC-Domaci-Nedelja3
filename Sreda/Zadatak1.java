package Wk3.Sreda;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

    static int getNumberOfStrings(ArrayList<String> listOfStrings) {

        int strignCounter = 0;
        for (int i = 0; i < listOfStrings.size(); i++) {
            if (listOfStrings.get(i).length() > 2 && (listOfStrings.get(i).charAt(0) ==
                    listOfStrings.get(i).charAt(listOfStrings.get(i).length() - 1))) {
                strignCounter++;

            }
        }
        return strignCounter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();
        System.out.println("Unesi elemente liste, stop za kraj unosa: ");
        while (scanner.hasNextLine()) {

            String inputString = scanner.nextLine();
            if (inputString.equalsIgnoreCase("stop")) {
                break;
            }
            listOfStrings.add(inputString);
        }
        System.out.println(listOfStrings);

        System.out.println(getNumberOfStrings(listOfStrings));
    }
}
