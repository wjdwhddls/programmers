public class practice0122{
    public static void main(String args[]){
        int[] numbers = {1,2,3,4,6,7,8,0};
        practice0122 practice = new practice0122(); 
        int answer = practice.solution(numbers);
        System.out.println(answer);
    }
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        int answer = 45 - sum;
        return answer;
    }
}