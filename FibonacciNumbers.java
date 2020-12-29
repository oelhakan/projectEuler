public class FibonacciNumbers {
    public static void main(String[] args) {
        int evenSum = 0;
        long number1 = 0;
        long number2 = 1;
        long number3;
        System.out.println(number1);
        System.out.println(number2);
        while(true){
            number3 = number1 + number2;
            if(number3<4000000){
                System.out.println(number3);
                number1 = number2;
                number2 = number3;
                if(number3%2 == 0){
                    evenSum += number3;
                }
            }else break;
        }
        System.out.println("FINAL ANSWER : " + evenSum);
    }
}
