package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) throws Exception {
        System.out.println( "Добро пожаловать в наш Рог Изобилия! Довольствуйся всем, что есть и можно съесть!");

        Vegetable[] vegetables = {Vegetable.ONION, Vegetable.BROCCOLI, Vegetable.CUCUMBER};

        Jar jar = new Jar("Самодельный Кетчуп", new ArrayList<Vegetable>(Collections.singleton(Vegetable.TOMATO)));

        Jar jar2 = new Jar("Лечо с огурцами и брокколи", new ArrayList<Vegetable>(Arrays.asList(vegetables)));
        Pogreb pogreb = new Pogreb(jar);

        try{
            //достали банку
           pogreb.getJarBySticker("Самодельный Кетчуп");
           //положили обратно
           pogreb.putJarToPogreb(jar2);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }
}
