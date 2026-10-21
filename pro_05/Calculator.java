import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton add,sub,mul,div,equal,clear;

    double n1,n2,result;
    char op;

    Calculator() {

        setTitle("Simple Calculator");
        setSize(300,380);
        setLayout(new BorderLayout());

        tf = new JTextField();
        tf.setEditable(false);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        tf.setFont(new Font("Arial",Font.BOLD,20));
        add(tf,BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,4,5,5));

        b7=new JButton("7"); b8=new JButton("8"); b9=new JButton("9"); div=new JButton("/");
        b4=new JButton("4"); b5=new JButton("5"); b6=new JButton("6"); mul=new JButton("*");
        b1=new JButton("1"); b2=new JButton("2"); b3=new JButton("3"); sub=new JButton("-");
        clear=new JButton("C"); b0=new JButton("0"); equal=new JButton("="); add=new JButton("+");

        JButton[] buttons={b7,b8,b9,div,b4,b5,b6,mul,b1,b2,b3,sub,clear,b0,equal,add};

        for(JButton b:buttons){
            b.addActionListener(this);
            p.add(b);
        }

        add(p,BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String s=e.getActionCommand();

        if(s.charAt(0)>='0' && s.charAt(0)<='9'){
            tf.setText(tf.getText()+s);
        }
        else if(s.equals("C")){
            tf.setText("");
            n1=n2=result=0;
        }
        else if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
            n1=Double.parseDouble(tf.getText());
            op=s.charAt(0);
            tf.setText("");
        }
        else if(s.equals("=")){
            n2=Double.parseDouble(tf.getText());

            switch(op){
                case '+': result=n1+n2; break;
                case '-': result=n1-n2; break;
                case '*': result=n1*n2; break;
                case '/':
                    if(n2==0){
                        JOptionPane.showMessageDialog(this,"Cannot divide by zero");
                        return;
                    }
                    result=n1/n2;
                    break;
            }

            tf.setText(String.valueOf(result));
        }
    }

    public static void main(String args[]){
        new Calculator();
    }
}
