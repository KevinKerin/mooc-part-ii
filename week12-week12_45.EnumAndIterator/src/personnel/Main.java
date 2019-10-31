package personnel;

public class Main {

    public static void main(String[] args) {
        Employees t = new Employees(); 
        Person h = new Person("Arto", Education.D); 
        t.add(h);
        t.add(new Person("Testie", Education.M));
        t.add(new Person("DegreeHead", Education.D));
        t.add(new Person("DegreeHad", Education.GRAD));
        t.print();
        System.out.println("=====");
        t.fire(Education.D);
        t.print();
    }
}
