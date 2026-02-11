public class prac0211_4 {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
    
        String a = my_string.substring(0,s);
        String b = my_string.substring(s + overwrite_string.length());
        
        answer = a + overwrite_string + b;
        return answer;
        
      
    }

    public static void main(String[] args){
        String c = solution("he11oworld" , "lloworl" ,2);
        System.out.println(c);
    }

}
