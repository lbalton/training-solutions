package methodpass;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    Trooper trooper;

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        troopers.add(trooper);
    }


    public Trooper findTrooperByName(String name){
        for (Trooper trooper : troopers){
            if (name.equals(trooper.getName())){
                return trooper;
            }
        }
        return  null;
    }

    public void moveTrooperByName(String name ,Position target){
        Trooper trooper = findTrooperByName(name);
        if (trooper != null){
            moveTrooperByName(name, target);
        }

    }

}
