class Employee {
    //Attribute
    private String id;
    private String name;
    private Double salary;

    //Default Constructor
    public Employee() {
        // System.out.println("Create Object Completed");
    }

    public Employee(String id, String name) {
        // System.out.println("Create Object Completed");
        this.id = id;
        this.name = name;
    }

    public Employee(String id, String name, Double salary) {
        //System.out.println("Create Object Completed");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // public String getId() {
    //     return this.id;
    // }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
    return this.salary;
    }

    public void displayEmployee() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
    }
}