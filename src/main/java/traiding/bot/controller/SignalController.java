package traiding.bot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;
import traiding.bot.entity.Signal;
import traiding.bot.service.SignalService;
import traiding.bot.telegram.Telegram;

import java.util.List;

@RestController
@RequestMapping("/signal")
public class SignalController {

    private final SignalService signalService;
    private final Telegram telegram;

    public SignalController(SignalService signalService, Telegram telegram) {
        this.signalService = signalService;
        this.telegram = telegram;
    }

    @PostMapping("/create")
    private Signal create(@RequestBody Signal signal) {
        try {
            telegram.sendMessage(signal);
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
