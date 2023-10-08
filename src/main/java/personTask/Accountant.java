package personTask;

public class Accountant implements jobTitle{
    String name;
    public Accountant(String name) {
       this.name = name;
    }
    @Override
    public void print() {
        System.out.println("This is a accountant");

    }
}
