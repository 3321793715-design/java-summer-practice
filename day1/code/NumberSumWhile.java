import java.util.Scanner;

public class NumberSumWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个正整数：");
        int num = sc.nextInt();

        // 输入无效时反复要求输入
        while (num <= 0) {
            System.out.print("输入无效，请重新输入：");
            num = sc.nextInt();
        }

        int sum = 0;
        int i = 1;

        // 计算1到num的总和
        while (i <= num) {
            sum += i;
            i++;
        }

        System.out.println("从1到" + num + "的总和是：" + sum);

        sc.close();
    }
}