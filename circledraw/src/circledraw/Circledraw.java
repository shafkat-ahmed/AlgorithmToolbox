/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circledraw;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import javax.swing.JFrame;
//import java.lang.Math.*;
import java.math.*;
import java.util.Scanner;


public class Circledraw  implements GLEventListener {
    
    private GLU glu;

    public void init(GLAutoDrawable gld) {

        Scanner scanner = new Scanner(System.in);
      
        scanner.close();
        GL2 gl = gld.getGL().getGL2();
        glu = new GLU();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
    }

    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        gl.glPushMatrix();
       
        drawCircle(gl,100,0,0);
        drawCircle(gl,50,0,50);
        drawCircle(gl,50,0,-50);
        drawCircle(gl,50,50,0);
        drawCircle(gl,50,-50,0);
        drawCircle(gl,50,35,35);
        drawCircle(gl,50,35,-35);
        drawCircle(gl,50,-35,35);
        drawCircle(gl,50,-35,-35);
    }

    private void drawCircle(GL2 gl, int r,int a,int b) {
        int y=r;
        int x=0;
        int d=1-r;
        while(y>x)
        {
           
            draw8Way(gl,x,y,a,b);
           if(d<0)
           {
               d=d+2*x+3;
               x++;
           }
           else
           {
               d=d+2*x-2*y+5;
               x++;
               y--;
           }
        }
        
       //ENTER YOUR CODE HERE        
       
    }

    private void draw8Way(GL2 gl, int x, int y,int a,int b) {
        gl.glBegin(GL2.GL_POINTS);
        gl.glVertex2d(x+a, y+b);
        gl.glVertex2d(y+a, x+b);

        gl.glVertex2d(-x+a, y+b);
        gl.glVertex2d(-y+a, x+b);

        gl.glVertex2d(-x+a, -y+b);
        gl.glVertex2d(-y+a, -x+b);


        gl.glVertex2d(x+a, -y+b);
        gl.glVertex2d(y+a, -x+b);
        gl.glEnd();

    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void dispose(GLAutoDrawable arg0) {

    }
     public static void main(String[] args) {

      //getting the capabilities object of GL2 profile        
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);
   
      // The canvas
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      Circledraw drawing = new Circledraw();
      glcanvas.addGLEventListener(drawing);
      glcanvas.setSize(400, 400);
   
      //creating frame
      final JFrame frame = new JFrame ("Circle");
   
      //adding canvas to frame
      frame.getContentPane().add(glcanvas);                 
      frame.setSize(frame.getContentPane().getPreferredSize());
      frame.setVisible(true);
      
      
   }


}
