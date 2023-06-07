package hometask2;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<ResidentOfAquarium> aquarium = new ArrayList<>();
    public Aquarium addResidentOfAquarium(ResidentOfAquarium someResident) {
        aquarium.add(someResident);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В аквариуме живут: \n");
        for (ResidentOfAquarium resident: aquarium) {
            builder.append(resident).append('\n');
        }
        return builder.toString();
    }
    public List<NewSwimSpeed> swimmers(){
        List<NewSwimSpeed> swimmer = new ArrayList<>();
        for (ResidentOfAquarium resident: aquarium) {
            if (resident instanceof NewSwimSpeed) {
                swimmer.add((NewSwimSpeed) resident);
            }
        }
        return swimmer;
    }
    public hometask2.NewSwimSpeed getBestSwimmer(){
        List<NewSwimSpeed> swimmers = swimmers();
        NewSwimSpeed champ = swimmers.get(0);
        for (NewSwimSpeed swimmer: swimmers)
            if (champ.getNewSwimSpeed() < swimmer.getNewSwimSpeed()) {
                champ = swimmer;
            }
        return champ;
    }
}
