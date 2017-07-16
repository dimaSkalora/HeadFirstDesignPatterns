package demo_1;

import demo_1.observer.RecipientMessage;
import demo_1.subject.SenderMessage;

//Рассылка сообщений
public class SendingMessages {
    public static void main(String[] args) {
        SenderMessage senderMessage = new SenderMessage();

        RecipientMessage readerMessage1 = new RecipientMessage(senderMessage,"readerMessage1");
        RecipientMessage readerMessage2 = new RecipientMessage(senderMessage,"readerMessage2");
        RecipientMessage readerMessage3 = new RecipientMessage(senderMessage,"readerMessage3");
        RecipientMessage readerMessage4 = new RecipientMessage(senderMessage,"readerMessage4");
        senderMessage.setMessage("New Message");
        senderMessage.removeObserver(readerMessage3);
        senderMessage.removeObserver(readerMessage4);
        senderMessage.setMessage("New Message2");
    }
}
