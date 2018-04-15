package application;

import exec.MainExec;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.util.Duration;

public class Chrono{

	private  final Integer STARTTIME = 60;
    private Timeline timeline;
    private IntegerProperty timeSeconds = new SimpleIntegerProperty(STARTTIME);
    
    public Chrono(){
    	timeline = new Timeline();
    }
    
    /**
     * Start the chrono.
     */
    public void start(){
    	// Bind the timerLabel text property to the timeSeconds property
    	MainExec.getChronoLabel().textProperty().bind(timeSeconds.asString());
        
        if (timeline != null) {
            timeline.stop();
        }
        timeSeconds.set(STARTTIME);
        
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(STARTTIME+1), new KeyValue(timeSeconds, 0)));
        timeline.playFromStart();
    }
    
    /**
     * Stop the chrono.
     */
    public void stop(){
    	timeline.stop();
    }
}