package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractise {

    @Test
    public void test1(){
        //Creating Faker object to reach methods
        Faker faker= new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"###-####-####\") = " + faker.numerify("###-####-####"));

        System.out.println("faker.numerify(\"312-###-###\") = " + faker.numerify("312-###-###"));

        System.out.println("faker.letterify(\"?????????\") = " + faker.letterify("?????????"));
    }
}
