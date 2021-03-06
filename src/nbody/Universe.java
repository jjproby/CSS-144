package nbody;

import edu.princeton.cs.In;
import edu.princeton.cs.StdDraw;
import java.awt.Color;
import java.util.ArrayList;

/**
 * ****************************************************************************
 * Compilation: javac Universe.java Execution: java Universe dt input.txt
 * Dependencies: Body.java Vector.java StdIn.java StdDraw.java Datafiles:
 * http://www.cs.princeton.edu/introcs/34nbody/2body.txt
 * http://www.cs.princeton.edu/introcs/34nbody/3body.txt
 * http://www.cs.princeton.edu/introcs/34nbody/4body.txt
 * http://www.cs.princeton.edu/introcs/34nbody/2bodyTiny.txt
 *
 * This data-driven program simulates motion in the universe defined by the
 * standard input stream, increasing time at the rate on the command line.
 *
 * % java Universe 25000 4body.txt
 *
 *
 *****************************************************************************
 */
public class Universe {

    private final double radius;     // radius of universe
    private final int N;             // number of bodies
    private final Body[] orbs;       // array of N bodies
    private static ArrayList masses;

    // read universe from file
    /**
     * Creates and simulates the universe
     *
     * @param fileName Where to get the values for the bodies
     */
    public Universe(String fileName) {

        // the authors' version reads from standard input
        // our version reads from a file
        In inputStream = new In(fileName);

        // number of bodies
        N = inputStream.readInt();

        // the set scale for drawing on screen
        radius = inputStream.readDouble();
        StdDraw.setCanvasSize(2000, 1587);
        StdDraw.setXscale(-radius, +radius);
        StdDraw.setYscale(-radius, +radius);

        // read in the N bodies
        orbs = new Body[N];
        for (int i = 0; i < N; i++) {
            double rx = inputStream.readDouble();
            double ry = inputStream.readDouble();
            double vx = inputStream.readDouble();
            double vy = inputStream.readDouble();
            double mass = inputStream.readDouble();
            double size = inputStream.readDouble();
            int red = inputStream.readInt();
            int green = inputStream.readInt();
            int blue = inputStream.readInt();
            Color color = new Color(red, green, blue);
            double[] position = {rx, ry};
            double[] velocity = {vx, vy};
            Vector r = new Vector(position);
            Vector v = new Vector(velocity);
            orbs[i] = new Body(r, v, mass, size, color);
        } // for
    } // Universe()

    // increment time by dt units, assume forces are constant in given interval
    /**
     *
     * @param dt The force of TIME AND SPACE
     */
    public void increaseTime(double dt) {

        // initialize the forces to zero
        Vector[] f = new Vector[N];
        for (int i = 0; i < N; i++) {
            f[i] = new Vector(new double[2]);
        } // for

        // compute the forces
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    f[i] = f[i].plus(orbs[i].forceFrom(orbs[j]));
                } // if
            } // for
        } // for

        // move the bodies
        for (int i = 0; i < N; i++) {
            orbs[i].move(f[i], dt);
        } // for
    } // increaseTime( double )

    // draw the N bodies
    /**
     *
     */
    public void draw() {
        for (int i = 0; i < N; i++) {
            orbs[i].draw();
        } // for
    } // draw()

    // client to simulate a universe

    /**
     *
     * @param args holds two values, the default time, and the text file the universe generates from.
     */
    public static void main(String[] args) {
        Universe newton = new Universe(args[1]);
        double dt = Double.parseDouble(args[0]);
        while (true) {
            StdDraw.clear(StdDraw.BLACK); //change background coior
            StdDraw.picture(0, 0, "trinity.jpg"); //changes background picture
            newton.increaseTime(dt);
            StdDraw.setPenRadius(10);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(-newton.radius, -newton.radius, "Speed of Universe: " + dt);
            newton.draw();
            StdDraw.show(10);
            if (StdDraw.hasNextKeyTyped()) {
                char nextKeyTyped = StdDraw.nextKeyTyped();
                switch (nextKeyTyped) {
                    case 'p':
                        if (dt == 0) {
                            dt = 20000; //return to normal
                        }//if
                        else {
                            dt = 0; //pause
                        }//else
                        break;
                    case 'r':
                        dt = dt*-1; //reverse time
                        break;
                    case '+':
                        dt += 20000; //increase speed
                        break;
                    case '-':
                        dt -= 20000; //decrease speed
                        break;
                    case '/':
                        dt = dt/2; //halve speed
                    default:
                        break;
                }//switch
            }//if
        } // while
    } // main( String [] )
} // Universe
