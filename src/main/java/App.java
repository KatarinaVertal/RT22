import canvas.MyCanvas;
import logic.GameLogic;

import javax.swing.*;
import java.awt.*;

public class App {
    public App() {
        JFrame frame = new JFrame("turtle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(814,923);
        frame.setResizable(false);
        frame.setFocusable(true);


        MyCanvas canvas = new MyCanvas();

        GameLogic logic = new GameLogic(frame,canvas);
        frame.addKeyListener(logic);

        JPanel sideMenu = new JPanel();
        sideMenu.setBackground(Color.LIGHT_GRAY);

        String angles[]={"0","5","10","45","90","180"};
        JComboBox cb =new JComboBox(angles);
        cb.addActionListener(logic);

        JSlider slider1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 10);
        slider1.setMinorTickSpacing(10);
        slider1.setMajorTickSpacing(10);
        slider1.setSnapToTicks(true);
        slider1.setPaintTicks(true);
        slider1.setPaintLabels(true);
        slider1.setFocusable(false);
        slider1.addChangeListener(logic);

        JButton buttonA = new JButton("action");
        buttonA.addActionListener(logic);
        buttonA.setFocusable(false);


        JButton buttonB = new JButton("color");
        buttonB.addActionListener(logic);
        buttonB.setFocusable(false);

        JLabel l1= new JLabel("Krok");
        JLabel l2= new JLabel("Farba");

        logic.addLabels(l1,l2);


        sideMenu.setLayout(new GridLayout(2, 3));
        sideMenu.add(cb);
        sideMenu.add(slider1);
        sideMenu.add(buttonA);
        sideMenu.add(l1);
        sideMenu.add(buttonB);
        sideMenu.add(l2);

        frame.add(canvas);
        frame.add(sideMenu, BorderLayout.PAGE_END);


        frame.setVisible(true);
        System.out.println(canvas.getHeight());
        System.out.println(canvas.getWidth());
    }

}
