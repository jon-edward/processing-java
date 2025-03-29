package org.example;

import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        String[] processingArgs = {"Main"};
        PApplet.runSketch(processingArgs, new Main());
    }

    public void settings() {
        size(500, 500);
    }

    public void draw() {
        ellipse(mouseX, mouseY, 50, 50);
    }

    public void mousePressed() {
        background(64);
    }
}