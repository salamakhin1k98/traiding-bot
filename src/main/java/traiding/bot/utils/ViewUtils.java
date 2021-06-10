package traiding.bot.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class ViewUtils {

    private static final ObjectMapper mapper = new ObjectMapper();

    public String getJsonFromEntity(Object o) throws JsonProcessingException {
        return mapper.writeValueAsString(o);
    }

}
