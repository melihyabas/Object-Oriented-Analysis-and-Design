package EpidemicSimulation;

import javafx.scene.layout.Pane;

/***
 * Location of an individual. Ensures the movement skills
 */
public class Location {

    private double x;
    private double y;
    private boolean col = true;
    private int S;

    public Location(double x, double y, int S){
        this.x = x;
        this.y = y;
        this.S = S;
    }

    public Location(Pane world, int S){
        this(Individual.length + Math.random() * (world.getWidth() - 2*Individual.length)
                ,Individual.length + Math.random() * (world.getHeight() -2*Individual.length), S);
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }
    public double distance(Location lc)
    {
        return Math.sqrt(Math.pow(this.x - lc.x, 2) + Math.pow(this.y - lc.y, 2));
    }

    public void move(Director director, Pane world)
    {
        double temp;
        if(col) {
            x += S*((director.getX()))/10;
            y += S*( (director.getY()))/10;
            if (x < Individual.length/2 || x > world.getWidth() - Individual.length) {
                director.RandomDir();
                temp = x;
                temp += S*((director.getX()))/10;
                while(temp < Individual.length/2 || temp > world.getWidth() - Individual.length){
                    director.RandomDir();
                    temp = x;
                    temp += S*((director.getX()))/10;
                }

                x += S*((director.getX()))/10;
            }
            if (y < Individual.length/2 || y > world.getHeight() - Individual.length) {
                director.RandomDir();
                temp = y;
                temp += S*((director.getY()))/10;
                while(temp < Individual.length/2 || temp > world.getHeight() - Individual.length){
                    director.RandomDir();
                    temp = y;
                    temp += S*((director.getY()))/10;
                }
                y += S*((director.getY()))/10;
            }
        }

    }

    public void RandomDir(Director director){
        director.RandomDir();
    }
    public boolean collision(Location loc)
    {
       return distance(loc)< 2*Individual.length;
    }
}