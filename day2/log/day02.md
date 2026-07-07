# Day 02 学习记录

日期：2026-07-03 至 2026-07-07

## 今日目标

- 理解类与对象的关系
- 学习构造方法、封装和 `static`
- 理解继承、方法重写与多态
- 将面向对象知识应用到 CourseMind 题目模型

## 完成内容

### 类与对象

- 使用 `Student` 类描述学生的字段和行为
- 使用 `new Student(...)` 创建多个相互独立的对象
- 理解类是设计图，对象是根据类创建的具体实例
- 使用对象调用 `introduce()`、`isPassed()` 等方法

### 构造方法与 this

- 使用构造方法在创建对象时完成字段初始化
- 理解构造方法名称必须与类名相同，并且没有返回值
- 理解 `this.name` 表示当前对象的字段，`name` 表示传入的参数
- 理解构造方法参数按照位置和类型传递

### 封装

- 使用 `private` 限制外部直接访问字段
- 使用 getter读取字段
- 使用 setter校验并修改字段
- 在 `setCredit()` 和 `setJavaScore()` 中校验数据范围
- 理解 `private` 管访问权限，`static` 管成员归属

### static

- 使用静态字段统计创建的对象数量
- 理解普通字段属于对象，每个对象各有一份
- 理解静态字段属于类，所有对象共享一份
- 使用类名调用静态方法，例如 `Student.getStudentCount()`
- 初步理解 `main` 方法为什么是静态方法

### 对象数组

- 使用 `Course[]` 保存多个课程对象
- 使用循环统一输出课程信息
- 计算课程总学分
- 找出学分最高的课程对象

### 继承与方法重写

- 使用 `CollegeStudent extends Person` 表达继承关系
- 使用 `super(name, age)` 调用父类构造方法
- 使用 `@Override` 重写父类方法
- 使用 `super.introduce()` 复用父类实现
- 理解子类不能直接访问父类的 `private` 字段

### 多态

- 使用父类变量接收子类对象
- 使用 `Person[]` 同时保存学生和老师对象
- 理解调用重写方法时，会执行实际对象所属子类的版本
- 理解多态可以用统一流程处理不同类型的对象

### CourseMind题目模型

- 使用 `Question` 表示所有题型的共同部分
- 使用 `ChoiceQuestion` 表示选择题
- 使用 `TrueFalseQuestion` 表示判断题
- 不同题型分别实现自己的答案检查逻辑
- 使用 `Question[]` 统一保存和展示不同题型
- 使用静态字段统计题目总数

## 代码文件

### 学生与课程

- `Student.java`
- `StudentTest.java`
- `Course.java`
- `CourseTest.java`
- `CourseArrayTest.java`

### 继承与多态

- `Person.java`
- `CollegeStudent.java`
- `Teacher.java`
- `InheritanceTest.java`
- `PolymorphismTest.java`

### CourseMind题目模型

- `Question.java`
- `ChoiceQuestion.java`
- `TrueFalseQuestion.java`
- `QuestionTest.java`

## 重点理解

### 类与对象

```text
类：定义对象应该拥有哪些数据和行为
对象：根据类创建出来的具体实例
```

### 构造方法

```java
Student student = new Student("张三", 20, "软件工程", 85.5);
```

`new` 创建对象，随后自动调用构造方法完成初始化。

### 封装

```java
private double credit;

public void setCredit(double credit) {
    if (credit > 0 && credit <= 10) {
        this.credit = credit;
    }
}
```

字段不允许外部随意修改，必须经过类提供的方法和校验。

### static与private

```text
static：成员属于类还是对象
private：成员能否被类外部直接访问
```

两者可以同时使用：

```java
private static int questionCount = 0;
```

### 继承

```java
public class CollegeStudent extends Person {
}
```

子类继承父类的共同能力，再添加自己的字段和行为。

### 多态

```java
Person person = new CollegeStudent("张三", 20, "软件工程");
person.introduce();
```

变量类型是父类，实际对象是子类，调用重写方法时执行子类版本。

## 遇到的问题

- 创建多个 IDEA项目，产生嵌套目录和嵌套 Git仓库
- 构造方法参数类型不匹配，把整数年龄写成字符串
- 声明了对象但忘记调用它的方法输出结果
- 构造方法直接给字段赋值，绕过 setter校验
- 学分判断使用 `< 0`，意外允许了 `0` 学分
- 容易把 `private` 和 `static` 当作同一类概念
- 理解代码后仍无法完全从零默写，需要继续使用模板逐步脱离提示

## 学习方法调整

- 不要求立即默写整份代码
- 新语法的核心部分至少亲手写一次
- 可以参考已有类完成相似类，但要能解释每一部分
- 使用“看懂 → 仿写 → 修改 → 脱离提示复述”的方式巩固
- 每次只创建 Java类，不再为每个练习新建 IDEA项目或 Git仓库

## 当前掌握情况

- 能理解类、对象、字段、方法和构造方法
- 能参考模板编写简单实体类
- 能理解 getter、setter和数据校验的作用
- 能区分对象成员、静态成员和私有成员
- 能解释继承、重写和多态的基本运行过程
- 暂时仍需要参考模板编写完整继承结构，属于正常的基础巩固阶段

## 下一步

- 学习 `String` 常用方法
- 学习 `List`、`Map` 和 `Set`
- 使用集合管理学生、课程和题目对象
- 练习集合的新增、查询、修改、删除和遍历
- 继续使用 Git记录每日学习成果
