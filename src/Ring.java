public class Ring implements accessories{
    private int level = 1;
    private int ability = 5;
    private int HP = 20;

    Ring(Human h){
        h.attack += ability;
        h.HP += HP;
    }
    public String getName(){
        return Ring.class.getName();
    }
    public int getLevel(){
        return level;
    }
    public int getAbility(){
        return ability;
    }

    public int getHP(){
        return HP;
    }
    public void upgrade(){
        level += 1;
        ability += 5;
        HP += 10;
    }

}