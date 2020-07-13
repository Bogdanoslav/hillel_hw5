package com.hw5;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Dog dog = new Dog(1,2,3,"Black", "Cheburek", false);
        System.out.println(dog.toString());
        System.out.println(dog.say());

        System.out.println();

        GuideDog guideDog = new GuideDog(1,2,3,"Black", "Vanya", false, false);
        System.out.println(guideDog.toString());
        System.out.println(guideDog.say());
        //guideDog.TakeHome();

        System.out.println();

        GuideDog guideDogTrained = new GuideDog(1,2,3,"Black", "Vanya", false, true);
        System.out.println(guideDogTrained.toString());
        System.out.println(guideDogTrained.say());
        //guideDog.TakeHome();

        System.out.println();

        Fish fish = new Fish(1,2,3,"Yellow", "Gold fish", true);
        System.out.println(fish.toString());
        System.out.println(fish.say());

        System.out.println();

        Cat cat = new Cat(1,2,3,"Black", "Tom", false);
        System.out.println(cat.toString());
        System.out.println(cat.say());

        System.out.println();

        Hamster hamster = new Hamster(1,2,3,"Black", "Pushok", false);
        System.out.println(hamster.toString());
        System.out.println(hamster.say());

        System.out.println();

        Crocodile crocodile = new Crocodile(1,2,3,"Green", true);
        System.out.println(crocodile.toString());
        System.out.println(crocodile.say());

        System.out.println();

        Giraffe giraffe = new Giraffe(1,2,3,"Yellow and brown", false);
        System.out.println(giraffe.toString());
        System.out.println(giraffe.say());

        System.out.println();

        Lion lion = new Lion(1,2,3,"Yellow", true);
        System.out.println(lion.toString());
        System.out.println(lion.say());




    }
}
