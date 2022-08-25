public class Match {

    Fighter fighter1;
    Fighter fighter2;

    Fighter player1;
    Fighter player2;

    int minWeight;
    int maxWeight;
    int coinTossResult;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkDivision()) {
            coinTossResult = (int)coinToss();
            System.out.println("Coin Toss Result: " + coinTossResult);
            if (coinTossResult > 50) {
                this.player1 = this.fighter1;
                this.player2 = this.fighter2;
            } else {
                this.player1 = this.fighter2;
                this.player2 = this.fighter1;
            }
            System.out.println("Player 1: "+  this.player1.name + ", Player 2: " + this.player2.name);
            int counter = 1;
            while (this.player1.health > 0 && this.player2.health > 0) {
                System.out.println("--------------- ROUND " + counter + " ---------------");

                System.out.print("Action 1: ");
                this.player2.health -= this.player1.hit(player2);
                if (this.player2.health < 0 || this.player2.health == 0) {
                    this.player2.health = 0;
                    System.out.println(this.player2.name + "'s HP: " + this.player2.health);
                    System.out.println(this.player1.name + " won.");
                    break;
                } else {
                    System.out.println(this.player2.name + "'s HP: " + this.player2.health);
                }

                System.out.print("Action 2: ");
                this.player1.health -= this.player2.hit(player1);
                if (this.player1.health < 0 || this.player1.health == 0) {
                    this.player1.health = 0;
                    System.out.println(this.player1.name + "'s HP: " + this.player1.health);
                    System.out.println(this.player2.name + " won.");
                    break;
                } else {
                    System.out.println(this.player1.name + "'s HP: " + this.player1.health);
                }
                counter ++;

            }
        } else {
            System.out.println("Weight divisions do not match. ");
        }
    }

    public boolean checkDivision() {
        return ((this.fighter1.weight >= this.minWeight && this.fighter1.weight <= this.maxWeight) && (this.fighter2.weight >= this.minWeight && this.fighter2.weight <= this.maxWeight));
    }

    public double coinToss() {
        return Math.random() * 100;
    }

}
