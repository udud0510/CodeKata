package company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Question3 {

    @SuppressWarnings({ "unlikely-arg-type", "rawtypes", "resource" })
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        String inputFile = "C:\\Users\\user\\Desktop\\ScTest\\data";

        System.out.print("문서 이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String sampleText = sc.next();
        System.out.print(sampleText + " -> ");

        FileReader rw = null;
        BufferedReader br = null;
        String readLine = null;

        // map 안에 data가 들어갈것이다.
        HashMap<Character, Integer> data = null;
        HashMap<String, HashMap<Character, Integer>> map = new HashMap<>();
        // 정렬해서 정답 출력하기 위해 선언
        HashMap<String, String> realAnswer = new HashMap<>();

        // 해당 Path에 파일 유무 검사 if-else
        if (inputFile.isEmpty()) {
            System.out.println("There is nothing.");
        } else {
            for (File tempFile : new File(inputFile).listFiles()) {
                data = new HashMap<>();

                // 특성벡터 구성
               isVector(data, map, tempFile);
            }

            for (String key : map.keySet()) {

                if (!key.equals(sampleText)) {
                    double answer2 = cosineSimilarity(map.get(key), map.get(sampleText));
                    // 반올림하여 저장
                    realAnswer.put(key, String.format("%.4f", answer2));

                }
            }

            //정렬해서 출력
            for (Object o : sortByValue(realAnswer)) {
                String temp = (String) o;
                System.out.print(temp + " : " + realAnswer.get(temp) + " ");
            }

        }

    }

    // 특성벡터 구성
    private static void isVector(HashMap<Character, Integer> data, HashMap<String, HashMap<Character, Integer>> map, File tempFile) throws IOException {
        FileReader rw;
        BufferedReader br;
        String readLine;

        // 모든 알파벳을 기준으로 특성벡터에 0을 저장
        for (int i = 65; i < 91; i++) {
            data.put((char) i, 0);
        }

        rw = new FileReader(tempFile);
        br = new BufferedReader(rw);

        while ((readLine = br.readLine()) != null) {
            readLine=readLine.replace(" ", "");
            char[] process = readLine.toCharArray();
            for (char process1 : process) {
                if (!data.equals(process1)) {
                    // 파일에 있는 단어이면 특성벡터에 1을 저장
                    data.put(process1, 1);
                }
            }
            map.put(tempFile.getName(), data);
        }
    }

    // 코사인 유사도
    private static double cosineSimilarity(HashMap<Character, Integer> hashMap, HashMap<Character, Integer> hashMap2) {
        double deno = 0.0;
        double mol1 = 0.0;
        double mol2 = 0.0;

        for (Character key : hashMap.keySet()) {

            deno = deno + (double)(hashMap.get(key) * hashMap2.get(key));
            mol1 = mol1 + (double)(Math.pow(hashMap.get(key), 2));
            mol2 = mol2 + (double)(Math.pow(hashMap2.get(key), 2));

        }

        return (double)deno / (Math.sqrt(mol1) * Math.sqrt(mol2));
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static List sortByValue(final HashMap map) {

        List<String> list = new ArrayList(map.keySet());
        list.sort((Comparator) (o1, o2) -> {
            Object v1 = map.get(o1);
            Object v2 = map.get(o2);
            return ((Comparable) v2).compareTo(v1);
        });
        return list;
    }
}