package com.serverlist.authserver.dto;

import lombok.Data;

@Data
public class BaseResponseData<T> {
    private int status;

    private String message;

    private T data;
}
