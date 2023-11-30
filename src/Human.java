public class Human implements humanInterface{
    protected String name;
    protected int HP;
    protected int mana;
    protected int attack;
    protected int level;
    protected boolean haveAccessories;
    protected boolean haveWeapon;
    protected accessories accessories;
    protected weapon weapon;

    Human(String name, int HP, int mana, int attack){
        this.name = name;
        this.HP = HP;
        this.mana = mana;
        level = 1;
        this.attack = attack;
    }
    public String getJob(){
        return null;
    }
    public void levelUp(){
        level += 1;
    }
    public void attack(Human h){
        h.HP -= this.attack;
    }
    public void useSkill(Human h){
    }
    public String isHaveAccessories(){
        if(haveAccessories) return accessories.getName();
        else return "none";
    }
    public String isHaveWeapon(){
        if(haveWeapon) return weapon.getName();
        else return "none";
    }
    public void equipAccessories(String acs) {
        if (!haveAccessories) {
            if (acs.equalsIgnoreCase("Ring")) {
                accessories = new Ring(this);
                haveAccessories = true;
            } else if (acs.equalsIgnoreCase("Necklace")) {
                accessories = new Necklace(this);
                haveAccessories = true;
            }
        }
    }

    public void equipWeapon(String wep){
        if(wep.equalsIgnoreCase("Sword")){
            weapon = new Sword(this);
            haveWeapon = true;
        }else if(wep.equalsIgnoreCase("Wand")){
            weapon = new Wand(this);
            haveWeapon = true;
        }

    }

    public void upgradeWeapon() {
        if (haveWeapon){
            weapon.upgrade(this);
        }
    }
}