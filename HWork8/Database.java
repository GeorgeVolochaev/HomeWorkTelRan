import java.util.*;

public class Database {
    Map<String, Employee> employeeMap = new HashMap<>();
    Set<String> positions = new HashSet<>();
    List<Employee> employeeList = new ArrayList<>();

    public void init(){

        employeeList = Arrays.asList(new Employee("Mickael","boss",3500,42),
                                     new Employee("George","engineer",2500,30),
                                     new Employee("Key","engineer",2800,38));


        for (var element:employeeList){
             employeeMap.put(element.getFullName(),element);
             positions.add(element.getPosition());
        }

    }

    String getPositions(){
        var sb = new StringBuffer();
        for (var element:positions) {
            sb.append("" + element +"\n");
        }
        return sb.toString();
    }

    String read(){
        var sb = new StringBuffer();
        for (var element: employeeMap.values()){
            sb.append("" + element + "\n");
        }

        return sb.toString();
    }

    void create(Employee employee){
        employeeMap.put(employee.getFullName(),employee);
        positions.add(employee.getPosition());
    }

    boolean delete(String fullName){
        var employee = employeeMap.get(fullName);

        if (employee != null) {
            employeeMap.remove(employee.getFullName());
            return true;
        }
        return false;
    }

    void update(Employee employee){
        //employeeMap.put(employee.getFullName(),employee);
        //positions.add(employee.getPosition());
    }

    String find(String fullName){
        return employeeMap.get(fullName).getFullName();
    }


    @Override
    public String toString() {
        return employeeMap.toString();

    }
}
