public class Employee {
    private  String fullName;
    private  String position;
    private  int salary;
    private  int age;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String fullName, String position, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
