package tears.services.TruckService.impl;

import tears.dao.TruckDriverDao;
import tears.dao.impl.TruckDriverDaoImpl;
import tears.model.TruckDriver;
import tears.services.TruckService.TruckService;
import tears.services.massageservice.MessageService;
import tears.services.massageservice.MessageType;
import tears.services.massageservice.impl.MessageServiceImpl;

import java.util.List;

public class TruckServiceImpl implements TruckService{
    TruckDriverDao truckDriverDao = new TruckDriverDaoImpl();

    @Override
    public void addDriverToDataBase(String name, String surname, int age, String phone, int tons, int years) {
        truckDriverDao.addDriverToDataBase(name, surname, age, phone, tons, years);
    }

    @Override
    public void deleteDriverById(int driverId) {
     truckDriverDao.deleteDriverById(driverId);
    }

    @Override
    public void getDriverById(int driverId) {
     truckDriverDao.getDriverById(driverId);
    }

    @Override
    public String getNameById(int driverId) {
       return truckDriverDao.getNameById(driverId);
    }

    @Override
    public String getPhoneById(int driverId) {
        return truckDriverDao.getPhoneById(driverId);
    }

    @Override
    public List<TruckDriver> getAllDataBase() {
        return truckDriverDao.getAllDataBase();
    }

    @Override
    public void sendMassage(String information, int id, MessageType messageType) {
        MessageService messageService=new MessageServiceImpl();
        messageService.sendMessage(information, id, messageType);
    }
}
