package traiding.bot.utils;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import traiding.bot.entity.Signal;
import traiding.bot.telegram.enums.DictionaryTelegram;

@NoArgsConstructor
@Service
public class TelegramUtils {

    public String convertToPathRequest(DictionaryTelegram dictionaryTelegram) {
        return DictionaryTelegram.API_TELEGRAM.getCode() + dictionaryTelegram.getCode();
    }

    public String convertToMessage(Signal signal) {
        return String.format("Временной промежуток : %s\nОперация : %s\nМетод : %s\nВалюта : %s\nЦена закрытия : %s",
               signal.getTimeFrame().getType(), signal.getTypeOperation().getType(), signal.getMethodType().getType(), signal.getCurrencyName(), signal.getCurrencyValue());
    }

}
