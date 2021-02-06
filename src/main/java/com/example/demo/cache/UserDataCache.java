package com.example.demo.cache;

import com.example.demo.botapi.BotState;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class UserDataCache {
    private Map<Integer, BotState> userBotStates = new ConcurrentHashMap<>();
    private Map<Integer, UserProfileData> usersProfileData = new ConcurrentHashMap<>();
    private Map<Integer, String> userFavId = new ConcurrentHashMap<>();
    private Map<Integer, String> userToken = new ConcurrentHashMap<>();

    private Map<Integer, UserAouthData> userAouth = new ConcurrentHashMap<>();

    public UserAouthData getUserAouth(int userId) {
        UserAouthData userAouthData = userAouth.get(userId);
        if (userAouthData == null){
            userAouthData = new UserAouthData();
        }
        return userAouthData;
    }

    public String getUsersToken(int userId) {
        return userToken.get(userId);
    }
    public void setUsersToken(int userId, String token) {
        userToken.put(userId, token);
    }

    public String getUsersFavId(int userId) {
        return userFavId.get(userId);
    }
    public void setUsersFavId(int userId, String id) {
        userFavId.put(userId, id);
    }

    public BotState getUsersCurrentBotState(int userId) {
        BotState botState = userBotStates.get(userId);
        if (botState == null){
            botState = BotState.FILLING_PROFILE;
        }
        return botState;
    }

    public void setUsersCurrentBotState(int userId, BotState botState) {
        userBotStates.put(userId, botState);
    }

    public UserProfileData getUserProfileData(int userId) {
        UserProfileData userProfileData = usersProfileData.get(userId);
        if(userProfileData == null){
            userProfileData = new UserProfileData();
        }
        return userProfileData;
    }

    public void saveUserProfileData(int userId, UserProfileData userProfileData) {

        usersProfileData.put(userId, userProfileData);
    }
}
