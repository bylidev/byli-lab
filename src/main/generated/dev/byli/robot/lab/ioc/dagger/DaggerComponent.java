package dev.byli.robot.lab.ioc.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import dev.byli.robot.lab.useCase.DummyUseCase;
import javax.annotation.processing.Generated;

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
public final class DaggerComponent {
  private DaggerComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static Component create() {
    return new Builder().build();
  }

  public static final class Builder {
    private DaggerModule daggerModule;

    private Builder() {
    }

    public Builder daggerModule(DaggerModule daggerModule) {
      this.daggerModule = Preconditions.checkNotNull(daggerModule);
      return this;
    }

    public Component build() {
      if (daggerModule == null) {
        this.daggerModule = new DaggerModule();
      }
      return new ComponentImpl(daggerModule);
    }
  }

  private static final class ComponentImpl implements Component {
    private final DaggerModule daggerModule;

    private final ComponentImpl componentImpl = this;

    private ComponentImpl(DaggerModule daggerModuleParam) {
      this.daggerModule = daggerModuleParam;

    }

    @Override
    public DummyUseCase getDummyUseCase() {
      return DaggerModule_ProvideDummyUseCaseFactory.provideDummyUseCase(daggerModule, DaggerModule_ProvideClientFactory.provideClient(daggerModule), DaggerModule_ProvideRepositoryFactory.provideRepository(daggerModule));
    }
  }
}
