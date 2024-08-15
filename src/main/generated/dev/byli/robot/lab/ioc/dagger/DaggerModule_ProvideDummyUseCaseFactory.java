package dev.byli.robot.lab.ioc.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dev.byli.robot.lab.gateway.Client;
import dev.byli.robot.lab.gateway.Repository;
import dev.byli.robot.lab.useCase.DummyUseCase;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class DaggerModule_ProvideDummyUseCaseFactory implements Factory<DummyUseCase> {
  private final DaggerModule module;

  private final Provider<Client> clientProvider;

  private final Provider<Repository> repositoryProvider;

  public DaggerModule_ProvideDummyUseCaseFactory(DaggerModule module,
      Provider<Client> clientProvider, Provider<Repository> repositoryProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DummyUseCase get() {
    return provideDummyUseCase(module, clientProvider.get(), repositoryProvider.get());
  }

  public static DaggerModule_ProvideDummyUseCaseFactory create(DaggerModule module,
      Provider<Client> clientProvider, Provider<Repository> repositoryProvider) {
    return new DaggerModule_ProvideDummyUseCaseFactory(module, clientProvider, repositoryProvider);
  }

  public static DummyUseCase provideDummyUseCase(DaggerModule instance, Client client,
      Repository repository) {
    return Preconditions.checkNotNullFromProvides(instance.provideDummyUseCase(client, repository));
  }
}
