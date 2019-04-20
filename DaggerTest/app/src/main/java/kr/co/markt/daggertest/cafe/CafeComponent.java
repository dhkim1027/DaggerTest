package kr.co.markt.daggertest.cafe;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = CafeModule.class)
public interface CafeComponent {
  CafeInfo cafeInfo();
  CoffeeComponent.Builder coffeeComponent();

  @Component.Builder
  interface Builder {
    Builder cafeModule(CafeModule cafeModule);
    CafeComponent build();
  }

}
