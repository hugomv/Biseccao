import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;

public class BisceccaoGui {



    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JPanel painel;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JTextField textField7;

    public BisceccaoGui() {
        button1.addActionListener(new ActionListener() {

            Biseccaco biseccaco = new Biseccaco();
            @Override
            public void actionPerformed(ActionEvent e) {
                Float a5 = Float.parseFloat(textField1.getText());
                Float a4 = Float.parseFloat(textField2.getText());
                Float a3 = Float.parseFloat(textField3.getText());
                Float a2 = Float.parseFloat(textField4.getText());
                Float a1 = Float.parseFloat(textField5.getText());
                Float a0 = Float.parseFloat(textField6.getText());
                Integer epsilon = Integer.parseInt(textField7.getText());
                biseccaco.preencherEpsilon(epsilon);
                biseccaco.preencherFuncao(a5,a4,a3,a2,a1,a0);
                textPane1.setText(biseccaco.exibirIntervalos());
                textPane2.setText(biseccaco.exibirRaizes());


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BisceccaoGui");
        frame.setContentPane(new BisceccaoGui().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
