package dev.byli.robot;

import dev.byli.robot.lab.ioc.dagger.Component;
import dev.byli.robot.lab.ioc.dagger.DaggerComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) throws Exception {
        Component component = DaggerComponent.create();
        component.getDummyUseCase().doSomething("1234");
    }

}