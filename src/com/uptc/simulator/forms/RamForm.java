package com.uptc.simulator.forms;

import com.uptc.simulator.forms.model.RamTable;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class RamForm {
    private JPanel ramPanel;
    private JTable ramTable;
    private ByteViewerForm currentValueByteViewer;

    public void setValueToAddress(String address) {
        if (address.length() > 4) {
            address = address.substring(4);
        }

        TableModel ramTableModel = ramTable.getModel();
        for (int i = 0; i < ramTableModel.getRowCount(); i++) {
            if (ramTableModel.getValueAt(i, 0).equals(address)) {
                currentValueByteViewer.setByte((String) ramTableModel.getValueAt(i, 1));
                return;
            }
        }
    }

    public String getValue() {
        return currentValueByteViewer.getByte();
    }

    private void createUIComponents() {
        ramTable = new RamTable();
        currentValueByteViewer = new ByteViewerForm();
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
        ramPanel = new JPanel();
        ramPanel.setLayout(new GridBagLayout());
        final JLabel label1 = new JLabel();
        label1.setHorizontalAlignment(0);
        label1.setHorizontalTextPosition(0);
        label1.setText("RAM");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        ramPanel.add(label1, gbc);
        ramTable.setMaximumSize(new Dimension(100, 100));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        ramPanel.add(ramTable, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        ramPanel.add(spacer1, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        ramPanel.add(currentValueByteViewer.$$$getRootComponent$$$(), gbc);
        final JLabel label2 = new JLabel();
        label2.setText("Value in Address");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        ramPanel.add(label2, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return ramPanel;
    }

}
