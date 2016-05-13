package com.toastedbits.demos.gradle.processing;

import processing.core.PApplet;

//Tetrahedron example adapted from https://processing.org/tutorials/p3d/
public class Main extends PApplet {
	private int WIDTH = 1024, HEIGHT = 768;

	public void settings() {
		size(WIDTH, HEIGHT, P3D);
	}

	public void setup() {
		background(0);
	}

	public void draw() {
		background(0);

		translate(width/2, height/2, 0);
		stroke(255);
		rotateX(PI/2);
		rotateZ(-PI/6);
		noFill();

		beginShape();
		vertex(-100, -100, -100);
		vertex( 100, -100, -100);
		vertex(   0,    0,  100);

		vertex( 100, -100, -100);
		vertex( 100,  100, -100);
		vertex(   0,    0,  100);

		vertex( 100, 100, -100);
		vertex(-100, 100, -100);
		vertex(   0,   0,  100);

		vertex(-100,  100, -100);
		vertex(-100, -100, -100);
		vertex(   0,    0,  100);
		endShape();
	}

	public static void main(String args[]) {
		PApplet.main(new String[] { "--present", "com.toastedbits.demos.gradle.processing.Main" });
	}
}
