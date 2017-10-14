package com.katy.practica2;

import android.view.View;

/**
 * Created by Chido on 14/10/2017.
 */

public class MessageEvent {
    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
