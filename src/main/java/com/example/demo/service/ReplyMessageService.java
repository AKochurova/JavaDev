package com.example.demo.service;



import com.example.demo.Bot;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
public class ReplyMessageService {
    public SendMessage getReplyMessage(long chatId, String replyMessage){

        return new SendMessage(chatId, replyMessage);

    }
    /*public void sendMsg(Message message, String text){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);



    }*/

}
