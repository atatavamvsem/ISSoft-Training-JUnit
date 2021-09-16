package parser;

import data.RealItemTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.RealItem;

import java.io.FileWriter;
import java.io.IOException;

class JsonParserTest {

    private RealItem car;

    private Cart cart;

    @BeforeEach
    public void before() {
        car = RealItemTest.validRealItem();
        cart = new Cart("test");
        cart.addRealItem(car);
        try {
            FileWriter writer = new FileWriter("src/main/resources/" + cart.getCartName() + ".json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void writeRightDataToFile() {

    }


}