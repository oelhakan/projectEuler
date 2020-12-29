public class SumThreeOrFive {
        public static void main(String[] args) {
            int sumOfAll = 0;
            for(int i = 1; i<1000; i++){
                if((i%3 == 0) || (i%5 == 0)){
                    sumOfAll += i;
                }
            }
            System.out.println(sumOfAll);
        }
    }

