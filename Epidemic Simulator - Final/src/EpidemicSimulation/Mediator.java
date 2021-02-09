package EpidemicSimulation;

import java.util.Random;

/***
 * Mediator class gets 2 diffirent individual and solves their collision problem
 */
public class Mediator {

    private static float R; //[0.5,1.0] spreading factor
    private static float Z; //[0.1,0.9] mortality rate

    public Mediator(){
        R = 1.0f;
        Z = 0.4f;

    }
    public boolean collision(Individual i1, Individual i2) {

        double distance = Math.sqrt(Math.pow(i1.getLocation().getX() - i2.getLocation().getX(), 2)
                + Math.pow(i1.getLocation().getY() - i2.getLocation().getY(), 2));

        if(distance < 2*i1.getLength() + Math.min(i1.getD(), i2.getD())){
            i1.setTempC(((int)(Math.max(i1.getC(),i2.getC()))));
            i2.setTempC(((int)(Math.max(i1.getC(),i2.getC()))));
            return true;
        }
        else
            return false;

    }

    public void collisionControl(Individual i1, Individual i2)
    {
        if(collision(i1,i2) && i1.getGoon() && i2.getGoon())
        {

            i1.setGoon(false);
            i2.setGoon(false);

            if((i2.getSituation() == Situation.PATIENT && i1.getSituation() == Situation.SUSCEPTIBLE)
            || (i1.getSituation() == Situation.PATIENT && i2.getSituation() == Situation.SUSCEPTIBLE))
            {
                float C = Math.max(i1.getC(),i2.getC());
                float D = Math.min(i1.getD(), i2.getD());
                float P = Math.min(R*(1+C/10)*i1.getM()*i2.getM()*(1-D/10),1);

                if(getRandBool(P)){
                    i1.setSituation(Situation.PATIENT);
                    i2.setSituation(Situation.PATIENT);
                    i1.getR().setStroke(null);
                    Controller.incInfect();
                    Controller.decHealthy();
                }

                if(i1.getColTime()<i1.getC()){
                    i1.setGoon(false);
                    i2.setGoon(false);
                }
                else{
                    i1.setGoon(true);
                    i2.setGoon(true);
                }
            }
        }
    }

    public float getR(){
        return R;
    }

    public static float getZ(){
        return Z;
    }
    public boolean getRandBool(float p){

        Random random = new Random();
        return random.nextFloat() < p;
    }


}
