
import java.util.Objects;


public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    public boolean equals(Object bird){
        return this.hashCode() == bird.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(latinName + ringingYear);
    }

    
    public static void main(String[] args) {
        RingingCentre kumpulaCentre = new RingingCentre();

    kumpulaCentre.observe( new Bird("Rose Starling", "Sturnus roseus", 2012), "Arabia" );
    kumpulaCentre.observe( new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012), "Vallila" );
    kumpulaCentre.observe( new Bird("European Herring Gull", "Larus argentatus", 2008), "Kumpulanmäki" );
    kumpulaCentre.observe( new Bird("Rose Starling", "Sturnus roseus", 2008), "Mannerheimintie" );

    kumpulaCentre.observations( new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012 ) );
    System.out.println("--");
    kumpulaCentre.observations( new Bird("European Herring Gull", "Larus argentatus", 2008 ) );
    System.out.println("--");
    kumpulaCentre.observations( new Bird("European Herring Gull", "Larus argentatus", 1980 ) );
    }
    
    
}


