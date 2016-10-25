package ru.larin.main;

import ru.larin.GUI.MainWindow;
import ru.larin.List.LinkList;

/**
 * Created by mrden on 25.10.2016.
 */
public class Main {
    private static MainWindow mainWindow;
    public static LinkList linkList;

    public static void main(String[] args) {
        linkList = new LinkList();
        mainWindow = new MainWindow();
        /*linkList.add("1");
        linkList.add("2");
        linkList.add("3");
        linkList.add("4");
        linkList.print();
        linkList.removeIndex(3);
        linkList.print();*/
    }
}
