package com.feyl.work.creationalpatterns.prototype;

/**
 * @author Feyl
 * @date 2021/9/28 17:26
 */
public class Client {
    public static void main(String[] args) {
        PetRoom new_room,prev_room = new PetRoom();
        Pet pet = new Dog("汪仔",2);
        prev_room.setPet(pet);
        new_room = prev_room.clone();
        ((Dog)(new_room.getPet())).setAge(1);
        System.out.println(new_room.getPet());
    }
}
