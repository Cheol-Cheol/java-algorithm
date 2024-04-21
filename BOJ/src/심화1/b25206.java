package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double scoreSum = 0;
        for (int i = 0; i < 20; i++) {
            String[] subject = br.readLine().split(" ");
            double score = Double.parseDouble(subject[1]);
            double grade = gradeToScore(subject[2]);

            if (!subject[2].equals("P")) {
                sum += score * grade;
                scoreSum += score;
            }
        }
        System.out.printf("%.6f\n", sum / scoreSum);
        br.close();
    }

    public static double gradeToScore(String grade) {
        double score;
        switch (grade) {
            case "A+":
                score = 4.5;
                break;
            case "A0":
                score = 4.0;
                break;
            case "B+":
                score = 3.5;
                break;
            case "B0":
                score = 3.0;
                break;
            case "C+":
                score = 2.5;
                break;
            case "C0":
                score = 2.0;
                break;
            case "D+":
                score = 1.5;
                break;
            case "D0":
                score = 1.0;
                break;
            case "F":
            default:
                score = 0.0;
        }
        return score;
    }
}
