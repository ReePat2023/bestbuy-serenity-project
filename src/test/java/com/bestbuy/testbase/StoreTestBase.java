package com.bestbuy.testbase;

import com.bestbuy.constants.Path;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import com.bestbuy.utils.PropertyReader;

public class StoreTestBase {
    public static PropertyReader propertyReader;

    @BeforeClass

    public static void inIt() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        RestAssured.basePath = Path.STORE;
    }
}
