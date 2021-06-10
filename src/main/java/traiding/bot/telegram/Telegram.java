package traiding.bot.telegram;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import traiding.bot.entity.Signal;
import traiding.bot.telegram.enums.DictionaryTelegram;
import traiding.bot.utils.TelegramUtils;
import traiding.bot.utils.ViewUtils;
import traiding.bot.view.MessageView;

@Service
public class Telegram {

    private final ViewUtils viewUtils;

    private final TelegramUtils telegramUtils;

    public Telegram(ViewUtils viewUtils, TelegramUtils telegramUtils) {
        this.viewUtils = viewUtils;
        this.telegramUtils = telegramUtils;
    }

    private final RestTemplate restTemplate = new RestTemplate();

    public MessageView sendMessage(Signal signal) throws JsonProcessingException {
        String pathRequest = telegramUtils.convertToPathRequest(DictionaryTelegram.SEND_MESSAGE);

        MessageView messageView = new MessageView(DictionaryTelegram.CHAT_ID.getCode(), telegramUtils.convertToMessage(signal));

        String json = viewUtils.getJsonFromEntity(messageView);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(json, headers);

        restTemplate.postForLocation(pathRequest, request);

        return messageView;
    }

}
