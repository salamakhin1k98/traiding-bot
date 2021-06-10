package traiding.bot.service;

import org.springframework.stereotype.Service;
import traiding.bot.entity.Signal;
import traiding.bot.repository.SignalRepository;

import java.util.List;

@Service
public class SignalService {

    private final SignalRepository signalRepository;

    public SignalService(SignalRepository signalRepository) {
        this.signalRepository = signalRepository;
    }

    public Signal save(Signal signal) {
        return signalRepository.save(signal);
    }

    public List<Signal> findAll() {
        return signalRepository.findAll();
    }

}
