public class QuestionTest {

    public static void main(String[] args) {
        String[] options = {
                "A. Python",
                "B. Java",
                "C. HTML",
                "D. CSS"
        };

        ChoiceQuestion choiceQuestion = new ChoiceQuestion(
                "下面哪一种是后端编程语言？",
                10,
                options,
                "B"
        );

        TrueFalseQuestion trueFalseQuestion =
                new TrueFalseQuestion(
                        "Java是一种面向对象语言",
                        5,
                        true
                );

        Question[] questions = {
                choiceQuestion,
                trueFalseQuestion
        };

        for (int i = 0; i < questions.length; i++) {
            questions[i].showQuestion();
            System.out.println("----------------");
        }

        boolean choiceResult =
                choiceQuestion.checkAnswer("B");

        boolean trueFalseResult =
                trueFalseQuestion.checkAnswer(true);

        System.out.println("选择题回答是否正确：" + choiceResult);
        System.out.println("判断题回答是否正确：" + trueFalseResult);

        System.out.println(
                "题目总数：" + Question.getQuestionCount()
        );
    }
}