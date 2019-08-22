package level2;

public class Solution2_1 {
    public String solution(int n) {

        String answer = "";
        while(n>0){
            int a=n/3;
            int b=n%3;

            if(b==0){
                a=a-1;
                b=4;
            }
            answer+=String.valueOf(b);

            n=a;
        }
        StringBuilder sb = new StringBuilder(answer);
         
        answer=sb.reverse().toString();
        return answer;
    }
}
