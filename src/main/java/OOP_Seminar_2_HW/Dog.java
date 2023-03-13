package OOP_Seminar_2_HW;

public class Dog extends Predator implements Runable, Swimable {
    public Dog(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm dog " + super.toString()+ "\n" + "My speed of run is "+ speedOfRun()+"\n" + "My speed of swim "+ speedOfSwim();
    }

    @Override
    public String say(){
        return "wuf-wuf";
    }

    @Override
    public int speedOfRun() {
        return 20;
    }

    @Override
    public int speedOfSwim() {
        return 4;
    }
}
