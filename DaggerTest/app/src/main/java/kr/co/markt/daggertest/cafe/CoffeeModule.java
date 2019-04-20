package kr.co.markt.daggertest.cafe;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {
  @CoffeeScope
  @Provides
  CoffeeMaker provideCoffeeMaker(Heater heater){
    return new CoffeeMaker(heater);
  }

  @CoffeeScope
  @Provides
  Heater provideHeater(){
    return new A_Heater();
  }

  @Provides
  CoffeeBean provideCoffeeBean(){
    return new CoffeeBean();
  }

}
