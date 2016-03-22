package nbody;

import edu.princeton.cs.StdDraw;
import java.awt.Color;
import java.util.ArrayList;

/**
 * ****************************************************************************
 * Compilation: javac Body.java Execution: java Body Dependencies: Vector.java
 * StdDraw.java
 *
 * Implementation of a 2D Body with a position, velocity and mass.
 *
 *
 *****************************************************************************
 */
public class Body {

    private Vector r;      // position
    private Vector v;      // velocity
    private final double mass;   // mass
    private final Color color; //try to choose color
    private final double size;
    private ArrayList<double[]> tail = new ArrayList<>();

    /**
     *
     * @param r position
     * @param v velocity
     * @param mass mass of bodies
     * @param size changes the size of the dots in input file
     * @param color this changes the colors in RGB format
     */
    public Body(Vector r, Vector v, double mass, double size, Color color) {
        this.r = r;
        this.v = v;
        this.mass = mass;
        this.size = size * 0.05;
        this.color = color;

    } // Body( Vector, Vector, double )

    public void move(Vector f, double dt) {
        Vector a = f.times(1 / mass);
        v = v.plus(a.times(dt));
        r = r.plus(v.times(dt));
        this.update(r);
    } // move( Vector, double )

    public void update(Vector r) {
        double[] position = {r.cartesian(0), r.cartesian(1)};
        tail.add(0, position);
        if (tail.size() > 50 ) {
            tail.remove(tail.size() - 1);
        }
        /*for (int i = 0; i < tail.size() - 1; i++) {
            double[] extra = tail.get(i + 1);
            tail.set(i, extra);
        }//for loop*/

        /*double[] np = {r.cartesian(0), r.cartesian(1)};
        tail.set(149, np);*/
    }

    public Vector forceFrom(Body b) {
        Body a = this;
        double G = 6.67e-11;
        Vector delta = b.r.minus(a.r);
        double dist = delta.magnitude();
        double F = (G * a.mass * b.mass) / (dist * dist);
        return delta.direction().times(F);
    } // forceFrom( Body )

    /**
     * makes the dots appear with the desired size and color
     *
     */
    public void draw() {
        StdDraw.setPenRadius(size); //changes size
        StdDraw.setPenColor(color); //changes the color
        StdDraw.point(r.cartesian(0), r.cartesian(1));
        for (int i = 0; i < tail.size() - 1; i++) {
            double[] first = tail.get(i);
            double[] second = tail.get(i + 1);
            StdDraw.setPenRadius(size*0.5);
            StdDraw.line(first[0], first[1], second[0], second[1]);
        }
    } // draw()
    // GIT IS WORKING
    // this method is only needed if you want to change the size of the bodies

    public void draw(double penRadius) {
        StdDraw.setPenRadius(penRadius);
        StdDraw.point(r.cartesian(0), r.cartesian(1));

    } // draw( double )

} // Body
