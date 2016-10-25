package ru.larin.GUI;

import ru.larin.main.Main;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 * Created by mrden on 25.10.2016.
 */
public class ListModel implements TableModel{

    @Override
    public int getRowCount() {
        return Main.linkList.getSZ();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return "Object";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return Main.linkList.findIndextoDisplay(rowIndex);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
