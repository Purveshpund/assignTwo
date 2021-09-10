package com.company;

public class SNLUCFinal {
    public static void main (String[] args) {
        Players player_1= new Players();
        Players player_2=new Players();
        while (player_1.position!=100 && player_2.position!=100 ){
            player_1.yourTurn(1);
            player_2.yourTurn(1);
        }
        System.out.println(" Player 1 takes "+player_1.steps+"\n Player 2 takes "+player_2.steps);
        if(player_1.position==100) System.out.println("Player 1 Win The Match!!");

        else System.out.println("Player 2 Win the Match!!");
    }
}
class Players{
    int position;
    int steps;
    Players() {
        this.position = 0;
        this.steps=0;
    }
    public int dice(){
        return 1+(int)(Math.random()*6);
    }
    public void move(int val ,int snakeOrLadder) {
        if (snakeOrLadder == 0) this.position= Math.max(this.position - val, 0);
        else if (snakeOrLadder == 1 && (this.position + val) <= 100) this.position+= val;
    }
    public void  yourTurn(int snakeOrLadder){
        while(snakeOrLadder==1) {
            this.steps+=1;
            int val = dice();
            snakeOrLadder = (int) (Math.random() * 3);
            move(val, snakeOrLadder);
            System.out.println(this.position);
        }
    }
}