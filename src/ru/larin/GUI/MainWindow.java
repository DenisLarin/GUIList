package ru.larin.GUI;

import ru.larin.main.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mrden on 25.10.2016.
 */
public class MainWindow extends JFrame {
    private JTable table;
    private ListModel listModel;
    private JScrollPane scrollPane;
    private JButton buttonAdd;
    private JButton buttonRemove;

    public MainWindow() {
        /*базовые моменты окна*/
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(640, 480);
        setResizable(false);
        /*устанавливаем абсолютный layout*/
        getContentPane().setLayout(null);

        /*устанавливаем ScrollPane*/
        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 480, 430);
        getContentPane().add(scrollPane);

        /*устанавливаем таблицу*/
        listModel = new ListModel();
        table = new JTable(listModel);
        scrollPane.setViewportView(table);
        /*устанавливаем кнопки*/
        //кнопка добаления
        buttonAdd = new JButton("Add");
        buttonAdd.setBounds(535, 10, 89, 23);
        getContentPane().add(buttonAdd);
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.linkList.add(JOptionPane.showInputDialog("Введите строку"));
                table.updateUI();
            }
        });
        //кнопка удаления
        buttonRemove = new JButton("Remove");
        buttonRemove.setBounds(535, 45, 89, 23);
        getContentPane().add(buttonRemove);
        buttonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(table.getSelectedRow() == -1 || Main.linkList.getSZ() == 0){
                return;
            }
            if(table.getSelectedRow() == 0){
                Main.linkList.deleteFirst();
            }
            else{
                Main.linkList.removeIndex(table.getSelectedRow());
            }
            table.updateUI();
            }
        });
        setVisible(true);
    }
}
