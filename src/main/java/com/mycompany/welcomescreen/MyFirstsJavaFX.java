/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.welcomescreen;


 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstsJavaFX extends JFrame {

    // Declare components
    JLabel welcomeLabel;
    JTextField nameField;
    JButton clickButton;
    JLabel resultLabel;

    // Constructor
    public MyFirstsJavaFX() {

        // Set JFrame properties
        setTitle("Welcome Application");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create Welcome Label
        welcomeLabel = new JLabel("Welcome!");
        add(welcomeLabel);

        // Create Text Field
        nameField = new JTextField(15);
        add(nameField);

        // Create Button
        clickButton = new JButton("Click Me");
        add(clickButton);

        // Create Result Label
        resultLabel = new JLabel("");
        add(resultLabel);

        // Button Action
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();

                resultLabel.setText("Hello " + name);
            }
        });

        // Display JFrame
        setVisible(true);
    }

    // Main Method
    public static void main(String[] args) {
        new MyFirstsJavaFX();
    }
}   

