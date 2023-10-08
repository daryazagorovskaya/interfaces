package personTask;

public class Director implements jobTitle{
    public String name;
    public Director(String name) {
       this.name = name;
    }
    @Override
    public void print() {
        System.out.println("This is a Director");
    }
}
