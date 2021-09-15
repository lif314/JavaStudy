package timer;

/**
 * interface and callback
 * Timer class --- java.swing
 */
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

public class TimerTest
{
    public static void main(String[] args) {

        var listener = new TimePrinter();

        // construct a timer that calls the listener
        // once every second
        var timer = new Timer(1000, listener); // unit: ms
        timer.start();

        // keep program runing until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?"); // a frame to hint and OK button
        System.exit(0);
    }
}


class TimePrinter implements ActionListener  // Timer interface
{
    public void actionPerformed(ActionEvent event)  // input a object, not a function
    {
        System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen())); // call the object's method
        Toolkit.getDefaultToolkit().beep(); // Toolkit --- GUI package
    }
}