package OOP_Seminar_2_HW;

public class Duck extends Herbivores implements Flyable, Runable,Swimable{
    public Duck(String nickname) {
        super(nickname);
    }
    public String toString(){
        return "I'm duck "+ super.toString()+"\n"+ "My speed of fly is " + speedOfFly()+"\n" + "My speed of run is "+ speedOfRun()+"\n" + "My speed of swim "+ speedOfSwim();
    }
    public String say(){
        return "quack-quack";
    }

    @Override
    public int speedOfFly() {
        return 40;
    }

    @Override
    public int speedOfRun() {
        return 15;
    }

    @Override
    public int speedOfSwim() {
        return 15;
    }
}
