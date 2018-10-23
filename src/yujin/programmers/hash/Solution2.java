package yujin.programmers.hash;

/*
        전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
        전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

        구조대 : 119
        박준영 : 97 674 223
        지영석 : 11 9552 4421
        전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
        어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

        제한 사항
        phone_book의 길이는 1 이상 1,000,000 이하입니다.
        각 전화번호의 길이는 1 이상 20 이하입니다.

        입출력 예제
        phone_book	                    return
        [119, 97674223, 1195524421]	    false
        [123,456,789]	                true
        [12,123,1235,567,88]	        false
        */
import java.util.Arrays;

public class Solution2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        // 1. 배열을 정렬한다.
        // 2. 정렬된 배열의 앞문자만 비교해서 있으면 false 없으면 true
        //  - 자바 String 문법 공부

        Arrays.sort(phone_book);

        for(int i=0;i<phone_book.length;i++){
            for(int j=1;j<phone_book.length;j++){
                if(phone_book[j].startsWith(phone_book[i])==true) {
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    }

}
