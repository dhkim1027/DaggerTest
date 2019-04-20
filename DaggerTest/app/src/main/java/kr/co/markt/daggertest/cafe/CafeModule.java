package kr.co.markt.daggertest.cafe;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(subcomponents = CoffeeComponent.class)
public class CafeModule {
  private String name;

  public CafeModule() {
  }

  public CafeModule(String name) {
    this.name = name;
  }

  @Singleton
  @Provides
  CafeInfo provideCafeInfo(){
    if (name == null || name.isEmpty())
      return new CafeInfo();
    else
      return new CafeInfo(name);
  }

  /*
  @Provides
  CoffeeMaker provideCoffeeMaker(Heater heater){
    return new CoffeeMaker(heater);
  }

  @Provides
  Heater provideHeater(){
    return new A_Heater();
  }
  */

}
