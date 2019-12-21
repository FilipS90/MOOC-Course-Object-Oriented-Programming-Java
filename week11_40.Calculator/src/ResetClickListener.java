
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filip
 */
public class ResetClickListener implements ActionListener {
    
    private Calculator calc;
    private GraphicCalculator calculatorUI;
    private JTextField input;
    private JTextField output;
    private JButton reset;

    public ResetClickListener(GraphicCalculator calculatorUI) {
        this.calculatorUI = calculatorUI;
        this.calc = calculatorUI.getCalculatorLogic();
        this.input = calculatorUI.getInput();
        this.output = calculatorUI.getOutput();
        this.reset = calculatorUI.getReset();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.reset();
        output.setText("" + calc.getValue());
        input.setText("");
        reset.setEnabled(false);
    }

}
