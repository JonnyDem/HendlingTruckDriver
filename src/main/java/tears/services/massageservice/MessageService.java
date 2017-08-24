package tears.services.massageservice;

public interface MessageService {

     /**
      * @param message
      * @return class that implements interface Message.
      */
    static Message getTypeOfMessage(MessageType message){
         return null;
    };

    /**
     * @param information
     * @param id - driver id
     * @param messageType - some data from enum MessageType
     */

    void sendMessage(String information, int id, MessageType messageType);


}
