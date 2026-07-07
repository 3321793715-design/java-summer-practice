public class Question {

    private String title;
    private int score;

    private static int questionCount = 0;

    public Question(String title, int score) {
        this.title = title;
        setScore(score);
        questionCount++;
    }

    public String getTitle() {
        return title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score <= 0 || score > 100) {
            System.out.println("题目分值必须大于0且不超过100");
        } else {
            this.score = score;
        }
    }

    public void showQuestion() {
        System.out.println("题目：" + title);
        System.out.println("分值：" + score);
    }

    public static int getQuestionCount() {
        return questionCount;
    }
}