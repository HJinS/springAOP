package advanced.springaop.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContextV2 {
    /*
     * 바뀌는 부분을 별도의 클래스로 사용하고, 합성을 통해 사용
     * 합성을 하지만, 이를 method parameter로 받아서 사용
     * */

    public void execute(Strategy strategy){
        long startTime = System.currentTimeMillis();
        strategy.call();

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }
}
