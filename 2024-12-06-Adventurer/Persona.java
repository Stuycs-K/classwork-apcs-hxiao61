public class Persona extends Adventurer{
    private int SP;
    private int maxSP;
    public Persona(String name, int hp, int sp){
        super(name, hp);
        this.SP = sp;
    }
    @Override
    public String getSpecialName(){
        return SP;
    }
    public int getSpecial(){
        return SP;
    }
    public void setSpecial(int n){
        SP = n;
    }
    public int getSpecialMax(){
        return maxSP;
    }
    public abstract String attack(Adventurer other){
        other.applyDamage(7);
        return getName() + " used a basic physical attack on " + other.getName() + " for 7 damage!";
    }
    public abstract String support(Adventurer other){
        other.setHP(other.getHP() + 6);
        return getName() + " casts 'Dia' to heal " + other.getName() + " for 6 health!";
    }
    public abstract String support(){
        setHP(getHP() + 6);
        return getName() + " casts 'Dia' to heal themselves for 6 health!";
    }
    public abstract String specialAttack(Adventurer other){
        if(SP - 10 >= 0){
            SP = SP -3;
            other.applyDamage(80);
            return getName() + " casts 'Eigaon' on " + other.getName() + " for 80 curse damage!";
        }
        else {
            return "Sorry " + getName() + "! Not enough mana!"; 
        }
    }
}
