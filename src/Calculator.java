import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    boolean isOperatorClicked=false;
    String oldValue,nextValue;
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton,eightButton,nineButton,sixButton,fiveButton,fourButton,oneButton,twoButton,threeButton,zeroButton,dotButton,multiButton,divButton,addButton,subButton,equalButton,clearButton;
    public Calculator()
    {
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,100);
        displayLabel=new JLabel();
        displayLabel.setBounds(30,40,500,40);
        displayLabel.setBackground(Color.BLACK);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);


        sevenButton =new JButton("7");
        sevenButton.setBounds(30,130,60,60);
        sevenButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(sevenButton);
        sevenButton.addActionListener(this);


        eightButton =new JButton("8");
        eightButton.setBounds(130,130,60,60);
        eightButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton =new JButton("9");
        nineButton.setBounds(230,130,60,60);
        nineButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(nineButton);
        nineButton.addActionListener(this);

        fourButton =new JButton("4");
        fourButton.setBounds(30,230,60,60);
        fourButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton =new JButton("5");
        fiveButton.setBounds(130,230,60,60);
        fiveButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton =new JButton("6");
        sixButton.setBounds(230,230,60,60);
        sixButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(sixButton);
        sixButton.addActionListener(this);

        oneButton =new JButton("1");
        oneButton.setBounds(30,330,60,60);
        oneButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(oneButton);
        oneButton.addActionListener(this);

        twoButton =new JButton("2");
        twoButton.setBounds(130,330,60,60);
        twoButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton =new JButton("3");
        threeButton.setBounds(230,330,60,60);
       threeButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(threeButton);
        threeButton.addActionListener(this);

        dotButton =new JButton(".");
        dotButton.setBounds(30,430,60,60);
        dotButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(dotButton);




        zeroButton =new JButton("0");
        zeroButton.setBounds(130,430,60,60);
        zeroButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(zeroButton);
        zeroButton.addActionListener(this);


        equalButton =new JButton("=");
        equalButton.setBounds(230,430,60,60);
        equalButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(equalButton);
        equalButton.addActionListener(this);

        divButton =new JButton("/");
        divButton.setBounds(330,130,60,60);
        divButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(divButton);

        multiButton =new JButton("*");
        multiButton.setBounds(330,230,60,60);
        multiButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(multiButton);

        subButton =new JButton("-");
        subButton.setBounds(330,330,60,60);
        subButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(subButton);

        addButton =new JButton("+");
        addButton.setBounds(330,430,60,60);
        addButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(addButton);
        addButton.addActionListener(this);

        clearButton =new JButton("c");
        clearButton.setBounds(430,430,60,60);
        clearButton.setFont(new Font("Arial", Font.PLAIN,40));
        jf.add(clearButton);
        clearButton.addActionListener(this);



        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==sevenButton) {
            if (isOperatorClicked) {
                displayLabel.setText("7");
                isOperatorClicked = false;
            } else {

                displayLabel.setText(displayLabel.getText() + "7");
            }
        }
        else if (e.getSource()==eightButton)
                if(isOperatorClicked)
                {
                    displayLabel.setText("8");
                    isOperatorClicked = false;
                }
        else
        {
            displayLabel.setText(displayLabel.getText()+"8");
        }
        else if (e.getSource()==nineButton)
        {
            displayLabel.setText(displayLabel.getText()+"9");
        }        else if (e.getSource()==sevenButton)
        {
            displayLabel.setText(displayLabel.getText()+"7");
        }        else if (e.getSource()==sixButton)
        {
            displayLabel.setText(displayLabel.getText()+"6");
        }        else if (e.getSource()==fiveButton)
        {
            displayLabel.setText(displayLabel.getText()+"5");
        }        else if (e.getSource()==fourButton)
        {
            displayLabel.setText(displayLabel.getText()+"4");
        }
        else if (e.getSource()==threeButton)
        {
            displayLabel.setText(displayLabel.getText()+"3");
        }
        else if (e.getSource()==twoButton)
        {
            displayLabel.setText(displayLabel.getText()+"2");
        }
        else if (e.getSource()==oneButton)
        {
            displayLabel.setText(displayLabel.getText()+"1");
        }
        else if (e.getSource()==zeroButton)
        {
            displayLabel.setText(displayLabel.getText()+"0");
        }
        else if (e.getSource()==dotButton)
        {
            displayLabel.setText(displayLabel.getText()+".");
        } else if (e.getSource()==equalButton)
        {
           String newValue= displayLabel.getText();
            String nextValue=displayLabel.getText();
           float oldValueF=Float.parseFloat(oldValue);
           float newValueF=Float.parseFloat(newValue);
           float newNext=Float.parseFloat(nextValue);
            float result= oldValueF+newValueF-newNext;
            displayLabel.setText(result+"");
        }

        else if (e.getSource()==addButton)
        {
          isOperatorClicked=true;
          oldValue=displayLabel.getText();
          nextValue=displayLabel.getText();

        } else if (e.getSource()==subButton)
        {
            displayLabel.setText("");
        }
        else if (e.getSource()==multiButton)
        {
            displayLabel.setText("");
        }
        else if (e.getSource()==divButton)
        {
            displayLabel.setText("");
        }


        else if (e.getSource()==clearButton)
        {
            displayLabel.setText("");
        }
    }
}
