package personTask;

public class Worker implements jobTitle{
    String name;
    public Worker(String name) {
        this.name=name;
    }
    @Override
    public void print() {
        System.out.println("This is a worker");

    }
}
