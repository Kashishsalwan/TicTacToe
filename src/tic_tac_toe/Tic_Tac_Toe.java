/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic_tac_toe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahul Grover
 */
public class Tic_Tac_Toe implements ActionListener
{

    /**
     * @param args the command line arguments
     */
    
    JFrame jf;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    int count=0;
    String str=" ";
    boolean b=false;
    

    Tic_Tac_Toe()
    {
       JFrame jf=new JFrame("TicTacToeGame by Rahul");
       jf.setSize(500,500);
       jf.setDefaultCloseOperation(3);
       jf.setLocationRelativeTo(null);
       jf.setLayout(new GridLayout(3,3));
       
       jb1=new JButton();
       jb1.setBackground(Color.red);
       jb1.addActionListener(this);
       jf.add(jb1);
       
       jb2=new JButton();
       jb2.setBackground(Color.red);
       jb2.addActionListener(this);
       jf.add(jb2);
       
       jb3=new JButton();
       jb3.setBackground(Color.red);
       jb3.addActionListener(this);
       jf.add(jb3);
       
       jb4=new JButton();
       jb4.setBackground(Color.red);
       jb4.addActionListener(this);
       jf.add(jb4);
       
       jb5=new JButton();
       jb5.setBackground(Color.red);
       jb5.addActionListener(this);
       jf.add(jb5);
       
       jb6=new JButton();
       jb6.setBackground(Color.red);
       jb6.addActionListener(this);
       jf.add(jb6);
       
       jb7=new JButton();
       jb7.setBackground(Color.red);
       jb7.addActionListener(this);
       jf.add(jb7);
       
       jb8=new JButton();
       jb8.setBackground(Color.red);
       jb8.addActionListener(this);
       jf.add(jb8);
       
       jb9=new JButton();
       jb9.setBackground(Color.red);
       jb9.addActionListener(this);
       jf.add(jb9);
       
       
       
       jf.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Tic_Tac_Toe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         //To change body of generated methods, choose Tools | Templates.
         count+=1;
         if(count%2==0)
         {
             str="X";
         }
         else
         {
             str="0";
         }
         if(e.getSource()==jb1)
         {
             jb1.setText(str);
             jb1.setFont(new Font("Arial",1,50));
             jb1.setEnabled(false);
         }
         if(e.getSource()==jb2)
         {
             jb2.setText(str);
             jb2.setFont(new Font("Arial",1,50));
             jb2.setEnabled(false);
         }
         if(e.getSource()==jb3)
         {
             jb3.setText(str);
             jb3.setFont(new Font("Arial",1,50));
             jb3.setEnabled(false);
         }
         if(e.getSource()==jb4)
         {
             jb4.setText(str);
             jb4.setFont(new Font("Arial",1,50));
             jb4.setEnabled(false);
         }
         if(e.getSource()==jb5)
         {
             jb5.setText(str);
             jb5.setFont(new Font("Arial",1,50));
             jb5.setEnabled(false);
         }
         if(e.getSource()==jb6)
         {
             jb6.setText(str);
             jb6.setFont(new Font("Arial",1,50));
             jb6.setEnabled(false);
         }
         if(e.getSource()==jb7)
         {
             jb7.setText(str);
             jb7.setFont(new Font("Arial",1,50));
             jb7.setEnabled(false);
         }
         if(e.getSource()==jb8)
         {
             jb8.setText(str);
             jb8.setFont(new Font("Arial",1,50));
             jb8.setEnabled(false);
         }
         if(e.getSource()==jb9)
         {
             jb9.setText(str);
             jb9.setFont(new Font("Arial",1,50));
             jb9.setEnabled(false);
         }
         winningPossibilities();
          whoWins();
        
      }
    void winningPossibilities()
    {
        if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText()!="" )
        {
            b=true;
        }
        else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb4.getText()!="" )
        {
            b=true;
        }
        else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb7.getText()!="" )
        {
            b=true;
        }
        else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb1.getText()!="" )
        {
            b=true;
        }
        else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb2.getText()!="" )
        {
            b=true;
        }
        else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb3.getText()!="" )
        {
            b=true;
        }
        else  if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb1.getText()!="" )
        {
            b=true;
        }
        else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb3.getText()!="" )
        {
            b=true;
        }
        else
        {
            b=false;
        }
        
    }
     
    void whoWins()
     {
         if(b==true)
         {
             JOptionPane.showMessageDialog(jf, str+ " Wins");
             restartGame();
         }
         else if(count==9)
         {
             JOptionPane.showMessageDialog(jf,"Draw");
             restartGame();
         }
     }
    void restartGame()
    {
        int i=JOptionPane.showConfirmDialog(jf,"Do You want to restart the game?");
        if(i==0)
        {
            jb1.setText("");
            jb1.setEnabled(true);
            
            jb2.setText("");
            jb2.setEnabled(true);
            
            jb3.setText("");
            jb3.setEnabled(true);
            
            jb3.setText("");
            jb3.setEnabled(true);
            
            jb4.setText("");
            jb4.setEnabled(true);
            
            jb5.setText("");
            jb5.setEnabled(true);
            
            jb6.setText("");
            jb6.setEnabled(true);
            
            jb7.setText("");
            jb7.setEnabled(true);
            
            jb8.setText("");
            jb8.setEnabled(true);
            
            jb9.setText("");
            jb9.setEnabled(true);
            
            count=0;
            str="";
            b=false;
            
          }
        else if(i==1)
        {
            System.exit(0);
        }
        else
        {
            jb1.setEnabled(false);
            jb2.setEnabled(false);
            jb3.setEnabled(false);
            jb4.setEnabled(false);
            jb5.setEnabled(false);
            jb6.setEnabled(false);
            jb7.setEnabled(false);
            jb8.setEnabled(false);
            jb9.setEnabled(false);
        }
    }
}
