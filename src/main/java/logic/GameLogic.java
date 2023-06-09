package logic;

import canvas.MyCanvas;
import logic.UniversalAdapter;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionEvent;

public class GameLogic extends UniversalAdapter {
    private final JFrame frame;
    private final MyCanvas canvas;

    public GameLogic(JFrame frame, MyCanvas canvas) {
    this.frame = frame;
    this.canvas = canvas;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        JComboBox cb = (JComboBox) e.getSource();
        JButton b = (JButton) e.getSource();
        if (e.getSource() instanceof JComboBox){
            canvas.getTurtle().setRotation(Integer.parseInt((String.valueOf(cb.getItemAt(cb.getSelectedIndex())))));
        }
        else {
            if(b.getText().equals("action")){
                canvas.getTurtle().move();
                paint();
            }
            else{

            }
        }

    }


    @Override
    public void stateChanged(ChangeEvent e) {
        this.canvas.getTurtle().setLength(((JSlider) e.getSource()).getValue());
    }
}
