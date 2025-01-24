

public class practice0124{
    public static void main(String[] args) {  
        practice0124 practice = new practice0124();  
        String s = "abcde";  
        System.out.println(practice.solution(s)); // 결과 출력  
    }
    public String solution(String s) {  
        char[] arr = s.toCharArray();  
        if (arr.length % 2 != 0) {  
            int mid = arr.length / 2;  
            return String.valueOf(arr[mid]); // 홀수 길이의 경우 중간 문자 반환  
        } else {  
            int mid1 = arr.length / 2 - 1;  
            int mid2 = mid1 + 1;  
            return String.valueOf(arr[mid1]) + String.valueOf(arr[mid2]); // 짝수 길이의 경우 두 중간 문자 반환  
        }  
    }
}