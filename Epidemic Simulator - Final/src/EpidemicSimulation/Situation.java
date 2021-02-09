package EpidemicSimulation;

import javafx.scene.paint.Color;

/***
 * Keeps situations of an individual
 */
public enum Situation {
    SUSCEPTIBLE{
        public Color getColor(){
            return Color.BLUE;
        }
    }, PATIENT{
        public Color getColor(){
            return Color.RED;
        }
    }, HOSPITALED{
        public Color getColor(){
            return null;
        }
    }, DEAD{
        public Color getColor() {return null;}
    };

    public abstract Color getColor();
}