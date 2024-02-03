package SPR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;;

public class SPR implements ActionListener{
    
    JFrame frame;
    JLabel heading,heading2,heading3;
    JTextField TF1,TF2;
    JButton RockButton,PaperButton,ScissorButton;
    JPanel panel;

    Font myFont=new Font("Serif",Font.BOLD,30);
    Font myFont1=new Font("Monospaced",Font.BOLD,25);
    int computer,you;
    String com;
    Random random=new Random();


    public static void main(String[] args) {
        new SPR();
    }

    SPR(){

            frame =new JFrame("Scissor-Paper-Rock");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,550);
            frame.setLayout(null);

            heading= new JLabel("Computer");
            heading.setBounds(24,20,200,32);
            heading.setFont(myFont);

            TF1=new JTextField();
            TF1.setBounds(24,57,200,32);
            TF1.setFont(myFont);
            TF1.setEditable(false);

            RockButton =new JButton("ROCK");
            PaperButton =new JButton("PAPER");
            ScissorButton =new JButton("SCISSOR");
            
            heading2= new JLabel("You");
            heading2.setBounds(24,94,200,32);
            heading2.setFont(myFont);

            panel =new JPanel();
            panel.setBounds(24, 131, 380, 64);
            panel.setBackground(Color.MAGENTA);
            panel.setLayout(new GridLayout(1,3,10,10));

            panel.add(RockButton);
            panel.add(ScissorButton);
            panel.add(PaperButton);

            RockButton.addActionListener(this);
            PaperButton.addActionListener(this);
            ScissorButton.addActionListener(this);

            heading3= new JLabel("Result");
            heading3.setBounds(24,200,200,32);
            heading3.setFont(myFont);

            TF2=new JTextField();
            TF2.setBounds(24,240,200,32);
            TF2.setFont(myFont1);
            TF2.setEditable(false);

            // TF2=new JTextField();
            // TF2.setBounds(24,94,291,32);
            // TF2.setFont(myFont);
            // TF2.setEditable(false);
            // frame.setBackground(Color.GREEN);

            
            frame.add(heading);   
            frame.add(TF1);
            frame.add(heading2);
            frame.add(panel);
            frame.add(heading3);
            frame.add(TF2);
            frame.setVisible(true);
    }

    @Override
    public  void actionPerformed(ActionEvent e){
        computer=random.nextInt(3);
        if (computer==0) {
            com="Scissor";
            TF1.setText("Scissor");            
        }else if (computer==1) {
            com="Paper";
            TF1.setText("Paper");     
        }else{
            com="Rock";
            TF1.setText("Rock");     
        }

        if (e.getSource()==RockButton) {
            switch (com) {
                case "Paper":
                        TF2.setText("Computer wins");
                    break;
                case "Scissor":
                        TF2.setText("You win.");
                    break;
                default:
                        TF2.setText("It is a tie.");
                    break;
            }
        }
        if (e.getSource()==PaperButton) {
            switch (com) {
                case "Rock":
                     TF2.setText("You win.");
                    break;
                 case "Scissor":
                        TF2.setText("Computer win.");
                    break;
                default:
                      TF2.setText("It is a tie.");
                    break;
            }
        }
        if (e.getSource()==ScissorButton) {
            switch (com) {
                case "Rock":
                    TF2.setText("Computer win.");
                break;
                case "Paper":
                        TF2.setText("You win.");
                    break;
                default:
                      TF2.setText("It is a tie.");
                break;
            }
        }

    }
}
