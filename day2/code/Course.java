public class Course {

    private String name;
    private int id;
    private String teacher;
    private double credit;

    // 修改：参数顺序调整为 id、name、teacher、credit
    public Course(int id, String name, String teacher, double credit) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;

        // 修改：通过setCredit赋值，保证创建对象时也会校验学分
        setCredit(credit);
    }

    // 修改：方法名由introduce改为showInfo，更符合课程语义
    public void showInfo() {
        System.out.println("课程ID：" + id);

        // 修改：“姓名”改为“课程名称”
        System.out.println("课程名称：" + name);

        System.out.println("授课老师：" + teacher);
        System.out.println("学分：" + credit);
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        // 修改：使用<=，不允许学分等于0
        if (credit <= 0 || credit > 10) {
            System.out.println("学分必须大于0且不超过10");
        } else {
            this.credit = credit;
        }
    }
}