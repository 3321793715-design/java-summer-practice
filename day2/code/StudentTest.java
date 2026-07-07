public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student(
                "张三",
                20,
                "软件工程",
                85.5
        );

        Student student2 = new Student(
                "李四",
                19,
                "计算机科学",
                55
        );

        Student student3 = new Student(
                "王五",
                18,
                "网络安全",
                98
        );

        student1.introduce();
        System.out.println("是否及格：" + student1.isPassed());

        System.out.println("----------------");

        student2.introduce();
        System.out.println("是否及格：" + student2.isPassed());

        System.out.println("----------------");

        student3.introduce();
        System.out.println("是否及格：" + student3.isPassed());

        System.out.println("----------------");

        System.out.println("学生姓名：" + student3.getName());

        student3.setJavaScore(59);

        System.out.println(
                "修改后成绩：" + student3.getJavaScore()
        );
        System.out.println(
                "修改后是否及格：" + student3.isPassed()
        );

        student3.setJavaScore(200);
    }
}