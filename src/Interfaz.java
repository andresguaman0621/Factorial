import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton ACEPTARButton;
    private JTextArea textArea1;
    private Factorial f = new Factorial();


    public Interfaz() {
        ACEPTARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultant = f.factorialIterativo(Integer.parseInt(textField1.getText()));
                textArea1.append("ITERATIVO: "+String.valueOf(resultant));

                int resultant_dos = f.factorialRecursivo(Integer.parseInt(textField1.getText()));
                textArea1.append("\nRECURSIVO: "+ resultant_dos);

                int sumas= f.sumaNumeros(Integer.parseInt(textField1.getText()));
                textArea1.append("\n\nSUMAS CON FOR: "+sumas);

                int sumas_dos= f.sumasRecursividad(Integer.parseInt(textField1.getText()));
                textArea1.append("\nSUMAS CON RECURSIVIDAD: "+sumas_dos);

                int sumaRecursividad = f.sumasRecursividad(Integer.parseInt(textField1.getText()));
                textArea1.append("\n\nSUMAS CON RECURSIVIDAD: "+sumaRecursividad);
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
