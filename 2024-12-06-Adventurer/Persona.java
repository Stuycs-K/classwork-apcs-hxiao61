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

    }
    public abstract String support(Adventurer other){

    }
    public abstract String support(){

    }
    public abstract String specialAttack(Adventurer other){
        
    }
}
