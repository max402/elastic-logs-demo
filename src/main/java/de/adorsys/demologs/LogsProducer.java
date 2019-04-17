package de.adorsys.demologs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogsProducer {

    @Scheduled(fixedDelay = 1000)
    public void logsEach100MilliSecond() {
        log.trace("{} trace log", System.currentTimeMillis());
    }

    @Scheduled(fixedDelay = 1000)
    public void logsEachSecond() {
        log.debug("{} debug log", System.currentTimeMillis());
    }

    @Scheduled(fixedDelay = 5000)
    public void logsEach5Second() {
        log.info("{} info log", System.currentTimeMillis());
    }

    @Scheduled(fixedDelay = 10000)
    public void logsEach10Second() {
        log.error("{} error log", System.currentTimeMillis());
    }
}
