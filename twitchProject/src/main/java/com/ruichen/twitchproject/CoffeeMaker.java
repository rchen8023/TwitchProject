//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//abstract class Grinder {
//
//    public void grind() {
//
//    }
//}
//
//// Expensive
//class BurrGrinder extends Grinder {
//
//}
//
//
//
//abstract class Boiler {
//
//    public void boil() {
//
//
//    }
//}
//
//
//@Component
//class DualBoiler extends Boiler {
//
//
//}
//@Component
//class CoffeeMaker {
//
//    private int count = 0;
//
//    private int max = 10;
//
//    @AutoWire
//    private Grinder grinder;
//
//    @AutoWire
//    private Boiler boiler;
//
//    public void makeCoffee() {
//
//        grinder.grind();
//
//        boiler.boil();
//    }
//}
//
//
//
///// main
//
//grinder = new BladeGrinder();
//
//        boiler = new DualBolier();
//
//        coffeeMakder = new CoffeeMaker(grinder, boiler); //Spring will call this function
//
//
//// post localhost:8080/make_coffee
//
//
//// CoffeeMakerController
//@Controller
//class CoffeeMakerController {
//
//
//    @AutoWire
//    private CoffeeMaker coffeeMaker
//
//
//    public CoffeeMakerController() {
//
//    }
//
//
//    @RequestMapping(value = "/make_coffee", method = RequestMethod.POST)
//    public void makeCoffee() {
//
//        coffeeMaker.makeCoffee();
//    }
//}
//
//
//// CoffeeMakerController
//@Controller
//class OfficeController {
//
//
//    @AutoWire
//    private CoffeeMaker coffeeMaker
//
//
//    public CoffeeMakerController() {
//
//    }
//
//    @RequestMapping(value = "/make_coffee_in_office", method = RequestMethod.POST)
//    public void makeCoffee() {
//
//        coffeeMaker.makeCoffee();
//    }
//}
//
//// CoffeeMakerController
//@Controller
//class HomeController {
//
//
//    @AutoWire
//    private CoffeeMaker coffeeMaker
//
//
//    public CoffeeMakerController() {
//
//    }
//    @RequestMapping(value = "/make_coffee_at_home", method = RequestMethod.POST)
//    public void makeCoffee() {
//
//        coffeeMaker.makeCoffee();
//    }
//}
