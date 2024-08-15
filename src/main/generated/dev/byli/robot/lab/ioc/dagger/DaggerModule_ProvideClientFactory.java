package dev.byli.robot.lab.ioc.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dev.byli.robot.lab.gateway.Client;
import javax.annotation.processing.Generated;

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
public final class DaggerModule_ProvideClientFactory implements Factory<Client> {
  private final DaggerModule module;

  public DaggerModule_ProvideClientFactory(DaggerModule module) {
    this.module = module;
  }

  @Override
  public Client get() {
    return provideClient(module);
  }

  public static DaggerModule_ProvideClientFactory create(DaggerModule module) {
    return new DaggerModule_ProvideClientFactory(module);
  }

  public static Client provideClient(DaggerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideClient());
  }
}
