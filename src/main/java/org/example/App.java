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

        Jar jar = new Jar("Самодельный Кетчуп", Vegetable.getRandomVegetablesCollection());

        Jar jar2 = new Jar("Лечо с огурцами и брокколи", Vegetable.getRandomVegetablesCollection());

        Pogreb pogreb = new Pogreb(jar);

        try{
            //достали банку
           pogreb.getJarBySticker("Самодельный Кетчуп рококо");
           //положили обратно
           pogreb.putJarToPogreb(jar2);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }
}
