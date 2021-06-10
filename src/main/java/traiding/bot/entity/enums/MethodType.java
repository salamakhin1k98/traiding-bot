package traiding.bot.entity.enums;

import lombok.Getter;

@Getter
public enum MethodType {

    EMA10_EMA50("EMA10 EMA50"),
    EMA20_EMA100("EMA20 EMA100"),
    EMA50_EMA200("EMA50 EMA200");

    private String type;

    MethodType(String type) {
        this.type = type;
    }
}
