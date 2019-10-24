
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        List<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");

        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }

        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        Map<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        VehicleRegister vr = new VehicleRegister();
        
        System.out.println(vr.add(reg1, "Micko"));
        System.out.println(vr.add(reg3, "Mickooo"));
        System.out.println(vr.add(new RegistrationPlate("IE", "09-LK-11158"), "Michael Kerin"));
        System.out.println(vr.add(reg2, "John"));
        System.out.println(vr.get(reg2));
        System.out.println(vr.delete(reg2));
        System.out.println(vr.get(reg2));
        vr.printOwners();
        
//        System.out.println("owners:");
//        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
//        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
//        // if the hashCode hasn't been overwritten, the owners are not found
    }
}
