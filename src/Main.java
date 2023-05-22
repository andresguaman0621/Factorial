import javax.swing.*;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz formaPrincipal = new Interfaz();

                formaPrincipal.setContentPane(formaPrincipal.getMainPanel());
                formaPrincipal.setBounds(100,100,500,500);
                formaPrincipal.setVisible(true);
                formaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

    }
}