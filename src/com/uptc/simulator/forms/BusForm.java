package com.uptc.simulator.forms;

import javax.swing.*;
import java.awt.*;

public class BusForm {
  private JPanel busFormPanel;
  private ByteViewerForm byteViewer;

  {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
    $$$setupUI$$$();
  }

  /**
   * Method generated by IntelliJ IDEA GUI Designer
   * >>> IMPORTANT!! <<<
   * DO NOT edit this method OR call it in your code!
   *
   * @noinspection ALL
   */
  private void $$$setupUI$$$() {
    createUIComponents();
    busFormPanel = new JPanel();
    busFormPanel.setLayout(new GridBagLayout());
    GridBagConstraints gbc;
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 1;
    busFormPanel.add(byteViewer.$$$getRootComponent$$$(), gbc);
    final JLabel label1 = new JLabel();
    label1.setHorizontalAlignment(0);
    label1.setHorizontalTextPosition(0);
    label1.setText("Bus");
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    busFormPanel.add(label1, gbc);
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return busFormPanel;
  }

  public void increaseBus() {
    byteViewer.increaseByte();
  }

  private void createUIComponents() {
    byteViewer = new ByteViewerForm();
  }
}