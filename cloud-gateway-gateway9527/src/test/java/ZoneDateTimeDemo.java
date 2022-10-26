import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

@Slf4j
public class ZoneDateTimeDemo {
    @Test
    public void ZoneDateTest(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        log.info(String.valueOf(zonedDateTime));
    }
}
