package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calc;
    
    public UserInterface(Calculator calc){
        this.calc=calc;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(2,1));
        JLabel number = new JLabel("0");
        JButton button = new JButton("Click!");
        
        ClickListener click = new ClickListener(this.calc, number);
        button.addActionListener(click);
        
        container.add(number);
        container.add(button);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
