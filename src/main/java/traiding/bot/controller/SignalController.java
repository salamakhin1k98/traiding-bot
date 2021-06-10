package traiding.bot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;
import traiding.bot.entity.Message;
import traiding.bot.entity.Signal;
import traiding.bot.service.MessageService;
import traiding.bot.service.SignalService;
import traiding.bot.telegram.Telegram;
import traiding.bot.view.MessageView;

import java.util.List;

@RestController
@RequestMapping("/signal")
public class SignalController {

    private final SignalService signalService;
    private final MessageService messageService;
    private final Telegram telegram;

    public SignalController(SignalService signalService, MessageService messageService, Telegram telegram) {
        this.signalService = signalService;
        this.messageService = messageService;
        this.telegram = telegram;
    }

    @PostMapping("/create")
    private Signal create(@RequestBody Signal signal) {
        try {
            MessageView messageView = telegram.sendMessage(signal);
            Message message = new Message();
            message.setText(messageView.getText());
            messageService.save(message);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return signalService.save(signal);
    }

    @GetMapping("/findAll")
    private List<Signal> findAll() {
        return signalService.findAll();
    }

}
