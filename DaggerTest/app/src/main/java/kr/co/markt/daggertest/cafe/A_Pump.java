package kr.co.markt.daggertest.cafe;

import android.util.Log;

public class A_Pump implements Pump {
  private final Heater heater;

  public A_Pump(Heater heater) {
    this.heater = heater;
  }

  public void pump() {
    if (heater.isHot()) {
      Log.d("A_Pump", "A_Pump => => pumping => =>");
    }
  }

}
