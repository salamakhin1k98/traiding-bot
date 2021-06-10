package traiding.bot.entity.enums;

import lombok.Getter;

@Getter
public enum TypeOperation {

    BUY("BUY"),
    SELL("SELL"),
    TEST("TEST");

    private String type;

    TypeOperation(String type) {
        this.type = type;
    }

}
