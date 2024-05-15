package com.mycompany.accounts;
import javax.swing.*;
import java.awt.*;

public class register {

private JFrame reg = new JFrame("Register");
private JTextField txtfname, txtlname, txtmname, txtcnum, txtaccnum, txtmpin, txtaddress, txtemail = new JTextField();
//private JTextField txtfname, txtlname, txtmname, txtcnum, txtaccnum, txtmpin, txtaddress, txtemail;
private JLabel lblfname, lbllname, lblmname, lblcnum, lblaccnum, lblmpin, lbladdress, lblemail = new JLabel();

public register(){
   reg.setVisible(true);
   reg.setResizable(false);
   reg.setSize(700,600);
   reg.setLayout(null);
   reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
           
   lblfname = new JLabel("First name: ");
   lblfname.setBounds(30, 100, 120, 30);
   txtfname.setBounds(150, 100, 120, 30);
   txtfname.setFont(new Font("Helvetica", Font.BOLD, 15));
   
   lblmname = new JLabel("Middle Name: ");
   lblmname.setBounds(30, 150, 120, 30);
   txtmname.setBounds(150, 150, 120, 30);
   txtmname.setFont(new Font("Helvetica", Font.BOLD, 15));
   
   lbllname = new JLabel("Last name: ");
   lbllname.setBounds(30, 200, 120, 30);
   txtlname.setBounds(150, 200, 120, 30);
   txtlname.setFont(new Font("Helvetica", Font.BOLD, 15));

   lblcnum = new JLabel("Contact Number: ");
   lblcnum.setBounds(30, 250, 120, 30);
   txtcnum.setBounds(150, 250, 120, 30);
   txtcnum.setFont(new Font("Helvetica", Font.BOLD, 15));
   
   lbladdress = new JLabel("Address: ");
   lbladdress.setBounds(330, 100, 120, 30);
   txtaddress.setBounds(450, 100, 120, 30);
   txtaddress.setFont(new Font("Helvetica", Font.BOLD, 15));
   
   lblemail = new JLabel("Email: ");
   lblemail.setBounds(330, 150, 120, 30);
   txtemail.setBounds(450, 150, 120, 30);
   txtemail.setFont(new Font("Helvetica", Font.BOLD, 15));
   
   lblaccnum = new JLabel("Account number: ");
   lblaccnum.setBounds(330, 200, 120, 30);
   txtaccnum.setBounds(450, 200, 120, 30);
   txtaccnum.setFont(new Font("Helvetica", Font.BOLD, 15));

   lblmpin = new JLabel("MPIN: ");
   lblmpin.setBounds(330, 250, 120, 30);
   txtmpin.setBounds(430, 250, 120, 30);
   txtmpin.setFont(new Font("Helvetica", Font.BOLD, 15));
   
   reg.add(lblfname);
   reg.add(txtfname);
   reg.add(lbllname);
   reg.add(txtlname);
   reg.add(lblmname);
   reg.add(txtmname);
   reg.add(lblcnum);
   reg.add(txtcnum);
   reg.add(lbladdress);
   reg.add(txtaddress);
   reg.add(lblaccnum);
   reg.add(txtaccnum);
   reg.add(lblemail);
   reg.add(txtemail);
   reg.add(lblmpin);
   reg.add(txtmpin);
}
}
