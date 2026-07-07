public class PolymorphismTest {

    public static void main(String[] args) {
        Person person1 = new CollegeStudent(
                "张三",
                20,
                "软件工程"
        );

        Person person2 = new Teacher(
                "王老师",
                35,
                "Java程序设计"
        );

        Person[] people = {person1, person2};

        for (int i = 0; i < people.length; i++) {
            people[i].introduce();
            System.out.println("----------------");
        }
    }
}