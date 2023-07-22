package advanced.springaop;

import advanced.springaop.trace.logtrace.FieldLogTrace;
import advanced.springaop.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig  {

    @Bean
    public LogTrace logTrace(){
        return new FieldLogTrace();
    }
}
