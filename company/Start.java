class Start {
    public static void main(String[] args) {
        // Employee e1 = new Employee("E1", 200000.0);
        //Employee e2 = new Employee();

        Programmer p1 = new Programmer();
        p1.skill("Java", "C#", "Python");
        p1.bonus();

        Accounting a1 = new Accounting("A1", 18000.0);
        a1.bonus();

        System.out.println(Company.NAME);
        Company.showService();

        
    }
    
}
