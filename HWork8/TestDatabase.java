public class TestDatabase {
    public static void main(String[] args) {
        var dataBase = new Database();
        dataBase.init();
        var scanner = new ScannerInput();
        System.out.print("Input> ");
        scanner.input(dataBase);
        }
}
