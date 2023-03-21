class Employee {
    private String id;
    private String name;
    private Double salary;

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