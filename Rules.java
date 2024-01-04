import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start, back;

    Rules(String name){
        this.name = name;

        getContentPane().setBackground(Color.white);
        setLayout(null );

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50,20,700,70);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,420);
        rules.setFont(new Font("Times New Roman",Font.PLAIN,22));
        
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br>" +
                "2. Read the question carefully and then wisely choose your answer" + "<br>" +
                "3. Each and every question compulsory to attend " + "<br>" +
                "4. You can't repeat the question " + "<br>" +
                "5. 15 seconds will be the max time will be given for one question" + "<br>" +
                "6. Try to give answers of each and every question" + "<br>" +
                "7. Be clear with your answers" + "<br>" +
                "8. Good Luck" + "<br>" +
            "<html>"

        );
        add(rules);


        

         back = new JButton("Back");
        back.setBounds(250, 500 , 100 , 30 );
        back.setBackground(Color.cyan);
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500 , 120 , 25 );
        start.setBackground(Color.cyan);
        start.setForeground(Color.black);
        start.addActionListener(this);
        add(start);

        
       setSize(800, 650);
       setLocation(350,100);
       setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() ==start){
            setVisible(false);
            new Quiz(name);

        }else {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("user");
    }
    
}
