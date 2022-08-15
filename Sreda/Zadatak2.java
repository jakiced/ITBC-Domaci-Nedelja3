package Wk3.Sreda;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

    static boolean isOneElementSame(ArrayList<String> listOne, ArrayList<String> listTwo) {

        for (var s : listOne) {
            for (var s2 : listTwo) {
                if (s.equals(s2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();

        System.out.println("Unesi elemente za prvu listu, ''next'' za dalje: ");
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.startsWith("next")) {
                break;
            }
            listOne.add(input);
        }

        System.out.println("Unesi elemente druge liste, ''stop'' za kraj: ");
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.startsWith("stop")) {
                break;
            }
            listTwo.add(input);
        }
        System.out.println("---------------------------------");
        System.out.println(isOneElementSame(listOne, listTwo));
    }
}
