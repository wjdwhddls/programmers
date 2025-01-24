public class practice0124_1{
    String s = "수박".repeat(5000);
    public static void main(String[] args) {
        practice0124_1 practice = new practice0124_1();
        System.out.println(practice.solution(4));
    }
    public String solution(int n) {

        return s.substring(0, n);
    }    
}
