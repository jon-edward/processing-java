/**
 * This is a simple example project to get you started. See Processing Reference
 * (https://processing.org/reference) for information on how to use the library.
 */

package org.example;

import processing.core.PApplet;

enum MouseState {
    JUST_HELD,
    HELD,
    RELEASED
}

public class Main extends PApplet {

    private MouseState mouseState = MouseState.RELEASED;

    public static void main(String[] args) {
        String[] processingArgs = {"Main"};
        PApplet.runSketch(processingArgs, new Main());
    }

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        noStroke();
    }

    private void clearScreen() {
        background(50);
    }

    public void draw() {
        int diameter = 20;

        switch (mouseState) {
            case MouseState.JUST_HELD:
                clearScreen(); // Remove old cursor from screen.
                mouseState = MouseState.HELD;
            case MouseState.HELD:
                fill(100);
                diameter = 40;
                break;
            case MouseState.RELEASED:
                fill(255);
                clearScreen();
                break;
        }

        ellipse(mouseX, mouseY, diameter, diameter);
    }

    public void mousePressed() {
        // This is only called once each time mouse button is pressed.
        mouseState = MouseState.JUST_HELD;
    }

    public void mouseReleased() {
        mouseState = MouseState.RELEASED;
    }
}
