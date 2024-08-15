package dev.byli.robot.lab.gateway;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClientImpl implements Client {
    @Override
    public String get(String id) {
        log.info("Getting data with id: {}", id);
        return "data";
    }
}
