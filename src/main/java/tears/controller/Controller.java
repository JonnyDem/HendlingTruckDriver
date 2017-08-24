package tears.controller;

import tears.services.TruckService.TruckService;
import tears.services.TruckService.impl.TruckServiceImpl;
import tears.services.massageservice.MessageType;

public class Controller {

    public static void main(String[] args) {
        TruckService truckService = new TruckServiceImpl();
        truckService.addDriverToDataBase("Jonny","D",32,"12345",345,3);
        truckService.addDriverToDataBase("Billy","Smith",54,"98765",34576,13);
        truckService.addDriverToDataBase("Mike","Gall",47,"18741",3457,5);
        System.out.println();
        truckService.getAllDataBase();
        System.out.println();
        truckService.sendMassage("Kiev, Nauki 12a.",2, MessageType.ADDRESS_OF_LOADING);
        truckService.sendMassage("our customer is still waiting.", 1, MessageType.OTHER_INFORMATION);
        truckService.sendMassage("New York, 123 avenue.", 3,MessageType.ADDRESS_OF_DESTINATION);
    }
}
