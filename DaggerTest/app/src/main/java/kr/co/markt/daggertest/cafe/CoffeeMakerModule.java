package kr.co.markt.daggertest.cafe;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeMakerModule {
  @Provides
  Heater provideHeater(){
    return new A_Heater();
  }

  @Provides
  Pump providePump(Heater heater) {
    return new A_Pump(heater);
  }

}
