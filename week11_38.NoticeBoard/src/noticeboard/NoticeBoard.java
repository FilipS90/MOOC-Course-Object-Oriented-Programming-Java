package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;
    
    public NoticeBoard(){
    }

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3,1));
        JTextField textAreaUp = new JTextField("");
        JLabel textAreaDown = new JLabel("");
        JButton copyButton = new JButton("Copy!");
        
        AreaCopier copier = new AreaCopier(textAreaUp, textAreaDown);
        copyButton.addActionListener(copier);
        
        container.add(textAreaUp);
        container.add(copyButton);
        container.add(textAreaDown);
    }

    
}
