package OOP_Seminar_2_HW;

public abstract class Animal implements Sayable {
    public String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public abstract String feed(); // метод, мы его будем переопределять, абстрактный

    //public abstract String say(); приходит из интерфейса // в абстрактных методах тело не пишем

    public String toString(){
        return "My nickname is " + nickname;
    }

}
