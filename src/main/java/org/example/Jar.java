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
        public Jar(String sticker, ArrayList<Vegetable> vegetables){
        this.vegetables = vegetables;
        this.sticker = sticker;
    }
}

enum Vegetable{
    TOMATO,
    CUCUMBER,
    BROCCOLI,
    ONION,
    GARLIC,
    MUSHROOMS
}