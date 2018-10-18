package yujin.programmers.hash;

import java.util.HashMap;
import java.util.Map;

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

        Map<String, Integer> pMap = new HashMap<>();

        for (String key : participant) {
            if (pMap.containsKey(key)) {
                pMap.put(key, pMap.get(key) + 1);
            } else { //동명이인이 없으면
                pMap.put(key, 1); //1추가
            }
        }

        for (String key : completion) {
            if (pMap.containsKey(key)) {
                pMap.put(key, pMap.get(key) - 1);
            }

        }

        for (String key : pMap.keySet()) {
            if (pMap.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }

}