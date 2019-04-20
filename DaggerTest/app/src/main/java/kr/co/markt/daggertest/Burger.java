package kr.co.markt.daggertest;

public class Burger {
  private WheatBun mBun;
  private BeefPatty mPatty;

  public Burger(WheatBun bun, BeefPatty patty) {
    mBun = bun;
    mPatty = patty;
  }

  @Override
  public String toString() {
    return mBun.getBun() + " " + mPatty.getPatty();
  }
}
