package vertusa;

public abstract class Character {
    private String name;
    private int health;
    private int attackPower;
    private int defense;
    private int speed;

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Character(String name, int health, int attackPower, int defense, int speed){
        this.name=name;
        this.health=health;
        this.attackPower=attackPower;
        this.defense=defense;
        this.speed=speed;
    }
   public abstract void attack(Character target);


    void takeDamage(int amount){
        int damageTaken=amount-defense;
        if(damageTaken<0){
            damageTaken=0;
        }
        health-=damageTaken;
        if(health<=0){
            health=0;
        }
    }
public boolean isAlive(){
    return health>0;
}



}

class Warrior extends Character{
    private int rage;
    public Warrior(String name, int health, int attackPower, int defense, int speed) {
        super(name, health, attackPower, defense, speed);
        this.rage = 0;
    }

    @Override
    public void attack(Character target) {

    }

    void takeDamage(int amount){

        rage=rage+amount;
        if(rage<=100){
           rage=100;
        }
        if(rage==100){

        }
        super.takeDamage(amount);

    }


}

class Mega extends Character{
    private int mana;


    Mega(String name, int health, int attackPower, int defense, int speed, int mana) {
        super(name, health, attackPower, defense, speed);
        this.mana = 0;
    }


    @Override
    public void attack(Character target) {

    }
}

class Archer extends Character{
    private int criticalChange;

    Archer(String name, int health, int attackPower, int defense, int speed,int  criticalChange) {
        super(name, health, attackPower, defense, speed);
        this.criticalChange = criticalChange;
    }

    @Override
    public void attack(Character target) {

    }
}