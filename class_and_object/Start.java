public class Start {
    public static void main(String[] args){
        Employee e1 = new Employee(); //create object
        e1.setId("1");
        e1.setName("Test");
        e1.setSalary(30000.0);
        e1.displayEmployee();

        System.out.println(e1.getName());

    }
}