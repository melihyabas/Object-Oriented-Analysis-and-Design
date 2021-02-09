package EpidemicSimulation;

import java.util.ArrayList;

/***
 * People keeps a bulk of individials
 */
public class People implements Element{

    ArrayList<Element> people = new ArrayList<>();

    public void move()
    {
        for(Element e:people)
            e.move();
    }

    public void draw()
    {
        for(Element e:people)
            e.draw();

    }

    public void addIndividual(Element p){
        people.add(p);
    }
}
