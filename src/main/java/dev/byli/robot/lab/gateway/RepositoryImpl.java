package dev.byli.robot.lab.gateway;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RepositoryImpl implements Repository {
    @Override
    public void save(String data) {
        log.info("Data saved: {}", data);

    }
}
