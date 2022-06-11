public class HWork1 {
    public static void main(String[] args) {
        int i = 5;

        Employee[] perArray = new Employee[i];
        perArray[0] = new Employee("Ivanov Ivan Ivanovich","Engineer", "ivan@gmail.com",
                "+7-900-83-16",30000.00, 41);
        perArray[1] = new Employee("Petrov Petr Petrovich","Engineer1", "petr@gmail.com",
                "+7-111-15-18",20000.00, 35);
        perArray[2] = new Employee("Cidorov Sergey Ivanovich","Engineer2", "sergey@gmail.com",
                "+7-222-17-19",40000.00, 45);
        perArray[3] = new Employee("Cergeev Dmitriy Ivanovich","Engineer3", "dmitr@gmail.com",
                "+7-555-19-18",50000.00, 20);
        perArray[4] = new Employee("Plotov Dmitriy Ivanovich","Engineer4", "dmit@gmail.com",
                "+7-888-88-11",60000.00, 40);

        for (int j = 0; j < i; j++) {
            if (perArray[j].getAge()>40) System.out.println(perArray[j]);
        }
    }
}
