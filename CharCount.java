import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CharCount extends JFrame implements ActionListener {
    JLabel lb1, lb2, lb3;
    JTextArea ta;
    JButton b;
    JButton pad, text;

    CharCount() {
        super("WORD COUNTER");
        lb1 = new JLabel("Characters:- ");
        lb1.setBounds(300, 80, 100, 20);
        lb2 = new JLabel("Words:- ");
        lb2.setBounds(300, 100, 100, 20);
        lb3 = new JLabel("~By @SURAJ~KUMAR®");
        lb3.setBounds(1070, 660, 200, 40);

        ta = new JTextArea();
        Font textFont = new Font(Font.SANS_SERIF, Font.BOLD,16);
        ta.setBounds(300, 140, 930, 510);
        ta.setFont(textFont);

        b = new JButton("Click");
        b.setBounds(300, 660, 80, 30);// x,y,w,h
        b.addActionListener(this);

        pad = new JButton("Pad Color");
        pad.setBounds(390, 660, 100, 30);// x,y,w,h
        pad.addActionListener(this);

        text = new JButton("Text Color");
        text.setBounds(500, 660, 100, 30);// x,y,w,h
        text.addActionListener(this);

        Font txtFont = new Font(Font.SANS_SERIF, Font.ITALIC,14);
        lb2.setFont(txtFont);
        lb1.setFont(txtFont);
        lb3.setFont(txtFont);


        add(lb1);
        add(lb2);
        add(lb3);
        add(ta);
        add(b);
        add(pad);
        add(text);

        setSize(1600, 825);
        setLayout(null);// using no layout manager
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            String text = ta.getText();
            lb1.setText("Characters: " + text.length());
            String words[] = text.split("\\s");
            lb2.setText("Words: " + words.length);
        } else if (e.getSource() == pad) {
            Color c = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
            ta.setBackground(c);
        } else if (e.getSource() == text) {
            Color c = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
            ta.setForeground(c);
        }
    }
    public static void main(String[] args) {
        new CharCount();
    }
}