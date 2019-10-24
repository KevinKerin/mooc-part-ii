
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kevinkerin
 */
public class Contact implements Comparator<Contact>{
    
    private String name;
    protected Set<String> numberSet;
    private String address;
    
    public Contact(String name, String number, String address){
        this.name = name;
        numberSet = new HashSet<String>();
        if(number != null){
            numberSet.add(number);
        }
        this.address = address;
    }
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printNumberSet() {
        for (String str : numberSet){
            System.out.println(" " + str);
        }
    }

    public void setNumberSet(Set<String> numberSet) {
        this.numberSet = numberSet;
    }

    public String getAddress() {
        if(!address.equals("  address unknown")){
            return "  address: " + address;
        }
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void addNumber(String number){
        numberSet.add(number);
    }
    
    public void addAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        String str = this.getAddress();
        if (numberSet.isEmpty()) {
            str += "\n  phone number not found";
            return str;
        } else {
            str += "\n  phone numbers:";
            for (String num : numberSet) {
                str += "\n   " + num;
            }
            return str;
        }

    }

    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
    
    

}
