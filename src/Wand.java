public class Wand implements weapon {
    private int level = 1;
    private int damage = 10;
    public int skill = 20;

    Wand(Human h){
        h.attack += damage;
    }

    public String getName(){
        return Wand.class.getName();
    }
    public int getLevel(){
        return level;
    }
    public int getSkill(){
        return skill;
    }

    public int getDamage(){
        return damage;
    }
    public void upgrade(Human h){
        level += 1;
        damage += 2;
        h.attack += 2;
    }
}