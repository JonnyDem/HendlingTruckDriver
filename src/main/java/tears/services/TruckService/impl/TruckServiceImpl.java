package tears.services.TruckService.impl;

import tears.dao.TruckDriverDao;
import tears.dao.factory.DaoFactory;
import tears.database.TruckDriverDataBase;
import tears.exeptions.EmptyMassage;
import tears.exeptions.IncorrectId;
import tears.model.TruckDriver;
import tears.services.TruckService.TruckService;
import tears.services.massageservice.MessageService;
import tears.services.massageservice.MessageType;
import tears.services.factory.ServiceFactory;

import java.util.List;

public class TruckServiceImpl implements TruckService{


    @Override
    public void addDriverToDataBase(String name, String surname, int age, String phone, int tons, int years) {
        TruckDriverDao truckDriverDao = DaoFactory.getTruckDriverDao();
        truckDriverDao.addDriverToDataBase(name, surname, age, phone, tons, years);
    }

    @Override
    public void deleteDriverById(int driverId) {
        TruckDriverDao truckDriverDao = DaoFactory.getTruckDriverDao();
     truckDriverDao.deleteDriverById(driverId);
    }

    @Override
    public void getDriverById(int driverId){
        TruckDriverDao truckDriverDao = DaoFactory.getTruckDriverDao();
     truckDriverDao.getDriverById(driverId);
    }

    @Override
    public String getNameById(int driverId) {
        TruckDriverDao truckDriverDao = DaoFactory.getTruckDriverDao();
       return truckDriverDao.getNameById(driverId);
    }

    @Override
    public String getPhoneById(int driverId) {
        TruckDriverDao truckDriverDao = DaoFactory.getTruckDriverDao();
        return truckDriverDao.getPhoneById(driverId);
    }

    @Override
    public List<TruckDriver> getAllDataBase() {
        TruckDriverDao truckDriverDao = DaoFactory.getTruckDriverDao();
        return truckDriverDao.getAllDataBase();
    }

    @Override
    public int sendMassage(String information, int id, MessageType messageType) throws EmptyMassage,IncorrectId {
        if(information.equals("")){
            throw  new EmptyMassage();
        }
       int count=0;
        for(TruckDriver driver:TruckDriverDataBase.listOfDriver){
            if(driver.getDriverId()==id){
                count++;
            }
        }
        if(count==0){
            throw new IncorrectId();
        }

            MessageService messageService = ServiceFactory.getMessageService();
            messageService.sendMessage(information, id, messageType);

            return 200;
        }
    }

