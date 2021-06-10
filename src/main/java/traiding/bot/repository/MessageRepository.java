package traiding.bot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import traiding.bot.entity.Message;
import traiding.bot.entity.Signal;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

}
