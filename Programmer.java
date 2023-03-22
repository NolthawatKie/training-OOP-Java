class Programmer extends Employee {

    //overloading method (with in class)
    public void skill(){ System.out.println("No Skill"); }

    //public void skill(String lang) { System.out.println("Skill : "+ lang);}

    public void skill(String ... langs) {
        for(String lang : langs) {
            System.out.println("Skill : " + lang);
        }
    }

    // contructor method
    //public Programmer(String name, double salary) {

        //called contructor of super class
        //super(name, salary);

        //System.out.println("I'm Programmer");
        
    //}

    //overridding method
    //public void bonus() {
        //System.out.println("Bonus = 20%");
    //}

    //override with abstract
    public void bonus(){ }
}
    

