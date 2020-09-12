package Inflearn;

public class Solution1 {
    /*
        섬으로 향하라!
            '   + -- + - + -   '
            '   + --- + - +   '
            '   + -- + - + -   '
            '   + - + - + - +   '

            해(1)와 달(0),
            Code의 세상 안으로!(En-Coding)
    */
    public static void main(String[] args) {

        String[] question = new String[]{};
        question = new String[]{"+ -- + - + -", "+ --- + - +", "+ -- + - + -", "+ - + - + - +"};
        String answer = "";

        for (int i = 0; i < question.length; i++) {
            // 공백제거, +는 1로, -는 0으로 변환
            question[i] = question[i].replaceAll(" ", "").replaceAll("[+]", "1").replaceAll("[-]", "0");
            System.out.println(question[i]);
            // 2진수를 10진수로 변환 후 문자로 치환 (아스키코드)
            System.out.println((char) Integer.parseInt(question[i], 2));
            // 문자열로 출력
            answer += (char) Integer.parseInt(question[i], 2);
        }

        System.out.println("답: " + answer);
    }
}
