package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Vegetable{
    TOMATO,
    CUCUMBER,
    BROCCOLI,
    ONION,
    GARLIC,
    MUSHROOMS;

    private static final List<Vegetable> VALUES = Arrays.asList(values());
    public static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    /**
    * TODO Возвращает рандомный овощ из списка овощей;
    * */
    public static Vegetable getRandomVegetable() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    /**
     * TODO Генерируем рандомные коллекции с овощами, чтобы затем помещать их в банки
     **/
    public static ArrayList<Vegetable> getRandomVegetablesCollection() {
        ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();
        for (int i = 0; i < new Random().nextInt(Vegetable.SIZE); i++) {
            vegetables.add(Vegetable.getRandomVegetable());
        }
        return vegetables;
    }
}
