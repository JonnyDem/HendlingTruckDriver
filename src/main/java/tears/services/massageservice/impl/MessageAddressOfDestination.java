package tears.services.massageservice.impl;

import tears.dao.TruckDriverDao;
import tears.dao.impl.TruckDriverDaoImpl;
import tears.services.massageservice.Message;

public class MessageAddressOfDestination implements Message {

    /**
     {@inheritDoc}
     */
    @Override
    public void sendMassage(String address, int id) {
        TruckDriverDao driverDao=new TruckDriverDaoImpl();
        System.out.println("Dear "+driverDao.getNameById(id)+" address of destination is "+address);

    }
}
