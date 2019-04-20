package kr.co.markt.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import javax.inject.Inject;
import kr.co.markt.daggertest.cafe.CafeComponent;
import kr.co.markt.daggertest.cafe.CafeInfo;
import kr.co.markt.daggertest.cafe.CafeModule;
import kr.co.markt.daggertest.cafe.CoffeeBean;
import kr.co.markt.daggertest.cafe.CoffeeComponent;
import kr.co.markt.daggertest.cafe.CoffeeMaker;
import kr.co.markt.daggertest.cafe.DaggerCafeComponent;
import kr.co.markt.daggertest.cafe.Injection;

//https://cmcmcmcm.blog/2017/08/15/dagger2-%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%9C-%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C%EC%97%90%EC%84%9C%EC%9D%98-di-%EA%B5%AC%ED%98%84/


public class MainActivity extends AppCompatActivity {
  @Inject
  Burger burger;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    /*
    BurgerComponent component = DaggerBurgerComponent.builder()
        .burgerModule(new BurgerModule())
        .build();
    component.inject(this);

    Log.d("Main", burger.toString());
    */

    /*
    CoffeeMaker coffeeMaker = new CoffeeMaker(Injection.provideHeater(), Injection.providePump());
    coffeeMaker.brew();
    */


    //DaggerCoffeeComponent.create().make().brew();

    /*
    CoffeeMaker coffeeMaker = new CoffeeMaker();
    DaggerCoffeeComponent.create().inject(coffeeMaker);
    coffeeMaker.brew();
    */

    CafeComponent cafeComponent = DaggerCafeComponent.create();
    CafeInfo cafe1 = cafeComponent.cafeInfo();
    CafeInfo cafe2 = cafeComponent.cafeInfo();

    Log.d("main", "cafe1:" + cafe1.toString() + " cafe2:" + cafe2.toString());

    CoffeeComponent coffeeComponent1 = cafeComponent.coffeeComponent().build();
    CoffeeComponent coffeeComponent2 = cafeComponent.coffeeComponent().build();

    CoffeeMaker maker1 = coffeeComponent1.coffeeMaker();
    CoffeeMaker maker2 = coffeeComponent1.coffeeMaker();
    CoffeeMaker maker3 = coffeeComponent2.coffeeMaker();
    Log.d("main", "maker1:" + maker1.toString() + " maker2:" + maker2.toString() + " maker3:" + maker3.toString());

    CoffeeBean bean1 = coffeeComponent1.coffeeBean();
    CoffeeBean bean2 = coffeeComponent1.coffeeBean();
    Log.d("main", "bean1:" + bean1.toString() + " bean2:" + bean2.toString());

    CafeComponent cafe = DaggerCafeComponent.builder()
        .cafeModule(new CafeModule("STAR"))
        .build();
    cafe.cafeInfo().welcome();

  }
}
