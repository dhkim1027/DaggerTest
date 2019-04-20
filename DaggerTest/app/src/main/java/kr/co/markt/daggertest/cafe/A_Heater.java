package kr.co.markt.daggertest.cafe;

import android.util.Log;

public class A_Heater implements Heater {
  boolean heating;

  public void on() {
    Log.d("A_Heater", "A_Heater : ~ ~ ~ heating ~ ~ ~");
    this.heating = true;
  }

  public void off() { this.heating = false; }

  public boolean isHot() { return heating; }

}
