package EpidemicSimulation;


import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.Random;

/***
 * Simulates the view
 */
public class View {

    private ArrayList<Individual> people;
    private Mediator mediator;
    private Random random;

    public View(Pane world, int popSize)
    {
        int i, S, D, C;
        float M;
        random = new Random();
        mediator = new Mediator();
        people = new ArrayList<Individual>();
       	for(i=0 ; i< popSize ; i++)
       	{
             if(getRandBool(0.5f))
                 M = 0.2f;
             else
                 M = 1.0f;
             S = getRand(1,500);
             D = getRand(0,9);
             C = getRand(1,5);
                 people.add(new Individual(M,S,D,C, Situation.SUSCEPTIBLE, world));
        }
        if(getRandBool(0.5f))
            M = 0.2f;
        else
            M = 1.0f;
        S = getRand(1,500);
        D = getRand(0,9);
        C = getRand(1,5);
       	Individual obj = new Individual(M, S, D, C, Situation.PATIENT, world);
        people.add(obj);
        draw();
    }

    public boolean getRandBool(float p){
        return random.nextFloat() < p;
    }

    public int getRand(int low, int high){
        return random.nextInt(high-low+1) + low;
    }


    public void move()
    {
        for(Individual i : people)
            i.move();
    }

    public void draw()
    {
        for(Individual i : people){
            if(i.getSituation()!=Situation.DEAD)
                i.draw();
            else{
                i.getR().setStroke(null);
                people.remove(i);
            }
        }
    }

    public void CollisionState(){
        for(Individual i : people)
        {
            for(Individual j : people)
            {
                if(i!=j)
                {
                    mediator.collisionControl(i,j);
                }
            }
        }
    }

    public void deadCounting(){
        for(Individual i : people)
            i.deadCounting();
    }

    public void collisionWaiting(){
        for(Individual i : people)
            i.collisionWaiting();
    }

    public void hospitalCounting() {
        for(Individual i : people)
            i.hospitalCounting();
    }
}
