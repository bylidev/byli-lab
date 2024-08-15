package dev.byli.robot.lab.useCase;

import dev.byli.robot.lab.gateway.Client;
import dev.byli.robot.lab.gateway.Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class DummyUseCase {
    private final Client client;
    private final Repository repository;

    public void doSomething(String id) {
        long startTime = System.currentTimeMillis();
        log.info("Doing something with id: {} at time: {}", id, startTime);
        String data = client.get(id);
        log.info("Data: {} took: {}", data, System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        repository.save(data);
        log.info("Data saved took: {}", System.currentTimeMillis() - startTime);
    }
}
