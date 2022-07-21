public class Employee {
    private final String fullName;
    private final String position;
    private final String email;
    private final String telephone;
    private final double salary;
    private final int age;

    Employee(String fullName, String position, String email, String telephone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return fullName + ", " + position + ", " + email + ", " +  telephone + ", " + salary +  ", " + age;
    }
}
