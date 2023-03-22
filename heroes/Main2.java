
class Main2 {
    public static void main(String[] args){
        Ironman h1 = new Ironman();
        h1.setAge(40);
        h1.setName("Ironman");
        h1.skill("Shooting");
        h1.showDetail();

        Thor t1 = new Thor();
        t1.setAge(40);
        t1.setName("Thor");
        t1.skill("Flying");
        t1.weapon("Hammer");
        t1.setNation("Asgardian");
        t1.showDetail();
    }

}
