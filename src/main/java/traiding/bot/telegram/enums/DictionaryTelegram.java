package traiding.bot.telegram.enums;

import lombok.Getter;

@Getter
public enum DictionaryTelegram {

    API_TELEGRAM("https://api.telegram.org/bot1697648105:AAHu16IN-7HSkGggLDScXz0O3U03Wq-bkcI"),

    SEND_MESSAGE("/sendMessage"),

    CHAT_ID("@traiding678");

    private final String code;

    DictionaryTelegram(String code) {
        this.code = code;
    }

}
