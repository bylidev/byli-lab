package dev.byli.robot.lab.ioc.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import dev.byli.robot.lab.gateway.Repository;
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
public final class DaggerModule_ProvideRepositoryFactory implements Factory<Repository> {
  private final DaggerModule module;

  public DaggerModule_ProvideRepositoryFactory(DaggerModule module) {
    this.module = module;
  }

  @Override
  public Repository get() {
    return provideRepository(module);
  }

  public static DaggerModule_ProvideRepositoryFactory create(DaggerModule module) {
    return new DaggerModule_ProvideRepositoryFactory(module);
  }

  public static Repository provideRepository(DaggerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideRepository());
  }
}
