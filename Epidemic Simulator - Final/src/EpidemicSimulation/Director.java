package EpidemicSimulation;

/***
 * Determines the direction of the individuals
 */
public class Director {

    private double x;
    private double y;

    public Director(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Director()
    {
        double dir = Math.random() * 2 * Math.PI;
        x = Math.sin(dir);
        y = Math.cos(dir);
    }

    public void RandomDir()
    {
        double dir = Math.random() * 2 * Math.PI;
        x = Math.sin(dir);
        y = Math.cos(dir);
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }

}