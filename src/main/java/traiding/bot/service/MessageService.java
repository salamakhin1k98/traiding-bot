package traiding.bot.service;

import org.springframework.stereotype.Service;
import traiding.bot.entity.Message;
import traiding.bot.repository.MessageRepository;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message save(Message message) {
        return messageRepository.save(message);
    }

}
