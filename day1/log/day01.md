# Day 01 学习记录

日期：2026-07-01 至 2026-07-03

## 今日目标

- 恢复 Java 基础语法
- 完成若干控制台练习
- 理解 Git 的基本工作流程
- 将本地代码提交并推送到 GitHub

## 完成内容

### Java 基础

- 复习变量与基本数据类型：`int`、`double`、`boolean`、`String`
- 使用 `if / else if / else` 完成成绩等级判断
- 使用 `Scanner` 接收控制台输入
- 使用 `for` 和 `while` 完成循环与累加
- 使用数组保存并遍历多条成绩数据
- 计算数组的总分、平均分、最高分、最低分和及格人数
- 编写 `getLevel(int score)` 方法，理解参数、返回值和方法调用

### 编程练习

- `Review01.java`：变量与输出
- `ScoreLevel.java`：成绩等级判断与控制台输入
- `NumberSum.java`：使用 `for` 计算数字总和
- `NumberSumWhile.java`：使用 `while` 校验输入并计算总和
- `ArrayStatistics.java`：数组统计
- `ScoreLevelMethod.java`：将成绩判断封装为方法

## 重点理解

### 数组下标

数组下标从 `0` 开始，最后一个下标是 `length - 1`：

```java
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

程序使用 `i` 访问数组，向用户显示编号时使用 `i + 1`。

### 整数除法

两个整数直接相除会丢失小数，需要先转换类型：

```java
double average = (double) sum / scores.length;
```

### 方法返回值

`String` 返回类型的方法必须返回字符串：

```java
public static String getLevel(int score) {
    return "优秀";
}
```

调用者需要接收返回结果：

```java
String level = getLevel(score);
```

### 变量作用域

在一对大括号中声明的变量，只能在对应的大括号范围内使用。

## 遇到的问题

- 错把 Java 代码写入 `.kt` 文件，导致 Kotlin 语法错误
- 混淆 `Javascore` 和 `javaScore`，认识到 Java 区分大小写
- `System.out.println` 少写 `.` 或字符串拼接少写 `+`
- 在 `else` 后错误添加条件
- 数组循环从 `1` 开始并使用 `<= length`，导致越界
- 忘记在循环中累加 `sum`
- 在 `else` 内声明 `sum` 后尝试在外部使用
- `String` 方法错误返回整数 `0`
- 只调用有返回值的方法，却没有接收返回结果

## Git 与 GitHub

完成了以下流程：

```text
修改文件 → git add → git commit → git push → GitHub
```

使用过的核心命令：

```bash
git status
git add <file>
git diff --staged
git commit -m "提交说明"
git remote add origin <仓库地址>
git push -u origin main
git log --oneline
```

GitHub 仓库：<https://github.com/3321793715-design/java-summer-practice>

已完成两次提交：

- `03c8269`：完成第一天 Java 基础练习
- `fc5ab68`：添加成绩等级方法练习

## 当前掌握情况

- 能看懂并修改基础 Java 控制台程序
- 能使用判断、循环和数组完成简单逻辑
- 初步理解方法的参数与返回值
- 能解释 `add`、`commit` 和 `push` 的区别
- 仍需通过重复练习巩固语法细节，减少大小写、括号、作用域和返回类型错误

## 下一步

- 复习类、对象、字段、构造方法和封装
- 继续练习字符串与数组
- 学习 `List`、`Map` 和 `Set`
- 每完成一个小功能后进行一次独立 Git 提交
