public class Palindrome3DigitProduct {
    public static boolean isPalindrome(long number){
        long reverse =0;
        long initialNumber = number;
        while(number != 0) {
            reverse = reverse*10;
            reverse = reverse + number%10;
            number = number/10;
        }
        if (reverse == initialNumber) {
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        long maxPalindrome = 0;
        for(int i = 999; i>=100; i--){
            for(int j = 999; j>=100; j--){
                long product = i*j;
                if(isPalindrome(product) && product>= maxPalindrome){
                    maxPalindrome = product;
                }else continue;
            }
        }
        System.out.println(maxPalindrome);
    }
}
