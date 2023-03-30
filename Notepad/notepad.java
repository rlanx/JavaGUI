package Notepad;
import javax.swing.*;
import java.awt.event.*; 
import java.io.*; 

public class notepad{

    public notepad(){

        //create components
        JFrame f = new JFrame("Notepad");
        JTextArea textArea = new JTextArea();

        //setting components
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
    
        //Menubar
        JMenu menu;  
        JMenuItem New, Open, Close, Save, Save_as, Exit;    
          
        JMenuBar mb = new JMenuBar();  
        menu = new JMenu("File");  
        New = new JMenuItem("New");  
        Open = new JMenuItem("Open"); 
        Close = new JMenuItem("Close");  
        Save = new JMenuItem("Save");  
        Save_as = new JMenuItem("Save As"); 
        Exit = new JMenuItem("Exit"); 

        menu.add(New); 
        menu.add(Open); 
        menu.add(Close); 
        menu.addSeparator();
        menu.add(Save); 
        menu.add(Save_as); 
        menu.addSeparator();
        menu.add(Exit);
        mb.add(menu);  
        f.setJMenuBar(mb);  

        //add components
        f.add(textArea);
        f.setSize(500,410);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String []args){
        notepad pad = new notepad();
    }

    
}