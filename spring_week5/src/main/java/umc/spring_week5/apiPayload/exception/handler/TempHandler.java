package umc.spring_week5.apiPayload.exception.handler;

import umc.spring_week5.apiPayload.code.BaseErrorCode;
import umc.spring_week5.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
