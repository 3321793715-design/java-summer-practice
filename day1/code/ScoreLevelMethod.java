import java.util.Scanner;

public class ScoreLevelMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入成绩：");
        int score = sc.nextInt();

        String level = getLevel(score);
        System.out.println("成绩等级：" + level);

        sc.close();
    }

    public static String getLevel(int score) {
        if (score > 100 || score < 0) {
            return "成绩无效，请重新输入";
        } else if (score >= 80) {
            return "优秀";
        } else if (score >= 60) {
            return "及格";
        } else {
            return "不及格";
        }
    }
}