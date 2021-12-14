import processing.core.PApplet;

public class Sketch extends PApplet {
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  double randomX = random(-width, width);

  public void settings() {
    // Set size of application
    size(400, 400);
  }

  /**
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Set background colour to sky blue
    background(135, 206, 235);
  }

  public void catMan(double x) {
    strokeWeight(width/40);
    stroke(0);

    // Ears
    triangle((float) ((width/3.33) - x),(float) (height/3.8),(float) ((width/3.07) - x), height/10,(float) ((width/2.35) - x),(float) (height/5.33));
    triangle((float) ((width/1.42) - x),(float) (height/3.8),(float) ((width/1.48) - x),height/10,(float) ((width/1.74) - x),(float) (height/5.33));
    ellipse((float) ((width/2) - x), height/2, (float) (width/1.6), (float) (height/1.6));

    // Set stroke settings for eyes and mouth
    strokeWeight((float) (width/57.14));

    // Eyes and mouth
    arc((float) ((width/2.66) - x), (float) (height/2.28), width/8, height/8, -PI, 0);
    arc((float) ((width/1.6) - x), (float) (height/2.28), width/8, height/8, -PI, 0);
    arc((float) ((width/2) - x), (float) (height/1.77), width/16, height/16, 0, PI);

    // Stroke settings for body
    strokeWeight(width/200);
    stroke(0);

    // Lines for body
    line((float) ((width/2) - x), (float) (height/1.23), (float) ((width/2) - x), (float) (height/1.14));
    line((float) ((width/2) - x), (float) (height/1.14), (float) ((width/2.10) - x), (float) (height/1.069));
    line((float) ((width/2) - x), (float) (height/1.14), (float) ((height/1.9) - x), (float) (height/1.069));
    line((float) ((width/2) - x), (float) (height/1.18), (float) ((width/2.22) - x), (float) (height/1.17));
    line((float) ((width/2) - x), (float) (height/1.18), (float) ((height/1.81) - x), (float) (height/1.17));
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Stroke settings for foreground
    stroke(0,255,0);
    strokeWeight(width/100);

    // Fill rectangle in brown
    fill(139,69,19);

    // Foreground
    rect((float) (width/-20), (float) (height/1.06), (float) (width/0.9), height);

    // Time
    fill(0, 0, 0);
    textSize(width/30);
    text(month() + "/" + day() + "/" + year() + " " + hour() + ":" + minute() + ":" + second(), width/40, (float) (height/1.01));

    // Fill everything else in white
    fill(255, 255, 255);

    // Catman
    catMan(randomX);

  }
}