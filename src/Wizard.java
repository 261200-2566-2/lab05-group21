public class Wizard extends Human{
    Wizard(String name){
        super(name,100,100,5);
    }


    @Override
    public String getJob(){ return Wizard.class.getName(); }
    @Override
    public void useSkill(Human h){
        if(haveWeapon) {
            h.HP -= attack + weapon.getSkill();
            mana -= 10;
        }
    }

    public void levelUp(){
        level += 1;
        HP += 5;
        mana += 10;
        attack += 2;
    }
}