package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String input = JOptionPane.showInputDialog("What's your name");
JOptionPane.showMessageDialog(null, "Hi "+ input+"!");

}}
