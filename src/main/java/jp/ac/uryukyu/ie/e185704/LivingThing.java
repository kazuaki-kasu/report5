package jp.ac.uryukyu.ie.e185704;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name,int maxmumHP,int attack){
        this.name = name;
        this.hitPoint = maxmumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n",name,maxmumHP,attack);
    }

    public boolean isDead(){
        return  dead;
    }
    public void setDead(boolean dead){
        this.dead = dead;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getAttack(){
        return attack;
    }

    public void attack(LivingThing opponent){
        if( isDead() == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint = hitPoint - damage;
        if(hitPoint < 0){
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}

