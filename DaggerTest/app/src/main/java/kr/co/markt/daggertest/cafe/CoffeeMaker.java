package kr.co.markt.daggertest.cafe;


import android.util.Log;
import javax.inject.Inject;

public class CoffeeMaker {
  private static final String TAG = "CoffeeMaker";
  Heater heater;
  //Pump pump;

  public CoffeeMaker() {
  }

  /*
  @Inject
  public CoffeeMaker(Heater heater, Pump pump){
    this.heater = heater;
    this.pump = pump;
  }
  */

  @Inject
  public CoffeeMaker(Heater heater){
    this.heater = heater;
  }

  public void brew(CoffeeBean coffeeBean){
    Log.d("CoffeeMaker", "CoffeeBeen("+coffeeBean.toString()+") [_]P coffee! [_]P ");
  }

  /*
  public void brew(){
    heater.on();
    pump.pump();
    Log.d(TAG, " [_]P coffee! [_]P ");
    heater.off();
  }
  */


}
