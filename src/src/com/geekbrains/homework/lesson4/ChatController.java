package com.geekbrains.homework.lesson4;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatController {

    @FXML
    TextArea mainArea;

    @FXML
    TextArea timeArea;

    @FXML
    TextArea usersNameArea;

    @FXML
    TextField messageText;

    @FXML
    TextField userName;

    public void sendMessage(ActionEvent actionEvent) {
        if (messageText.getText().trim().length() > 0 && userName.getText().trim().length() > 0) {
            mainArea.appendText(messageText.getText() + "\n");
            usersNameArea.appendText(userName.getText() + "\n");
            timeArea.appendText(getMessageTime() + "\n");
            messageText.clear();
        }
    }

    private String getMessageTime() {
        Format formatTime = new SimpleDateFormat("HH:mm:ss");
        String time = formatTime.format(new Date());
        return time;
    }
}