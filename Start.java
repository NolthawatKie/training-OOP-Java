class Start {
    public static void main(String[] args) {
        Employee e1 = new Employee("E1", 200000.0);
        Employee e2 = new Employee();

        Programmer p1 = new Programmer("P1", 20000.0);
        Accounting a1 = new Accounting("A1", 18000.0);

        System.out.println(Company.name);
        Company.showService();

        
    }
    
}
