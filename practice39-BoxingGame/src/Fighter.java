

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    double dodgeChance;


    Fighter(String name, int damage, int health, int weight, double dodgeChance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodgeChance >= 0 && dodgeChance <= 100) {
            this.dodgeChance = dodgeChance;
        } else {
            this.dodgeChance = 0;
        }
    }

    public int hit(Fighter opponent) {
        if (dodge()) {
            System.out.println(this.name + " attacked but " + opponent.name + " dodged " + this.name + "'s attack.");
            return 0;
        } else {
            System.out.println(this.name + " did " + this.damage + " damage to " + opponent.name);
            return this.damage;
        }
    }

    public boolean dodge() {
        double randomNumber = Math.random() * 100;
        return this.dodgeChance >= randomNumber;
    }
}
