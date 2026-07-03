public class ArrayStatistics {
    public static void main(String[] args) {
        int[] scores = {79,77,98,88,100};

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + i + "个成绩是" + scores[i]);
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        System.out.println("平均分：" + average);
    }
}
