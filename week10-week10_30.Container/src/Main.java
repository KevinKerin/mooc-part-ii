
import containers.ProductContainer;
import containers.ProductContainerRecorder;


public class Main {

    public static void main(String[] args) {
        
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToTheContainer(1.0);
        System.out.println(juice);
        
        System.out.println(juice.history());
        
    }

}
