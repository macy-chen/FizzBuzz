public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int counter = 0;
        while (i > 0){
            if (i % 2 == 0){
                i /= 2;
            }
            else{
                i -= 1;
            }
            counter ++;
        }
        System.out.println(counter);
    }
}
