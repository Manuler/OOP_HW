package OOP_Seminar_2_HW;

public class Rabbit extends Herbivores implements Runable {
    public Rabbit(String nickname) {
        super(nickname);
    }
    public String toString(){
        return "I'm rabbit "+ super.toString()+"\n"+ "My speed of run is "+ speedOfRun();
    }
    public String say(){
        return "eow-eow";
    }

    @Override
    public int speedOfRun() {
        return 25;
    }
}
