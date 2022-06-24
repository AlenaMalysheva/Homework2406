import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String str = scanner.nextLine();
        System.out.println(reverseString(str));
        isPalindrome(str); // task 4
    }

    /**
     * Write method that checks whether a given string is a palindrome.
     * A palindrome is a phrase that reads the same from the front and the back.
     */
    //Метод находит строку в обратную сторону
    private static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; --i) { // i = str.length() - 1 ,потому что индексы элементов начинаются с 0.
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
    // Метод сравнивает начальную и перевернутую строки и возвращает true or false
    private static Boolean isPalindrome(String str) {
        if (str.equals(reverseString(str))) { // Метод equals() — сравнивает строку с указанным объектом.
            System.out.println(str.equals(reverseString(str)) + "\n it's palindrom");
        } else {
            System.out.println(str.equals(reverseString(str)) + "\n it's not palindrom");
        }
        return str.equals(reverseString(str));
    }
}
