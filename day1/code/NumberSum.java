import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("成绩无效,请重新输入");

        }else{
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;

            }
            System.out.println("从1到" + num + "的总和是" + sum);
        }
        sc.close();



    }
}
