package com.melvian.bfi.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class BfiApplicationTest {

    @Test
    void SearchCityByName() throws IOException {

        String cityName= "Sinabang";
        String cityInput = "Sisayang";

        assertEquals(cityName.length(), cityInput.length());

    }

}