package OOP_Seminar_2_HW;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals(List.of(new Cat("Marsel"), new Dog("Rex"), new Rabbit("Lucky"), new Cow("Murka"), new Duck("McQuack"), new Crow("Black"), new ClownFish("Nemo")));

        for (Sayable item : zoo.getSayAble()) {
            System.out.println(item.say());
        }
        System.out.println("--------------------------------------------------------\n"+"Runners are: ");

        for (Runable item : zoo.getRunable()) {
            System.out.println(item);
        }
        System.out.println("--------------------------------------------------------\n"+"Flyers are: ");
        for (Flyable item : zoo.getFlyable()) {
            System.out.println(item);
        }
        System.out.println("--------------------------------------------------------\n"+"Swimmers are: ");
        for (Swimable item : zoo.getSwimable()) {
            System.out.println(item);
        }
        System.out.println("--------------------------------------------------------\n"+"Fastest runner is: ");
        System.out.println(zoo.getWinnerRunners());
        System.out.println("--------------------------------------------------------\n"+"Fastest flyer is: ");
        System.out.println(zoo.getWinnerFlyers());
        System.out.println("--------------------------------------------------------\n"+"Fastest swimmer is: ");
        System.out.println(zoo.getWinnerSwimmers());
    }



}