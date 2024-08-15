package dev.byli.robot.lab.ioc.dagger;

import dagger.Module;
import dagger.Provides;
import dev.byli.robot.lab.gateway.Client;
import dev.byli.robot.lab.gateway.ClientImpl;
import dev.byli.robot.lab.gateway.Repository;
import dev.byli.robot.lab.gateway.RepositoryImpl;
import dev.byli.robot.lab.useCase.DummyUseCase;

@Module
public class DaggerModule {
    @Provides
    synchronized Client provideClient() {
        return new ClientImpl();
    }

    @Provides
    Repository provideRepository() {
        return new RepositoryImpl();
    }

    @Provides
    DummyUseCase provideDummyUseCase(Client client, Repository repository) {
        return new DummyUseCase(client, repository);
    }
}
