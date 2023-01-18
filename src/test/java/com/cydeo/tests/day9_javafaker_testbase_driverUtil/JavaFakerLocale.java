package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class JavaFakerLocale {
    @Test
    public void test1(){
        Faker faker= new Faker(new Locale("tr"));
        System.out.println("faker.name() = " + faker.name());
    }
}
