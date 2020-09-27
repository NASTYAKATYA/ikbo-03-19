package pract4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pract_4 extends JFrame {
    int milan=0;
    int madrid=0;
    String lastScorer="None";
    String win="None";
    JButton but1=new JButton("AC Milan");
    JButton but2=new JButton("Real Madrid");
    JLabel lab0=new JLabel("Result: ");
    JLabel lab1=new JLabel(milan+" X "+madrid);
    JLabel lab2=new JLabel("Last Scorer: ");
    JLabel lab3=new JLabel(lastScorer);
    JLabel lab4=new JLabel("Winner: ");
    JLabel lab5=new JLabel(win);
    JPanel[] pnl = new JPanel[8];
    public Pract_4(){
        super("Practice_4");
        setLayout(new FlowLayout());
        setLayout(new GridLayout(4,2));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[0].add(lab0);
        pnl[1].add(lab1);
        pnl[2].add(lab2);
        pnl[3].add(lab3);
        pnl[4].add(lab4);
        pnl[5].add(lab5);
        pnl[6].add(but1);
        pnl[7].add(but2);
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if (ae.getSource() == but1) {
                    milan++;
                    lastScorer="AC Milan";
                    lab1.setText(String.valueOf(milan)+" X "+String.valueOf(madrid));
                    lab3.setText(lastScorer);
                    if(madrid>milan){
                        win="Real Madrid";
                        lab5.setText(win);
                    }
                    if(milan==madrid) {
                        win="--";
                        lab5.setText(win);
                    }
                    if(madrid<milan){
                        win="AC Milan";
                        lab5.setText(win);
                    }
                }

            }
        });
        but2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if (ae.getSource() == but2) {
                    madrid++;
                    lastScorer="Real Madrid";
                    lab1.setText(String.valueOf(milan)+" X "+String.valueOf(madrid));
                    lab3.setText(lastScorer);
                    if(madrid>milan){
                        win="Real Madrid";
                        lab5.setText(win);
                    }
                    if(milan==madrid) {
                    win="--";
                    lab5.setText(win);
                    }
                    if(madrid<milan){
                        win="AC Milan";
                        lab5.setText(win);
                    }
                }

            }
        });

        setSize(400,250);
    }
    public static void main(String[]args)
    {
        new Pract_4().setVisible(true);
    }
}