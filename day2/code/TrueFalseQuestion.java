public class TrueFalseQuestion extends Question {

    private boolean correctAnswer;

    public TrueFalseQuestion(
            String title,
            int score,
            boolean correctAnswer
    ) {
        super(title, score);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void showQuestion() {
        super.showQuestion();
        System.out.println("请回答：正确或错误");
    }

    public boolean checkAnswer(boolean answer) {
        return answer == correctAnswer;
    }
}