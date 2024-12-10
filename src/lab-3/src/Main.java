import processing.core.PApplet;

public class Main extends PApplet {

    @Override
    public void settings(){
        fullScreen();
    }

    @Override
    public void setup(){

    }

    @Override
    public void draw(){
    background(0, 10, 0);
    line(0, height/2f, width, height/2f);
    stroke(255, 0, 0);
    strokeWeight(1);
    }









    public static void main(String[] args) {
        PApplet.main("Main");
    }
}