package com.uptc.simulator.controller;

import com.uptc.simulator.forms.MainForm;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    new Main();
  }

  private Main() {
    this.initialize();
  }

  private void initialize() {
    JFrame frame = new JFrame("8-bit Simulator");
    frame.setContentPane(new MainForm().$$$getRootComponent$$$());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
