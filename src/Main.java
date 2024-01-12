import Characters.*;
import Enums.Location;

public class Main {
    public static void main(String[] args) {
        Malyish malyish = new Malyish("Малыш");
        Human Krister = new Human("Кристер");
        Human Gunilla = new Human("Гунилла");

        Dogs bimbo = new Dogs("Бимбо");
        Dogs dog = new Dogs("собака");

        Human karlson = new Human("Карлсон");

        dog.property("какая-то большая");

        Krister.setLocation(Location.NOTHERE);
        Gunilla.setLocation(Location.NOTHERE);
        bimbo.setLocation(Location.HERE);
        karlson.setLocation(Location.HERE);

        malyish.search(Krister);
        malyish.search(Gunilla);

        malyish.think("Может быть, они уже уехали на каникулы");

        malyish.care(bimbo,karlson);

        dog.runTo(bimbo, " напасть на него ");

        bimbo.react(dog,"чтобы показать этой глупой псине, что он о ней думает");

        System.out.print("но ");
        malyish.stop(bimbo);

    }
}