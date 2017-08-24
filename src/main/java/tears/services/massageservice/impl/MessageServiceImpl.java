package tears.services.massageservice.impl;

import tears.services.massageservice.MessageService;
import tears.services.massageservice.Message;
import tears.services.massageservice.MessageType;

import static tears.services.massageservice.MessageType.ADDRESS_OF_CUSTOMS;

public class MessageServiceImpl implements MessageService {


    /**
     * @param message
     * @return - some new object( derivative from Message class)
     */
    public static Message getTypeOfMessage(MessageType message){
        switch (message){
            case ADDRESS_OF_LOADING:
                return new MessageAddressOfLoading();
            case ADDRESS_OF_DESTINATION:
                return new MessageAddressOfDestination();
            case ADDRESS_OF_CUSTOMS:
                return new MessageAddressOfCustoms();
            case PROBLEMS_ON_ROAD:
                return new MessageProblemsOnRoad();
            case OTHER_INFORMATION:
                return new MessageOtherInformation();
                default:
                    return null;

        }
    }

    /**
     * {@inheritDoc}
     */
   public void sendMessage(String information, int id, MessageType messageType){
       Message message = this.getTypeOfMessage(messageType);
        message.sendMassage(information, id);
    }
}
