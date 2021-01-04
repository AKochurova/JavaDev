package com.example.demo.handlers;

import com.example.demo.BotState;
import com.example.demo.Jobs;
import com.example.demo.Model;
import com.example.demo.ReplyMessageService;
import com.example.demo.cache.UserDataCache;
import com.example.demo.cache.UserProfileData;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.ArrayList;

@Component
public class FillingProfileHandle implements InputMessageHandler{
    private UserDataCache userDataCache;
    private ReplyMessageService messageService;

    public FillingProfileHandle(UserDataCache userDataCache){
        this.userDataCache = userDataCache;
    }


    @Override
    public SendMessage handle(org.telegram.telegrambots.meta.api.objects.Message message) {
        if(userDataCache.getUsersCurrentBotState(message.getFrom().getId()).equals(BotState.FILLING_PROFILE)){
            userDataCache.setUsersCurrentBotState(message.getFrom().getId(), BotState.CHOOSE_CITY);
        }
        return processUsersInput(message);
    }

    @Override
    public BotState getHandlerName() {
        return BotState.FILLING_PROFILE;
    }

    private SendMessage processUsersInput(Message inputMsg){
        Message usersAnswer = inputMsg;
        int userId = inputMsg.getFrom().getId();
        long chatId = inputMsg.getChatId();

        UserProfileData profileData = userDataCache.getUserProfileData(userId);
        BotState botState = userDataCache.getUsersCurrentBotState(userId);

        SendMessage replyToUser = null;

        if (botState.equals(BotState.CHOOSE_CITY)){
            replyToUser = messageService.getReplyMessage(chatId, "choose city");
            userDataCache.setUsersCurrentBotState(userId, BotState.FIND_JOB);
        }
        if (botState.equals(BotState.FIND_JOB)){
            profileData.setTown(usersAnswer.getText());
            replyToUser = messageService.getReplyMessage(chatId, "choose job");
            userDataCache.setUsersCurrentBotState(userId, BotState.PROFILE_FILLED);
        }
        if (botState.equals(BotState.PROFILE_FILLED)){
            profileData.setJob(usersAnswer.getText());
            ArrayList<Model> arr = new ArrayList<>();
            for(int i=0; i<5; i++){
                Model m = new Model();
                arr.add(m);
            }
            try {

                for (int i=0; i<arr.size(); i++) {
                    messageService.sendMsg(usersAnswer, Jobs.getJobs(usersAnswer.getText(), arr, i, profileData.getTown()));
                }
            }catch (Exception e){
                messageService.sendMsg(usersAnswer, " Not found");
            }
            userDataCache.setUsersCurrentBotState(userId, BotState.FILLING_PROFILE);
            replyToUser = new SendMessage(chatId, String.format("%s %s", "Data: ", profileData));

        }
        userDataCache.saveUserProfileData(userId, profileData);

        return replyToUser;
    }

}
