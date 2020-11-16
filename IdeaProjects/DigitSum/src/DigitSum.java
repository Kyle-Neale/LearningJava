public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sumDigits(100));
    }
    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
