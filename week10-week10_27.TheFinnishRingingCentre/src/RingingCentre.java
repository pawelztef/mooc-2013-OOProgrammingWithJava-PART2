import java.util.*;

public class RingingCentre {
    private Map<Bird, List<String>> observationsList;

    public RingingCentre() {
        this.observationsList = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        List<String> observations;
        if(!observationsList.containsKey(bird)) {
            observations = new ArrayList<String>();
            observationsList.put(bird, observations);
        }
        observations = observationsList.get(bird);
        observations.add(place);
    }

    public void observations(Bird bird) {
        List<String> places = this.observationsList.get(bird);
        int numberOfObservtions = places == null ? 0 : places.size();
        System.out.printf("%s observations: %d\n", bird, numberOfObservtions);
        if(places != null) for(String place : places) System.out.println(place);
    }
}
