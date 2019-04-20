package kr.co.markt.daggertest.cafe;

import android.util.Log;

public class CafeInfo {
  private static final String TAG = "CafeInfo";
  private String name;

  public CafeInfo(){}

  public CafeInfo(String name){ this.name = name; }

  public void welcome(){
    Log.d(TAG, "Welcome " + name == null? "":name );
    //System.out.println("Welcome " + name == null? "":name );
  }

}
