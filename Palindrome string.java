import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println(palindrome("madam", 0));
    }
    
    public static boolean palindrome(String str, int current) {
        if(current > str.length()/2)
            return true;
        if(str.charAt(current) != str.charAt(str.length() - current - 1))
            return false;
        return palindrome(str, current + 1);
    }
}
