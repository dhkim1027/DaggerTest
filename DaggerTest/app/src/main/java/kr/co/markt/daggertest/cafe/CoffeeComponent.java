package kr.co.markt.daggertest.cafe;

import dagger.Component;
import dagger.Subcomponent;

@CoffeeScope
@Subcomponent(modules = CoffeeModule.class)
public interface CoffeeComponent {
  CoffeeMaker make();
  CoffeeBean coffeeBean();
  CoffeeMaker coffeeMaker();

  @Subcomponent.Builder
  interface Builder{
    CoffeeComponent build();
  }
  //void inject(CoffeeMaker coffeeMaker);
}
