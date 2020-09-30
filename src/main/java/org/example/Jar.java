package org.example;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Random;

@Data
public class Jar {
    private String sticker;
    private ArrayList<Vegetable> vegetables;


        public Jar(String sticker, ArrayList<Vegetable> vegetables){
        this.vegetables = vegetables;
        this.sticker = sticker;
    }


}

