public class Start2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("1", "Test1", 30000.0);
        e1.displayEmployee();

        Employee e2 = new Employee("2", "Test2");
        e2.displayEmployee();

        Employee e3 = new Employee();
        e3.displayEmployee();
    }
}
