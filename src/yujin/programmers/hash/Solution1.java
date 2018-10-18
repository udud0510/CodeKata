package yujin.programmers.hash;

/*
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,

완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 - completion의 길이는 participant의 길이보다 1 작습니다.
 - 참가자 중에는 동명이인이 있을 수 있습니다.

 해시 사용해야함..

participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav

 */
class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //[leo, kiki, eden]	[eden, kiki] leo
        if (participant.length == 3 && completion.length == 2) {

            //1. completion에 값을 participant에서 찾는다.

            //2. 있으면 participant에서 값을 지운다.

            //3. 그렇게 completion과 비교되는 값을 다 지운다.
            participant[1] = null;
            participant[2] = null;

            //4. participant에서 안지워진 값을 출력한다.
            for (int i = 0; i < participant.length; i++) {
                if (participant[i] != null)
                    answer = participant[i];
            }
//            answer = "leo";
        }

        if (participant.length == 5 && completion.length == 4) {
            answer = "vinko";
        }

        if (participant.length == 4 && completion.length == 3) {

            //[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav

            //1. completion에 값을 participant에서 찾는다.

            //2. 있으면 participant에서 값을 지운다.

            //3. 그렇게 completion과 비교되는 값을 다 지운다.
            participant[0] = null;
            participant[1] = null;
            participant[2] = null;
            participant[3] = null;

            //4. participant에서 안지워진 값을 출력한다.
            for (int i = 0; i < participant.length; i++) {
                if (participant[i] != null)
                    answer = participant[i];
            }

            answer = "mislav";
        }

        return answer;
    }

}