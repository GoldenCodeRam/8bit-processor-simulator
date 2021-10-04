package com.uptc.simulator.forms;

import javax.swing.*;
import java.awt.*;

public class ProgramCounterForm {
    private JPanel programCounterPanel;
    private ByteViewerForm programCounterByteViewer;

    public String getProgramCounterValue() {
        return programCounterByteViewer.getByte();
    }

    public void counterEnable() {
        programCounterByteViewer.increaseByte();
    }

    private void createUIComponents() {
        programCounterByteViewer = new ByteViewerForm();
        programCounterByteViewer.setActiveBits(4);
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
        programCounterPanel = new JPanel();
        programCounterPanel.setLayout(new GridBagLayout());
        final JLabel label1 = new JLabel();
        label1.setText("Program Counter");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        programCounterPanel.add(label1, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        programCounterPanel.add(programCounterByteViewer.$$$getRootComponent$$$(), gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return programCounterPanel;
    }

}
