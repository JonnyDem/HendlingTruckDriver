package tears.services.massageservice.impl;

import tears.exeptions.EmptyMassage;
import tears.exeptions.IncorrectId;
import tears.services.massageservice.MessageSending;
import tears.services.massageservice.MessageService;
import tears.services.massageservice.MessageType;

public class MessageServiceImpl implements MessageService {


    /**
     * @param message
     * @return - some new object( derivative from MessageSending class)
     */
    public static MessageSending getTypeOfMessage(MessageType message){
        switch (message){
            case ADDRESS_OF_LOADING:
                return new MessageSendingAddressOfLoading();
            case ADDRESS_OF_DESTINATION:
                return new MessageSendingAddressOfDestination();
            case ADDRESS_OF_CUSTOMS:
                return new MessageSendingAddressOfCustoms();
            case PROBLEMS_ON_ROAD:
                return new MessageSendingProblemsOnRoad();
            case OTHER_INFORMATION:
                return new MessageSendingOtherInformation();
                default:
                    return null;

        }
    }

    /**
     * {@inheritDoc}
     */
   public void sendMessage(String information, int id, MessageType messageType)throws EmptyMassage,IncorrectId{
       MessageSending messageSending = this.getTypeOfMessage(messageType);
       messageSending.sendMassage(information, id);
   }
}
