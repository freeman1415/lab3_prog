package Characters;

import Enums.Location;
import Interfaces.ICare;
import Interfaces.ISearch;
import Interfaces.IStop;
import Interfaces.IThink;

public class Malyish extends Human implements IThink, ISearch, ICare, IStop {
    public Malyish(String name) {
        super(name);
    }
    @Override
    public void think(String idea) {
        System.out.println("'"+idea+"'"+", -- подумал "+this.getName());
    }

    @Override
    public void search(Essence ess) {
        if (ess.getLocation()== Location.NOTHERE){
            System.out.println(this.getName()+" не смог найти сегодня "+ess.getName());
        }
        else if (ess.getLocation()==Location.HERE){
            System.out.println(this.getName()+" нашел "+ess.getName());
        }
    }

    @Override
    public void care(Essence bimbo,Essence karlson) {
        if (bimbo instanceof Dogs && bimbo.getName()=="Бимбо" && karlson instanceof Human && karlson.getName()=="Карлсон" && karlson.getLocation()==Location.HERE && bimbo.getLocation()==Location.HERE){
            System.out.println("Ему на это наплевать пока есть Карлсон. Ну и Бимбо конечно");
        }
        else{
            System.out.println("Ему не плевать");
        }
    }

    @Override
    public void stop(Essence ess) {
        System.out.println(this.getName()+" удержал "+ess.getName());
    }

}
