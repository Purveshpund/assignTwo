package com.company;

public class SNLUCTwo {

    public static void main(String[] args) {
        PlayerUC2 player_1= new PlayerUC2();
        System.out.println(player_1.dice());
    }
}
class PlayerUC2 {
    int position;
    int steps;
    PlayerUC2() {
        this.position = 0;
        this.steps = 0;
    }
    public int dice(){
        return 1+(int)(Math.random()*6);
    }
}