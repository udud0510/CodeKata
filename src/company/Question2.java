package company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Question2 {

    @SuppressWarnings({ "resource", "rawtypes" })
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        String inputFile = "C:\\Users\\user\\Desktop\\ScTest\\data";

        System.out.print("알파벳을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(x + " 입력");

        System.out.print("윈도우 사이즈를 입력하세요 : ");
        Scanner sc2 = new Scanner(System.in);
        int window = sc2.nextInt();
        System.out.println(window + " 입력");

        FileReader rw = null;
        BufferedReader br = null;
        String readLine = null;

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // 정렬해서 정답 출력하기 위해 선언
        HashMap<String, Integer> realAnswer = new HashMap<String, Integer>();

        // 해당 Path에 파일 유무 검사 if
        if (inputFile.isEmpty()) {
            System.out.println("There is nothing.");
        }

        for (File tempFile : new File(inputFile).listFiles()) {

            rw = new FileReader(tempFile);
            br = new BufferedReader(rw);

            try {
                while ((readLine = br.readLine()) != null) {

                    // 잘린 단어들은 answer배열에 저장
                    String[] answer = readLine.split(" ");

                    // 잘린 단어들중 사용자가 입력한 값과 같은지 비교
                    isCount(x, window, map, answer);
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            Iterator<String> keySetIterator = map.keySet().iterator();

            System.out.print(x + " -> ");

            while (keySetIterator.hasNext()) {
                String key = keySetIterator.next();
                realAnswer.put(key, map.get(key));
            }

            for (Object o : sortByValue(realAnswer)) {
                String temp = (String) o;
                System.out.print(temp + " : " + realAnswer.get(temp) + " ");
            }
            System.out.print("\n");

        }

    }

    private static void isCount(String x, int window, HashMap<String, Integer> map, String[] answer) {
        for (int alphaIndex = 0; alphaIndex < answer.length; alphaIndex++) {

            // 잘린 단어들중 사용자가 입력한 값과 같은지 비교
            if (answer[alphaIndex].equals(x)) {
                // 뒤부터 같은 단어 수 카운트
                countBack(window, map, answer, alphaIndex);
                // 앞부터 같은 단어 수 카운트
                countFront(window, map, answer, alphaIndex);
            }
        }
    }

    // 앞부터 같은 단어 수 카운트
    private static void countFront(int window, HashMap<String, Integer> map, String[] answer, int alphaIndex) {
        if (alphaIndex > window) {
            for (int j = alphaIndex - window; j <= alphaIndex - 1; j++) {
                if (map.containsKey(answer[j])) {
                    map.put(answer[j], map.get(answer[j]) + 1);
                } else {
                    map.put(answer[j], 1);
                }
            }

        } else {
            for (int j = 0; j <= alphaIndex - 1; j++) {
                if (map.containsKey(answer[j])) {
                    map.put(answer[j], map.get(answer[j]) + 1);
                } else {
                    map.put(answer[j], 1);
                }
            }
        }
    }

    // 뒤부터 같은 단어 수 카운트
    private static void countBack(int window, HashMap<String, Integer> map, String[] answer, int alphaIndex) {
        if (alphaIndex + window < answer.length) {
            for (int j = alphaIndex + 1; j <= alphaIndex + window; j++) {
                if (map.containsKey(answer[j])) {
                    map.put(answer[j], map.get(answer[j]) + 1);
                } else {
                    map.put(answer[j], 1);
                }
            }
        }
        // 현재 인덱스가 너무 뒤에 있어서 윈도우가 넘어갈 수 없을때
        else {
            for (int j = alphaIndex + 1; j < answer.length; j++) {
                if (map.containsKey(answer[j])) {
                    map.put(answer[j], map.get(answer[j]) + 1);
                } else {
                    map.put(answer[j], 1);
                }
            }
        }
    }

    // 정렬
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static List sortByValue(final HashMap map) {

        List<String> list = new ArrayList();

        list.addAll(map.keySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {

                Object v1 = map.get(o1);

                Object v2 = map.get(o2);
                return ((Comparable) v2).compareTo(v1);

            }
        });
        return list;
    }
}