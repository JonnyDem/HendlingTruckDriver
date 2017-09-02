package tears.services.factory;

import tears.services.TruckService.TruckService;
import tears.services.TruckService.impl.TruckServiceImpl;
import tears.services.massageservice.MessageService;
import tears.services.massageservice.impl.MessageServiceImpl;

/**
 * Created by Ваня on 01.09.2017.
 */
public class ServiceFactory {

    /**
     * @return instance of {@link MessageService}.
     */

    public static MessageService getMessageService(){
        return new MessageServiceImpl();
    }

    /**
     * @return instance of {@link TruckService}.
     */

    public static TruckService getTruckService(){
        return new TruckServiceImpl();
    }
}
