package com.bestbuy.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import com.bestbuy.utils.PropertyReader;

public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass

    public static void inIt() {

   /*     propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        RestAssured.basePath = Path.PRODUCT;
    }*/

        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;

    }
}
