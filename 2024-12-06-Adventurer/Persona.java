public class Persona extends Adventurer{
    private int SP;
    private int maxSP;
    public Persona(String name, int hp, int sp){
        super(name, hp);
        this.SP = sp;
    }
}