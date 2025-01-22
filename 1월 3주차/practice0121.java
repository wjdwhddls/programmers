
public class practice0121{
    public static void main(String args[]){
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};
        practice0121 practice = new practice0121(); 
        int answer = practice.solution(absolutes, signs); 
        System.out.println(answer);
    }
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int result = 0;
        for(int i = 0; i<absolutes.length; i++){
            if(signs[i] == true){
                result = absolutes[i];
            }
            else{
                result = -absolutes[i];
            }
            answer = answer + result;
        }
        return answer;

        
    }
}