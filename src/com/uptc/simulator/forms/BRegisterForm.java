package com.uptc.simulator.forms;

import javax.swing.*;
import java.awt.*;

public class BRegisterForm {
  public ALUForm aluForm;

  private JPanel BRegisterPanel;
  private ByteViewerForm BRegisterByteViewer;

  public String getBRegisterValue() { return BRegisterByteViewer.getByte(); }

  public void setBRegisterValue(String value) {
    BRegisterByteViewer.setByte(value);
    aluForm.setBRegisterValue(BRegisterByteViewer.getByte());
  }

  private void createUIComponents() {
    BRegisterByteViewer = new ByteViewerForm();
  }

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
    BRegisterPanel = new JPanel();
    BRegisterPanel.setLayout(new GridBagLayout());
    GridBagConstraints gbc;
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 1;
    BRegisterPanel.add(BRegisterByteViewer.$$$getRootComponent$$$(), gbc);
    final JLabel label1 = new JLabel();
    label1.setText("B Register");
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    BRegisterPanel.add(label1, gbc);
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return BRegisterPanel;
  }
}