package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.Random;

@Data
public class Pogreb {
    private ArrayList<Jar> jars = new ArrayList<>();

    public Pogreb(Jar jar) {
        this.jars.add(jar);
    }

    /*
    * Достает банку по наклейке @stickerName
    * */

    public Jar getJarBySticker(String stickerName) throws Exception {

        Integer chance = new Random().nextInt(100);
        System.out.println(chance);
        if (chance <= 2){
            throw new Exception("Сорян, банка упала и разбилась. Её больше нет в погребе");
        }
        else{
            Jar result = null;
            for (Jar jar: this.getJars()) {
                if (jar.getSticker().equals(stickerName)){
                    result = jar;
                    this.getJars().remove(result);
                    break;
                }
            }
            System.out.println("Из погреба успешно забрали эту банку: " + result.toString() + ". Её там больше нет.");
            System.out.println("Приятного аппетита!");
            return result;
        }
    }


    /*
       Кладет банку @jar в погреб
    */
    public void putJarToPogreb(Jar jar) throws Exception {
        Integer chance = new Random().nextInt(100);
        System.out.println(chance);
        if (chance <= 1){
            throw new Exception("Сорян, банка упала и разбилась. Её больш не получится добавить в погреб");
        }
        else{
            this.getJars().add(jar);
            System.out.println("В погреб успешно добавили эту банку: " + jar.toString());
            System.out.println("Приятного аппетита!");
        }

    }

}

