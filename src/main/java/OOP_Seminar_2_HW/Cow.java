package OOP_Seminar_2_HW;

public class Cow extends Herbivores implements Runable{

    public Cow(String nickname) {
        super(nickname);
    }
    public String toString(){
        return "I'm cow "+ super.toString()+"\n"+ "My speed of run is "+ speedOfRun();
    }
    public String say(){
        return "moo-moo";
    }

    @Override
    public int speedOfRun() {
        return 5;
    }
}
