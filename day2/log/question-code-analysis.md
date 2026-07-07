# CourseMind 题目类代码解析

本文解析以下三个类：

- `ChoiceQuestion`：选择题子类
- `TrueFalseQuestion`：判断题子类
- `QuestionTest`：测试类

它们都依赖父类 `Question`。整体关系如下：

```text
Question
├── ChoiceQuestion
└── TrueFalseQuestion

QuestionTest负责创建对象并测试功能
```

## 一、ChoiceQuestion：选择题子类

### 1. 继承父类

```java
public class ChoiceQuestion extends Question {
```

`extends Question` 表示 `ChoiceQuestion` 是 `Question` 的子类。

它能够继承父类提供的公开方法，例如：

```java
getTitle()
getScore()
showQuestion()
```

同时，选择题还可以增加自己独有的数据和行为。

### 2. 选择题独有字段

```java
private String[] options;
private String correctAnswer;
```

- `options` 保存多个选项，例如 A、B、C、D。
- `correctAnswer` 保存正确答案，例如 `"B"`。
- 两个字段都使用 `private`，外部不能随意直接修改。

### 3. 构造方法

```java
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
```

创建选择题时需要提供题目、分值、选项和正确答案。

```java
super(title, score);
```

调用父类 `Question` 的构造方法，由父类初始化题目标题和分值。

```java
this.options = options;
this.correctAnswer = correctAnswer;
```

由子类初始化选择题独有的选项和正确答案。

对象的初始化顺序是：

```text
先初始化Question父类部分
→ 再初始化ChoiceQuestion子类部分
→ 对象创建完成
```

### 4. 方法重写

```java
@Override
public void showQuestion() {
    super.showQuestion();

    System.out.println("选项：");

    for (int i = 0; i < options.length; i++) {
        System.out.println(options[i]);
    }
}
```

`@Override` 表示子类重写父类的 `showQuestion()` 方法。

```java
super.showQuestion();
```

先调用父类方法，输出所有题型共有的信息：

```text
题目标题
题目分值
```

随后使用循环输出选择题独有的选项。

因此选择题调用 `showQuestion()` 时，既会显示父类信息，也会显示选项。

### 5. 检查答案

```java
public boolean checkAnswer(String answer) {
    return correctAnswer.equalsIgnoreCase(answer);
}
```

该方法接收用户答案并返回判断结果。

```java
equalsIgnoreCase()
```

用于忽略英文字母大小写进行比较：

```text
正确答案为B，用户输入B → true
正确答案为B，用户输入b → true
正确答案为B，用户输入A → false
```

## 二、TrueFalseQuestion：判断题子类

### 1. 继承关系

```java
public class TrueFalseQuestion extends Question {
```

`TrueFalseQuestion` 也是 `Question` 的子类，因此它与选择题拥有相同的父类。

### 2. 判断题独有字段

```java
private boolean correctAnswer;
```

判断题答案只有两种：

```text
true  → 正确
false → 错误
```

因此使用 `boolean` 保存正确答案。

### 3. 构造方法

```java
public TrueFalseQuestion(
        String title,
        int score,
        boolean correctAnswer
) {
    super(title, score);
    this.correctAnswer = correctAnswer;
}
```

父类负责初始化标题和分值，子类负责保存判断题答案。

### 4. 重写题目展示方法

```java
@Override
public void showQuestion() {
    super.showQuestion();
    System.out.println("请回答：正确或错误");
}
```

判断题不需要输出 A、B、C、D 选项，而是输出判断题提示。

这说明不同子类可以重写同一个父类方法，提供各自不同的行为。

### 5. 检查答案

```java
public boolean checkAnswer(boolean answer) {
    return answer == correctAnswer;
}
```

将用户提交的布尔值与正确答案比较：

```text
两者相同 → true
两者不同 → false
```

## 三、QuestionTest：测试类

### 1. 创建选项数组

```java
String[] options = {
        "A. Python",
        "B. Java",
        "C. HTML",
        "D. CSS"
};
```

数组中的每个元素代表一个选择题选项。该数组随后会传给选择题构造方法。

### 2. 创建选择题对象

```java
ChoiceQuestion choiceQuestion = new ChoiceQuestion(
        "下面哪一种是后端编程语言？",
        10,
        options,
        "B"
);
```

构造方法的参数依次是：

```text
题目标题
题目分值
选项数组
正确答案
```

### 3. 创建判断题对象

```java
TrueFalseQuestion trueFalseQuestion =
        new TrueFalseQuestion(
                "Java是一种面向对象语言",
                5,
                true
        );
```

其中 `true` 表示这道判断题的正确答案是“正确”。

### 4. 使用父类数组保存不同子类

```java
Question[] questions = {
        choiceQuestion,
        trueFalseQuestion
};
```

虽然数组类型是 `Question[]`，但其中可以保存：

```text
ChoiceQuestion对象
TrueFalseQuestion对象
```

原因是两个子类都属于 `Question`。

这体现了多态：父类类型可以接收不同的子类对象。

### 5. 多态调用

```java
for (int i = 0; i < questions.length; i++) {
    questions[i].showQuestion();
    System.out.println("----------------");
}
```

循环中的调用代码完全相同：

```java
questions[i].showQuestion();
```

但是实际执行的方法由对象的真实类型决定：

```text
对象是ChoiceQuestion
→ 执行ChoiceQuestion.showQuestion()

对象是TrueFalseQuestion
→ 执行TrueFalseQuestion.showQuestion()
```

这就是多态的核心价值：调用者面向统一的父类编程，不必为每一种子类重复编写调用流程。

### 6. 检查答案

```java
boolean choiceResult =
        choiceQuestion.checkAnswer("B");

boolean trueFalseResult =
        trueFalseQuestion.checkAnswer(true);
```

选择题和判断题的答案类型不同，因此它们分别使用自己的 `checkAnswer()` 方法。

### 7. static统计题目总数

```java
System.out.println(
        "题目总数：" + Question.getQuestionCount()
);
```

`questionCount` 属于 `Question` 类，所有题目对象共享一份。

每创建一个选择题或判断题，都会先调用父类构造方法，因此总数都会增加。

创建两个题目对象后：

```text
Question.getQuestionCount() → 2
```

## 四、完整执行流程

```text
创建ChoiceQuestion
→ 调用Question构造方法
→ questionCount加1
→ 保存选项和正确答案

创建TrueFalseQuestion
→ 调用Question构造方法
→ questionCount再加1
→ 保存判断题答案

把两个对象放入Question数组
→ 循环调用showQuestion()
→ 根据真实对象类型执行对应的重写方法
→ 分别检查选择题和判断题答案
→ 输出题目总数2
```

## 五、需要掌握的结论

1. `extends` 表示子类继承父类。
2. `super(...)` 调用父类构造方法。
3. `@Override` 表示重写父类方法。
4. `super.showQuestion()` 调用父类原来的实现。
5. 父类数组可以保存不同子类对象。
6. 调用重写方法时，执行实际对象所属子类的版本。
7. 子类可以拥有父类没有的字段和方法。
8. `static` 字段属于类，所有父类和子类对象共享。

一句话总结：

> `Question` 定义所有题目的共同部分，选择题和判断题通过继承增加各自特点，再通过多态被统一管理。
