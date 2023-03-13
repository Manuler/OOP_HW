package OOP_Seminar_2_HW;

public class Cat extends Predator implements Runable, Swimable {
    public Cat(String nickname) {
        super(nickname);
    }
    public String toString(){
        return "I'm cat "+ super.toString() + "\n" + "My speed of run is "+ speedOfRun()+"\n"+ "My speed of swim "+ speedOfSwim();
    }
    public String say(){
        return "meow-meow";
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfSwim() {
        return 2;
    }
}
