package ru.startandroid.p0041basicviews;

import com.google.gson.annotations.SerializedName;

public class ServerResponse {
    @SerializedName("message")
    private String message;

    public String getMessage() {
        return message;
    }
}