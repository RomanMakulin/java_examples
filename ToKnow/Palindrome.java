public class Palindrome {
    public static void main(String[] args) {
        String str = "aaabaaa";
        System.out.println(palindromeCheck(str));
    }

    // Проверка на палиндром
    private static boolean palindromeCheck(String str) {
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }
}
