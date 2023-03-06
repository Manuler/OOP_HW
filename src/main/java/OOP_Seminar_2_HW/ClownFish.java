package OOP_Seminar_2_HW;

public class ClownFish extends Herbivores implements Swimable{
    public ClownFish(String nickname) {
        super(nickname);
    }
    public String toString(){
        return "I'm fish "+ super.toString()+"\n"+ "My speed of swim " + speedOfSwim();
    }
    public String say(){
        return "flop-flop";
    }

    @Override
    public int speedOfSwim() {
        return 6;
    }
}
