package dev.byli.robot.lab.ioc.dagger;

import dev.byli.robot.lab.useCase.DummyUseCase;
import jakarta.inject.Singleton;

@Singleton
@dagger.Component(modules = DaggerModule.class)
public interface Component {
    DummyUseCase getDummyUseCase();
}
