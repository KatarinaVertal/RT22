package logic;

import canvas.MyCanvas;
import logic.UniversalAdapter;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionEvent;

public class GameLogic extends UniversalAdapter {
    private final JFrame frame;
    private final MyCanvas canvas;
    private JLabel l1;
    private JLabel l2;

    public GameLogic(JFrame frame, MyCanvas canvas) {
    this.frame = frame;
    this.canvas = canvas;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        super.actionPerformed(e);
        if (e.getSource() instanceof JComboBox){
            JComboBox cb = (JComboBox) e.getSource();
            canvas.getTurtle().setRotation(Integer.parseInt((String.valueOf(cb.getItemAt(cb.getSelectedIndex())))));
            this.l1.setText(this.canvas.getTurtle().getRotation() + ";" + this.canvas.getTurtle().getLength());
        }
        else {
            JButton b = (JButton) e.getSource();
            if(b.getText().equals("action")){
                canvas.getTurtle().move();
                //paint();
            }
            else{
                this.l2.setText("ahoj");
            }
        }
        canvas.repaint();


    }


    @Override
    public void stateChanged(ChangeEvent e) {
        this.canvas.getTurtle().setLength(((JSlider) e.getSource()).getValue());
        this.l1.setText(this.canvas.getTurtle().getRotation() + ";" + this.canvas.getTurtle().getLength());
    }

    public void addLabels(JLabel l1, JLabel l2) {
        this.l1 = l1;
        this.l2 = l2;
    }
}
