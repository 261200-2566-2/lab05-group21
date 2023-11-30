public class Necklace implements accessories{
    private int level = 1;
    private int ability = 5;
    private int HP = 20;

    Necklace(Human h){
        h.mana += ability;
        h.HP += HP;
    }
    public String getName(){
        return Necklace.class.getName();
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
        ability += 10;
        HP += 10;
    }

}