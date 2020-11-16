import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arrNumbs = new int[] { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(twoSum(arrNumbs, 7)));
    }

    public static int[] twoSum(int[] numbs, int target) {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target) {
                    return new int[] {i, j} ;
                }
            }
        }
        return new int[] { -1 };
    }

}
