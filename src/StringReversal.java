import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String userInput = "";
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text you want to reverse:");
        userInput = scanner.nextLine();

        String newString = reversal(userInput);
        
        scanner.close();

        System.out.println("Reversed string: " + newString);
    
    }
    
    private static String reversal(String x){
        char[] charArray = x.toCharArray(); //Converts string to array of characters

            //Code for string reversal using for loop and arrays
            for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
            return new String(charArray); //Converts array of characters back to string
        }


}
