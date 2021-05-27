package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

        System.out.println();
        System.out.println(String.format("The lottery ticket numbers are %d, %d, %d, %d, %d, and %d.",
                ticket[0], ticket[1], ticket[2], ticket[3], ticket[4], ticket[5]));
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i=0; i < LENGTH; i++) {
            int randomNumber;

            /*
            Generate random number then search to make sure it doesn't
            already exist in the array. If it does, regenerate and search again.
            */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER + 1);
            } while(search(ticket, randomNumber));

            // Number is unique if we get this far. Add it to the array:
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value.
     * @param array (the Array this is being searched)
     * @param numberToSearchFor (the Value to search for)
     * @return (true if the Value is found, false if not)
     */
    public static boolean search(int[] array, int numberToSearchFor) {
        // Enhanced loop:
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        // This only happens if the for loop doesn't ever find the value
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor) {
        // Sort the array first:
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void printTicket(int ticket[]) {
        for (int i=0; i<ticket.length; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }

}
