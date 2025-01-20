import java.util.ArrayList;
import java.util.Arrays;

public class practice0120 {  
    public static void main(String[] args) {  
        int[] arr = {5, 9, 7, 10};  
        int divisor = 5;  
        practice0120 obj = new practice0120();  
        int[] result = obj.solution(arr, divisor);  
        System.out.println(Arrays.toString(result));  
    }  

    public int[] solution(int[] arr, int divisor) {  
        ArrayList<Integer> list = new ArrayList<>();  

        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] % divisor == 0) {  
                list.add(arr[i]);  
            }  
        }  

        if (list.isEmpty()) {  
            return new int[]{-1};  
        }  
  
        int[] result = new int[list.size()];  
        for (int i = 0; i < list.size(); i++) {  
            result[i] = list.get(i);  
        }  
        Arrays.sort(result);
        return result;  
    }  
}