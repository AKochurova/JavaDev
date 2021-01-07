package com.example.demo.handlers;

import com.example.demo.BotState;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface InputMessageHandler {
    /*SendMessage*/void handle(Message message);

    BotState getHandlerName();
}
