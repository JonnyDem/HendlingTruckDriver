package tears.services.massageservice.impl;

import tears.dao.TruckDriverDao;
import tears.dao.impl.TruckDriverDaoImpl;
import tears.services.massageservice.MessageSending;

public class MessageSendingProblemsOnRoad implements MessageSending {

    /**
     {@inheritDoc}
     */
    @Override
    public void sendMassage(String message, int id) {
        TruckDriverDao driverDao=new TruckDriverDaoImpl();
        System.out.println("Dear "+driverDao.getNameById(id)+" we are informing you that road has a problem: "+message);
    }
}
