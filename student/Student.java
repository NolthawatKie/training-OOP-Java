abstract class Student {
    private String id;
    private String name;

    // if we have asbtract class => need at lease 1 abstract method
    // must get detail in subclass
    public abstract void register();

    public abstract void preTest();

    public abstract void postTest();

    public void setId(String id) {
        this.id = id;
    }
}
