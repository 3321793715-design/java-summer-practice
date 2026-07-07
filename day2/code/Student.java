public class Student {

    private String name;
    private int age;
    private String major;
    private double javaScore;

    public Student(
            String name,
            int age,
            String major,
            double javaScore
    ) {
        this.name = name;
        this.age = age;
        this.major = major;
        setJavaScore(javaScore);
    }

    public void introduce() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("专业：" + major);
        System.out.println("Java成绩：" + javaScore);
    }

    public boolean isPassed() {
        return javaScore >= 60;
    }

    public String getName() {
        return name;
    }

    public double getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(double javaScore) {
        if (javaScore >= 0 && javaScore <= 100) {
            this.javaScore = javaScore;
        } else {
            System.out.println("成绩必须在0到100之间");
        }
    }
}