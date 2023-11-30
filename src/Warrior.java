public class  Warrior extends Human{
    Warrior(String name){
        super(name,150,50,7);
    }

    @Override
    public String getJob(){ return Warrior.class.getName(); }
    @Override
    public void useSkill(Human h){
        if(haveWeapon) {
            h.HP -= attack + weapon.getSkill();
            mana -= 10;
        }
    }
    public void levelUp(){
        level += 1;
        HP += 10;
        mana += 5;
        attack += 2;
    }
}
