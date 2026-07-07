public class CollegeStudent extends Person {
    private String major;

    public CollegeStudent(String name, int age, String major) {
        super(name, age);
        this.major = major;

    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("专业: " + major);
    }
}
