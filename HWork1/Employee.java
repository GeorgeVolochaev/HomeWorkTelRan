public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private double salary;
    private int age;

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
