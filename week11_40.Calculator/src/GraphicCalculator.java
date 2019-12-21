
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calc;
    private JButton reset;
    private JTextField input;
    private JTextField output;
    
    public GraphicCalculator(){
        this.calc= new Calculator();
    }
    
    public JTextField getInput() {
        return input;
    }

    public JTextField getOutput() {
        return output;
    }

    public JButton getReset() {
        return reset;
    }

    public Calculator getCalculatorLogic() {
        return calc;
    }

    public int getOutputValue() {
        return Integer.parseInt(this.toString(this.output));
    }
    
    public int getInputValue() {
        return Integer.parseInt(this.toString(this.input));
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300,150));
        frame.setLayout(new GridLayout(3, 1));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        output = new JTextField("0");
        output.setEnabled(false);

        input = new JTextField("0");

        container.add(output);
        container.add(input);
        container.add(createPanel(output, input), BorderLayout.SOUTH);
    }
    
     private JPanel createPanel(JTextField output, JTextField input) {
        JPanel panel = new JPanel(new GridLayout(1, 3));

        reset = new JButton("Z");
        reset.addActionListener(new ResetClickListener(this));
        reset.setEnabled(false);

        JButton add = new JButton("+");
        add.addActionListener(new AddClickListener(this));

        JButton subtract = new JButton("-");
        subtract.addActionListener(new SubtractClickListener(this));

        panel.add(add);
        panel.add(subtract);
        panel.add(reset);

        return panel;
    }
     
     public boolean isInputInteger() {
        try {
            Integer.parseInt(this.toString(this.input));
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public String toString(JTextField JTextField) {
        return JTextField.getText();
    }


    public JFrame getFrame() {
        return frame;
    }
}
