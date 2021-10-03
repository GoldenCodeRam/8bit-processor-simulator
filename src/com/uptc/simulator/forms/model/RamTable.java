package com.uptc.simulator.forms.model;

import com.uptc.simulator.model.BinaryRepresentation;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Arrays;

public class RamTable extends JTable {
    public static final String[] TABLE_HEADERS = {"ADDRESS", "CONTENT"};

    private final DefaultTableModel _model = new DefaultTableModel();
    private final ArrayList<ArrayList<BinaryRepresentation>> _ramContent = new ArrayList<>();

    public RamTable() {
        _model.setColumnIdentifiers(TABLE_HEADERS);
        this.initializeRamContent();
        this.setModel(_model);
        this.refreshTable();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0;
    }

    public void refreshTable() {
        this._model.setRowCount(0);
        for (BinaryRepresentation[] row : _ramContent.stream().map(
                c -> c.toArray(BinaryRepresentation[]::new)).toArray(BinaryRepresentation[][]::new)
        ) {
            String[] content = Arrays.stream(row).map(BinaryRepresentation::getValue).toArray(String[]::new);
            this._model.addRow(content);
        }
    }

    public void initializeRamContent() {
        for (int i = 0; i < 16; i++) {
            BinaryRepresentation address = new BinaryRepresentation(4);
            BinaryRepresentation content = new BinaryRepresentation(8);
            ArrayList<BinaryRepresentation> ramElement = new ArrayList<>();

            for (int e = 0; e < i; e++) {
                address.add();
            }
            ramElement.add(address);
            ramElement.add(content);
            _ramContent.add(ramElement);
        }
    }
}
