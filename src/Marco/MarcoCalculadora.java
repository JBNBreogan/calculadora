package Marco;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;

import lamina.LaminaCalculadora;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoCalculadora extends JFrame {

    private JTextField resultado;
    private JTextField escritura;

    public MarcoCalculadora(){
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamano = mipantalla.getScreenSize();
        int anchoPantalla = tamano.width;
        int altoPantalla = tamano.height;
        setSize(anchoPantalla/2,600);
        setLocation(anchoPantalla/4,altoPantalla/4);
        this.setVisible(true);
        setTitle("Calculadora - Breogán Fernández Tacón");

        escritura = new JTextField();
        resultado = new JTextField();
        resultado.setEditable(false);
        escritura.setEditable(false);
        resultado.setFont(new Font("Courier new", Font.PLAIN, 24));
        escritura.setFont(new Font("Courier new", Font.PLAIN, 24));

        //add(resultado, BorderLayout.NORTH);
        add(escritura, BorderLayout.NORTH);

        LaminaCalculadora laminaNums = new LaminaCalculadora();
        LaminaCalculadora laminaSimbs = new LaminaCalculadora();

        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnSum = new JButton("+");
        JButton btnRest = new JButton("-");
        JButton btnDiv = new JButton("/");
        JButton btnMult = new JButton("*");

        laminaNums.add(btn0);
        laminaNums.add(btn1);
        laminaNums.add(btn2);
        laminaNums.add(btn3);
        laminaNums.add(btn4);
        laminaNums.add(btn5);
        laminaNums.add(btn6);
        laminaNums.add(btn7);
        laminaNums.add(btn8);
        laminaNums.add(btn9);

        laminaSimbs.add(btnSum);
        laminaSimbs.add(btnRest);
        laminaSimbs.add(btnMult);
        laminaSimbs.add(btnDiv);

        add(laminaNums, BorderLayout.CENTER);
        add(laminaSimbs, BorderLayout.SOUTH);

        ActionListener numListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = ((JButton) e.getSource()).getText();
                escritura.setText(escritura.getText()+value);
            }
        };

        btn0.addActionListener(numListener);
        btn1.addActionListener(numListener);
        btn2.addActionListener(numListener);
        btn3.addActionListener(numListener);
        btn4.addActionListener(numListener);
        btn5.addActionListener(numListener);
        btn6.addActionListener(numListener);
        btn7.addActionListener(numListener);
        btn8.addActionListener(numListener);
        btn9.addActionListener(numListener);

        btnDiv.addActionListener(numListener);
    }
}