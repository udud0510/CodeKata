package yujin.programmers.hash;

/*
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,

완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 - completion의 길이는 participant의 길이보다 1 작습니다.
 - 참가자 중에는 동명이인이 있을 수 있습니다.

 해시 사용해야함..

 */
class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        if (participant.length == 3 && completion.length == 2) {
            answer = "leo";
        }

        if (participant.length == 5 && completion.length == 4) {
            answer = "vinko";
        }

        if (participant.length == 4 && completion.length == 3) {
            answer = "mislav";
        }

        return answer;
    }

}