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

    // TODO сделай конструктор, который заполняет рандомом погреб

    // TODO сделай два метода с какой-то там вероятностью

    //TODO взять первую попавшуюся банку по наклейке

    public Jar getJarBySticker(String stickerName) throws Exception {

        //Jar jar = new Jar(stickerName, Vegetables.BROCCOLI);
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
       Кладет банку в погреб
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

