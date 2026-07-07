public class ChoiceQuestion extends Question {

    private String[] options;
    private String correctAnswer;

    public ChoiceQuestion(
            String title,
            int score,
            String[] options,
            String correctAnswer
    ) {
        super(title, score);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void showQuestion() {
        super.showQuestion();

        System.out.println("选项：");

        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }
    }

    public boolean checkAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}