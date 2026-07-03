import java.util.Scanner;

public class ScoreLevel {
    public static void main(String[] args) {
        System.out.println("请输入成绩");
        Scanner sc = new Scanner(System.in);
        int javaScore = sc.nextInt();
        if (javaScore >100 || javaScore < 0){
            System.out.println("成绩不合格,请重新输入");
        }else if (javaScore >= 90) {
            System.out.println("优秀");
        }else if (javaScore >= 80) {
            System.out.println("良好");
        }else if (javaScore >= 70) {
            System.out.println("一般");
        }else if (javaScore >= 60) {
            System.out.println("及格");
        }else  {
            System.out.println("不及格");
        }

    }
}
