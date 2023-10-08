package personTask;
//  Создать классы "Директор", "Рабочий", "Бухгалтер".
//Реализовать интерфейс с методом, который печатает название
//должности и имплементировать этот метод в созданные классы.
public class Program {
    public static void main (String arg []){
        Worker w1 = new Worker("Vanya");
        w1.print();
        Accountant a1 = new Accountant("Sveta");
        a1.print();
        Director d1 = new Director("Boss");
        d1.print();

    }
}
