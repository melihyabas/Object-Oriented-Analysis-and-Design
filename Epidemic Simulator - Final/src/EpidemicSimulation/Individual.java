package EpidemicSimulation;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/***
 * This class keeps all features of an individual and directs them in a way
 */
public class Individual implements Element{

    public  Situation situation;
    private Location location;
    private Director director;
    private Rectangle r;
    private Pane world;
    private int sickTime = 0;
    private int collisionTime = 0;
    private int deadCount = 0;
    private int timeInHosp = 0;
    private int deadTime = (int) (5*100*(1-Mediator.getZ()));
    public static int length = 5;
    public static int healtime = 5 * 50;

    private float M; // wear mask, M=0.2; not wear mask M=1.0
    private int S; // speed [1,5] pixel/second
    private int D; // social distamce [0,9] in pixels
    private int C = 5; // sociality [1,5] seconds
    private int tempC; // Keeps max C of the pair
    private boolean goon = true;


    public Individual(){ }

    public Individual( float M,int S, int D, int C,Situation situation, Pane world){

        this.M = M;
        this.S = S;
        this.D = D;
        this.C = 10*C;
        this.situation = situation;
        this.director = new Director();
        this.location = new Location(world, S);
        this.r = new Rectangle(length,length, situation.getColor());
        this.world = world;
        r.setStroke(Color.BLACK);
        world.getChildren().add(r);
    }

    public Situation getSituation()
    {
        return situation;
    }

    public void setSituation(Situation situation)
    {
        this.situation = situation;
        r.setFill(situation.getColor());
    }

    public void move() {
            if(goon)
                location.move(director, world);
    }

    public void draw() {
        if(situation!=Situation.DEAD) {
            r.setWidth(length);
            r.setHeight(length);
            r.setTranslateX(location.getX());
            r.setTranslateY(location.getY());
        }
    }
    public void collisionWaiting() {
        if(!goon)
        {
            collisionTime++;
            if(collisionTime<tempC)
                goon = false;
            else{
                goon = true;
                collisionTime = 0;
                location.RandomDir(director);
            }
        }
    }

    public void deadCounting(){
        if(situation==Situation.PATIENT){
            deadCount++;
            System.out.println(deadCount);
            if(deadCount>=deadTime){
                setSituation(Situation.DEAD);
                Controller.incDead();
                Controller.decInfect();
            }
            else if(deadCount >= 25*10 && Controller.isEmptyVen()){
                setSituation(Situation.HOSPITALED);
                Controller.decInfect();
                Controller.incHospital();
                deadCount = 0;
                r.setStroke(null);
            }
        }
    }

    public void hospitalCounting(){
        if(situation==Situation.HOSPITALED){
            if(timeInHosp<10*10){
                timeInHosp++;
            }
            else{
                setSituation(Situation.SUSCEPTIBLE);
                Controller.decHospital();
                Controller.incHealthy();
                timeInHosp = 0;
            }
        }
    }

    public Location getLocation(){
        return location;
    }

    public int getColTime(){
        return collisionTime;
    }

    public float getC(){
        return C;
    }

    public int getD() {return D;}
    public int getLength(){
        return length;
    }
    public boolean getGoon(){
        return goon;
    }

    public void setGoon(boolean goon){
        this.goon = goon;
    }

    public void setTempC(int tempC) {
        this.tempC = tempC;
    }

    public float getM() {
        return M;
    }

    public Rectangle getR() {
        return r;
    }
}