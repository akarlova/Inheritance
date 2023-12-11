package app.view;

import java.util.Locale;
import java.util.Scanner;

public class AppView {
    Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Enter your bet, please");
        String bet = scanner.nextLine().trim();
        System.out.println("Enter your number from 1 to 21");
        String userNum = scanner.nextLine().trim();
        scanner.close();
        return new String[]{bet, userNum};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
