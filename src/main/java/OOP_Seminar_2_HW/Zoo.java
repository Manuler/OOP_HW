package OOP_Seminar_2_HW;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public List<Animal> addAnimals(List<Animal> animals) {
        this.animals.addAll(animals);
        return this.animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    private Radio radio = new Radio();

    public List<Sayable> getSayAble() {
        List<Sayable> result = new ArrayList<>();
        for (Animal item : animals) {
            result.add(item);
        }
        result.add(radio);
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }

        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable) {
                result.add((Flyable) item);
            }

        }
        return result;
    }
    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Swimable) {
                result.add((Swimable) item);
            }

        }
        return result;
    }

    public Runable getWinnerRunners(){
        List<Runable> runners = getRunable();
        Runable winner = runners.get(0);
        for (Runable item: runners){
            if (winner.speedOfRun() < item.speedOfRun()){
                winner = item;
            }
        }
        return winner;
    }
    public Flyable getWinnerFlyers(){
        List<Flyable> flyers = getFlyable();
        Flyable winner = flyers.get(0);
        for (Flyable item: flyers){
            if (winner.speedOfFly() < item.speedOfFly()){
                winner = item;
            }
        }
        return winner;
    }
    public Swimable getWinnerSwimmers(){
        List<Swimable> flyers = getSwimable();
        Swimable winner = flyers.get(0);
        for (Swimable item: flyers){
            if (winner.speedOfSwim() < item.speedOfSwim()){
                winner = item;
            }
        }
        return winner;
    }
}
