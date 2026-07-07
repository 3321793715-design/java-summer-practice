public class CourseTest {

    public static void main(String[] args) {
        Course course1 = new Course(
                1,
                "Java程序设计",
                "王老师",
                4.0
        );

        Course course2 = new Course(
                2,
                "数据库原理",
                "李老师",
                3.5
        );

        course1.showInfo();

        System.out.println("----------------");

        course2.showInfo();

        System.out.println("----------------");

        course1.setCredit(4.5);

        System.out.println("课程名称：" + course1.getName());
        System.out.println("修改后学分：" + course1.getCredit());

        System.out.println("----------------");

        course1.setCredit(20);

        System.out.println("当前学分：" + course1.getCredit());
    }
}