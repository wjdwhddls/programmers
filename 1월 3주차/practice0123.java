
import java.util.ArrayList;
import java.util.Arrays;

public class practice0123 {

    public static void main(String args[]) {
        int[] arr = {10};
        practice0123 practice = new practice0123();
        int[] answer = practice.solution(arr);
        System.out.println(Arrays.toString(answer));

    }

    public int[] solution(int[] arr) {
        int min = arr[0];
        if (arr.length == 1) {
            return new int[]{-1};
        }
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
