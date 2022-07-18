package org.application.utility;

import org.infyniCode.model.SuccessResponse;

public class CommonCode {
    public static SuccessResponse getSuccessResponse(String message, Integer code, Object key, String keyType) {
        SuccessResponse successResponse = new SuccessResponse();
        successResponse.setMessage(message);
        successResponse.setCode(code);
        successResponse.setKey(key);
        successResponse.setKeyType(keyType);
        return successResponse;
    }
}
