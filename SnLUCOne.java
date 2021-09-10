package com.company;

public class SnLUCOne {

    public static void main(String[] args) {
        PlayerUC1 player_UC1_1 = new PlayerUC1();
        System.out.println(player_UC1_1.position);
    }
}
class PlayerUC1 {
    int position;
    int steps;
    PlayerUC1() {
        this.position = 0;
        this.steps = 0;
    }
}