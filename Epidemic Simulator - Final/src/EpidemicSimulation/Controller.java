/***
 * Controller class for controlling part of mvc
 */
package EpidemicSimulation;
import javafx.animation.AnimationTimer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    Pane world;
    @FXML
    Button start;
    @FXML
    Button stop;

    @FXML
    Button reset;


    @FXML
    Slider poSize;

    @FXML
    TextField infected;
    private static int infSize = 1;
    @FXML
    TextField healthy;
    private static int healthySize = 0;
    @FXML
    TextField hospitalized;
    private static int hospitSize = 0;
    @FXML
    TextField dead;
    private static int deadSize = 0;

    private static int hospitalCapacity = 1;
    View view;

    private Movement clock;
    private int populationSize;


    /***
     * Movement crerates a multithreaded system for moving objects
     */
    private class Movement extends AnimationTimer{

        private long Time = 100000000l;

        private long last = 0;

        @Override
        public void handle(long now)
        {
            if(now - last > Time){
                step();
                last = now;

                infected.setText(infSize+"");
                healthy.setText(healthySize+"");
                hospitalized.setText(hospitSize+"");
                dead.setText(deadSize+"");
            }
        }
    }

    @FXML
    public void initialize(){
        poSize.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                setPoSize();
            }
        });
        clock = new Movement();
        world.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, null, null)));
        world.setBorder(Border.EMPTY);
    }
    public void setPoSize(){
        populationSize = (int)poSize.getValue();
        hospitalCapacity = (int)poSize.getValue()/10;
    }

    @FXML
    public void reset(){
        infSize = 1;
        healthySize = populationSize;
        hospitSize = 0;
        deadSize = 0;
        stop();
        world.getChildren().clear();
        view = new View(world, populationSize);

    }

    @FXML
    public void start(){
        clock.start();
        TakeOutOfButtons(true,false);
    }
    @FXML
    public void stop(){
        clock.stop();
        TakeOutOfButtons(false,true);
    }

    public void step(){
        view.move();
        view.deadCounting();
        view.hospitalCounting();
        view.CollisionState();
        view.collisionWaiting();

        view.draw();
    }

    public void TakeOutOfButtons(boolean startB, boolean stopB ){
        start.setDisable(startB);
        stop.setDisable(stopB);
    }

    public static void incInfect(){
        infSize++;
    }

    public static void decInfect(){
        infSize--;
    }
    public static void incHealthy() {
        healthySize++;
    }

    public static void decHealthy() {
        healthySize--;
    }

    public static void incHospital() {
        hospitSize++;
    }

    public static void decHospital() {
        hospitSize--;
    }

    public static void incDead() {
        deadSize++;
    }

    public static boolean isEmptyVen(){
        return (hospitSize < hospitalCapacity);
    }



}
