public class CourseArrayTest {

    public static void main(String[] args) {
        Course[] courses = {
                new Course(1, "Java程序设计", "王老师", 4.0),
                new Course(2, "数据库原理", "李老师", 3.5),
                new Course(3, "计算机网络", "张老师", 3.0)
        };

        double totalCredit = 0;
        Course maxCreditCourse = courses[0];

        for (int i = 0; i < courses.length; i++) {
            Course currentCourse = courses[i];

            currentCourse.showInfo();
            System.out.println("----------------");

            totalCredit += currentCourse.getCredit();

            if (currentCourse.getCredit()
                    > maxCreditCourse.getCredit()) {
                maxCreditCourse = currentCourse;
            }
        }

        System.out.println("总学分：" + totalCredit);
        System.out.println(
                "最高学分课程：" + maxCreditCourse.getName()
        );
    }
}