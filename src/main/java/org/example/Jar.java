package org.example;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Random;

@Data
public class Jar {
    private String sticker;
    private ArrayList<Vegetable> vegetables;

    // TODO сделай конструктор, который заполняет рандомом банку
//    public Jar(String sticker, Vegetable vegetable){
//       // int i = Math.random();
//        this.vegetables.add(vegetable);
//        this.sticker = sticker;
//    }

        public Jar(String sticker, ArrayList<Vegetable> vegetables){
       // int i = Math.random();
        this.vegetables = vegetables;
        this.sticker = sticker;
    }

    // метод должен вернуть массив банок заданного количества, то есть n-ное количество банок
    // для этого в цикле вызывается n раз конструктор Jar, который принимает "имя банки" и "коллекцию овощей"
    //для этого предварительно нужно сгенерировать "имя банки" и "коллекцию овощей"
    //чтобы сгенерировать "колллекцию овощей" надо сгенерить ее в любом количестве с любым содержимым любого типа овоща
//    public ArrayList<Jar> randomJarsGenerator(int jarsCount){
//        ArrayList<Jar> result = new ArrayList();
//        String[] myArray = new String[Vegetables.values().length];
//        //Vegetables.valueOf(myArray[ new Random().nextInt(Vegetables.values().length)])));
//        for (int i = 0; i < jarsCount; i++) {
//            result.add(new Jar("feef",));
//            return result;
//        }
//    }


}

enum Vegetable{
    TOMATO,
    CUCUMBER,
    BROCCOLI,
    ONION,
    GARLIC,
    MUSHROOMS

    //
//    TOMATO("TOMATO"),
//    CUCUMBER("CUCUMBER"),
//    BROCCOLI("BROCCOLI"),
//    ONION("ONION"),
//    GARLIC("GARLIC"),
//    MUSHROOMS("MUSHROOMS");

//    private final String vegetName;
//
//    Vegetables(String vegetName) {
//        this.vegetName = vegetName;
//    }
//
//    public String getVegetName(){
//        return vegetName;
//    }
}

enum Environment {
    PROD("https://release.application.com/"),
    TEST("https://test.application.com/"),
    AUTO_TEST("https://autotest.application.com/"),
    DEV("http://localhost:8080");

    private final String url;

    Environment(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}