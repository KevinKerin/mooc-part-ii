
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Airport {
    
    private ArrayList<Airplane> airplaneList;
    Scanner reader;
    
    public Airport(){
        airplaneList = new ArrayList<Airplane>();
        reader = new Scanner(System.in);
    }
    
    public void beginAirportPanel(){
        System.out.println( "Airport panel\n" +
                            "--------------------\n" +
                            "\n");
        menuPanel();
    }
    
    public void menuPanel(){
        System.out.println("Choose operation:\n" +
                            "[1] Add airplane\n" +
                            "[2] Add flight\n" +
                            "[x] Exit\n");
        System.out.print("> ");
        String operation = reader.nextLine();
        if(operation.equals("1")){
            addAirplane();
            menuPanel();
        } else if(operation.equals("2")){
            addFlight();
            menuPanel();
        } else if(operation.equalsIgnoreCase("x")){
            System.out.println("\r" + 
                    "Flight service\n" +
                    "------------\n" +
                    "");
            flightServicePanel();
        } else {
            System.out.println("Command not recognised\n");
            menuPanel();
        }
    }
        
    public void addAirplane(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("\n" + "Give plane capacity: ");
        int planeCapacity = Integer.parseInt(reader.nextLine());
        airplaneList.add(new Airplane(planeID, planeCapacity));
        menuPanel();
    }
    
    public void addFlight(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        for (Airplane ap : airplaneList){
            if (ap.getPlaneID().equalsIgnoreCase(planeID)){
                System.out.print("Give departure airport code: ");
                String dep = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String arr = reader.nextLine();
                ap.addFlight(dep, arr);
                return;
            }
        }
        System.out.println("Plane ID not found");
        menuPanel();
    }
    
    public void flightServicePanel(){
        System.out.println("\rChoose operation:\n" +
                            "[1] Print planes\n" +
                            "[2] Print flights\n" +
                            "[3] Print plane info\n" +
                            "[x] Quit\n" +
                            "> ");
        String command = reader.nextLine();
        if(command.equals("1")){
            printPlanes();
        } else if (command.equals("2")){
            printFlights();
        } else if (command.equals("3")){
            printPlaneInfo();
        } else if (command.equalsIgnoreCase("x")){
            return;
        } else {
            System.out.println("Command not recognised\n");
            flightServicePanel();
        }
    }
    
    public void printPlanes(){
        for (Airplane ap : airplaneList){
            System.out.println(ap);
        }
        flightServicePanel();
    }
    
    public void printFlights(){
        for (Airplane ap : airplaneList){
            ap.printPlanes();
        }
        flightServicePanel();
    }
    
    public void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        for (Airplane ap : airplaneList){
            if (ap.getPlaneID().equalsIgnoreCase(planeID)){
                System.out.println(ap);
                flightServicePanel();
            }
        }
        System.out.print("Plane ID not recognised");
        flightServicePanel();
    }    
}