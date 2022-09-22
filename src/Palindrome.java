import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Check for Palindrome");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name ");

        String Nums = scanner.nextLine();  // Read user input
        System.out.println("Number is: " + Nums);  // Output user input

        int nmbr = Integer.parseInt(Nums);
        System.out.println(nmbr);
        int i;
        int temp = 0;
        i = checkForPalindrome(nmbr, temp);
        if(i==nmbr)
            System.out.println("Palindrome");
        else  System.out.println("Not a Palindrome");

    }

    public static int checkForPalindrome(int Pal, int temp) {
        if (Pal == 0)
            return temp;

        temp = temp * 10 + Pal % 10;
        Pal = Pal / 10;

        return checkForPalindrome(Pal, temp);

    }


}
