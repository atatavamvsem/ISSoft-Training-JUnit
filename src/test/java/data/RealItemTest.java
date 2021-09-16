package data;

import shop.RealItem;

public class RealItemTest {
    public static RealItem validRealItem(){
        RealItem car = new RealItem();
        car.setName("Atata");
        car.setPrice(32026.9);
        car.setWeight(1561);

        return car;
    }
}
