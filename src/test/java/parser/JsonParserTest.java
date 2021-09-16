package parser;

import com.google.gson.Gson;
import data.RealItemTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shop.Cart;
import shop.RealItem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class JsonParserTest {

    private RealItem car;

    private Cart cart;
    private FileWriter writer;
    private Gson gson;
    private Parser parser;

    @BeforeEach
    public void before() throws IOException {
        car = RealItemTest.validRealItem();
        cart = new Cart("test");
        cart.addRealItem(car);
        writer = new FileWriter("src/main/resources/" + cart.getCartName() + ".json");
        gson = new Gson();
        parser = new JsonParser();
    }

    @Test
    void writeRightDataToFile() throws IOException {
        writer.write(gson.toJson(cart));

        Cart savedCart = parser.readFromFile(new File("src/main/resources/" + cart.getCartName() + ".json"));
        //assertThat(car.getName(), is(equalTo(savedCart.realItems.get(1).getName())));
    }


}