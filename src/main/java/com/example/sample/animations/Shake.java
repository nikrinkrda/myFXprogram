package com.example.sample.animations;

import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.scene.Node;

public class Shake {
    private TranslateTransition tt;
    private TranslateTransition ii;




    public Shake(Node node){
        tt = new TranslateTransition(Duration.millis(70), node);
        tt.setFromX(0f);
        //tt.setFromY(0f);
        tt.setByX(10f);
        //tt.setByX(-20f);
        //tt.setByY(10f);
        //tt.setByY(-10f);
        tt.setCycleCount(3);
        tt.setAutoReverse(true);
        ii = new TranslateTransition(Duration.millis(100), node);

    }
    public void playAnim() {
        tt.playFromStart();
    }
}
