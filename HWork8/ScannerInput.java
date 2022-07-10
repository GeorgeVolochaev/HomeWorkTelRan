import java.util.Scanner;

public class ScannerInput {
    private String fullName = "";
    String position = "";
    int salary = 0;
    int age = 0;

    void scanEmployee(Scanner sc, String field){

        if (field != "withOutFullName") {
            System.out.print("fullName> ");
            fullName = sc.next();
        }

        if (field == "onlyFullName") {
            return;
        }

        System.out.print("position> ");
        position = sc.next();
        System.out.print("salary> ");
        salary = sc.nextInt();
        System.out.print("age> ");
        age = sc.nextInt();
    }

    void input(Database dataBase){

        var sc = new Scanner(System.in);

        boolean i = true;
        while (i == true) {
            String command = sc.next();
            if (command.equals("r")) {
                System.out.print("read> " + dataBase.read());
            }
            else if (command.equals("c"))
                {
                    scanEmployee(sc,"allField");
                    dataBase.create(new Employee(fullName,position,salary,age));
            }
            else if (command.equals("p")){
                System.out.println(dataBase.getPositions());
            }
            else if (command.equals("d")){
                scanEmployee(sc,"onlyFullName");
                System.out.println(dataBase.delete(fullName));
            }
            else if (command.equals("f")){
                scanEmployee(sc,"onlyFullName");
                System.out.println(dataBase.find(fullName).toString());
            }

            else if (command.equals("u")){
                scanEmployee(sc,"allField");
                Employee employeeOld = dataBase.find(fullName);
                dataBase.update(employeeOld,new Employee(fullName,position,salary,age));
            }

            else {
                i = false;
                System.out.println("The end.");
            }


        }
    }

}
