package Wk3.Sreda;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {

    static String getRandomString(ArrayList<String> stringList) {
        Random r = new Random();
        int randomString = r.nextInt(stringList.size());

        return stringList.get(randomString);
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi clanove niza, 'end' za kraj unosa: ");
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.startsWith("end"))
                break;
            stringList.add(input);
        }
        System.out.println("Random string je: " + getRandomString(stringList));
    }
}
