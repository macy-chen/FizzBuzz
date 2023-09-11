public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 10; i++) {
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3 || multipleOf5) {
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
