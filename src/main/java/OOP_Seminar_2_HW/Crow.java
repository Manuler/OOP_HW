package OOP_Seminar_2_HW;

public class Crow extends Herbivores implements Flyable, Runable{
    public Crow(String nickname) {
        super(nickname);
    }
    public String toString(){
        return "I'm crow "+ super.toString()+"\n"+ "My speed of fly is " + speedOfFly()+"\n" + "My speed of run is "+ speedOfRun();
    }
    public String say(){
        return "caar caar";
    }

    @Override
    public int speedOfFly() {
        return 50;
    }

    @Override
    public int speedOfRun() {
        return 15;
    }
}

