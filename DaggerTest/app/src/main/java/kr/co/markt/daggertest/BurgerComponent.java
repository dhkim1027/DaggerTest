package kr.co.markt.daggertest;

import dagger.Component;

@Component(modules = {BurgerModule.class})
public interface BurgerComponent {
  void inject(MainActivity activity);
}
