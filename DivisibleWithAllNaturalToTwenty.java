public class DivisibleWithAllNaturalToTwenty {
    public static void main(String[] args) {
        long c = 21;
        while (1 == 1) {
            boolean all = true;
            for (int i = 1; i < 21; i++) {
                all = true;
                if (c % i != 0) {
                    all = false;
                    break;
                }
            }
            if (all) {
                System.out.println(c);
                System.exit(0);
            }

            c++;
        }
    }
}
