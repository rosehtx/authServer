package com.serverlist.authserver.dto;

public class BaseResponse {
    public static <T> BaseResponseData<T> failure(String msg) {
        BaseResponseData<T> response = new BaseResponseData<>();
        response.setStatus(200);
        response.setMessage(msg);
        return response;
    }

    public static <T> BaseResponseData<T> success(T data) {
        BaseResponseData<T> response = new BaseResponseData<>();
        response.setStatus(0);
        response.setMessage("success");
        response.setData(data);
        return response;
    }
}
