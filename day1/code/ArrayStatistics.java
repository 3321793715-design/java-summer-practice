public class ArrayStatistics {
    public static void main(String[] args) {
        int[] scores = {79,77,98,88,100};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int passCount = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个成绩是：" + scores[i]);
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }

            if (scores[i] >= 60) {
                passCount++;
            }
        }
        double average = (double) sum / scores.length;
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + average);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("及格人数：" + passCount);
    }
}
