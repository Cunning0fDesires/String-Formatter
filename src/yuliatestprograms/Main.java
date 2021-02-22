package yuliatestprograms;

import java.util.Scanner;

public class Main {

    public static String Formatting (String [] input, int limit) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            count += (input[i] + " ").length();
            result.append(input[i] + " ");
            if (i == input.length - 1) break;
            if (count + input[i + 1].length() > limit) {
                count = 0;
                result.append("\n");
                continue;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your string to format?");
        String userInput = sc.nextLine();
        System.out.println("What's your limit?");
        int userLimit = sc.nextInt();
        String[] userInputArr = userInput.split(" ", 0);
        System.out.println(Formatting(userInputArr, userLimit));
    }
}
