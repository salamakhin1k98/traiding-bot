package traiding.bot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Message {

    private String chatId;

    private String text;

    private Date date = new Date();

}
