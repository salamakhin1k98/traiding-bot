package traiding.bot.entity.enums;

import lombok.Getter;

@Getter
public enum TimeFrame {

    D1("1 день"),
    H1("1 час"),
    M15("15 минут");

    private String type;

    TimeFrame(String type) {
        this.type = type;
    }

}
