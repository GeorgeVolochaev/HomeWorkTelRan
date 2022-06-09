class Employee {
    protected String fullName;
    protected String position;
    protected String email;
    protected String telephone;
    protected double salary;
    protected int age;

    Employee(String fullName, String position, String email, String telephone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    void print(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return fullName + ", " + position + ", " + email + ", " +  telephone + ", " + salary +  ", " + age;
    }






}
