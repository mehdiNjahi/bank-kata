package com.sg.kata.error;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
public enum ErrorEnum {
    INSUFFICIENT_AMMOUNT("INSUFFICIENT_AMOUNT", "Insufficient amount"),
    INVALID_OPERATION("INVALID_OPERATION","The desired operation is invalid");

    private final String code;
    private final String message;

    ErrorEnum(String code, String message){
        this.code = code;
        this.message = message;
    }

    public static Optional<ErrorEnum> fromCode(String value){
        return Arrays.stream(ErrorEnum.values())
                .filter(errorEnum -> errorEnum.code == value)
                .findFirst();
    }
}
