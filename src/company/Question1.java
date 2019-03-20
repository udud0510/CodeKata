package company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws FileNotFoundException {

        System.out.print("알파벳을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        // 경로 지정
        String inputFile = "C:\\Users\\user\\Desktop\\ScTest\\data";

        FileReader rw = null;
        BufferedReader br = null;
        String readLine = null;

        int allWordCnt = 0;            // 모든 단어의 수
        double xcnt = 0;        // 입력 단어의 수
        int allFileCount = 0;   // 문서 전체 개수
        int idfDown = 0;            // 단어를 포함한 문서 개수
        double idf = 0;      // IDF값

        List<Double> tfList = new ArrayList<Double>();
        List<String> fileName = new ArrayList<String>();

        // 해당 Path에 파일 유무 검사 if-else
        if (inputFile.isEmpty()) {
            System.out.println("There is nothing.");
        } else {
            for (File tempFile : new File(inputFile).listFiles()) {

                // 파일이 잘 들어오는지 검사 파일 이름 출력
                fileName.add(tempFile.getName());
                // 문서 전체 개수 카운트
                allFileCount++;

                rw = new FileReader(tempFile);
                br = new BufferedReader(rw);

                try {
                    while ((readLine = br.readLine()) != null) {

                        // 띄어쓰기로 잘라서 모든 단어의 개수 세어주기
                        allWordCnt = readLine.split(" ").length;
                        // 잘린 단어들은 answer배열에 저장
                        String[] splitArray = readLine.split(" ");

                        // 잘린 단어들이 사용자가 입력한 값과 같은지 비교
                        xcnt = isTF(x, allWordCnt, xcnt, tfList, splitArray);

                        // 카운트된 단어의 수가 0이 아니면 문서에 사용자가 입력한 값이 있다는 말
                        // 0이 아닐때마다 단어 포함 문서 값 카운트
                        if (xcnt != 0) {
                            idfDown++;
                        }
                        xcnt = 0;

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // IDF값 구해주기
            idf = Math.log10(1 + ((double) allFileCount / (double) idfDown));

            isAnswer(x, idf, tfList, fileName);

        }
    }

    private static double isTF(String x, int allWordCnt, double xcnt, List<Double> tfList, String[] splitArray) {
        for (int i = 0; i < allWordCnt; i++) {
            if (splitArray[i].equals(x)) {
                // 같으면 한 파일 내 입력 단어의 수 카운트
                xcnt++;
            }
        }

        // TF-IDF를 위해서 리스트에 TF값 저장
        tfList.add(xcnt / allWordCnt);
        return xcnt;
    }

    private static void isAnswer(String x, double idf, List<Double> tfList, List<String> fileName) {
        System.out.println(x + " 의 TF-IDF 스코어\n");

        // 최종 값 출력 소수점 4자리 이하 반올림

        String[] answer = new String[tfList.size()];

        for (int k = 0; k < tfList.size(); k++) {
            answer[k]=String.format("%.4f", idf * tfList.get(k));
            System.out.println(fileName.get(k) + " " + answer[k]);
        }
    }
}