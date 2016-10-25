package ru.larin.List;

/**
 * Created by mrden on 25.10.2016.
 */
public class LinkList{
    private Node first;
    private int SZ = 0;
    public LinkList(){
        this.first = null;
    }

    public int getSZ() {
        return SZ;
    }

    public void add(Object data){
        Node node = new Node(data);
        node.setNextElementLink(first);
        first = node;
        SZ++;
    }
    public Node deleteFirst(){
        Node removeNode = first;
        first = first.getNextElementLink();
        SZ--;
        return removeNode;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void print() {
        if (isEmpty()) {
            return;
        } else {
            Node node = first;
            while (node != null) {
                System.out.println(node.getData().toString());
                node = node.getNextElementLink();
            }
        }
    }
    public Object findIndextoDisplay(int index){
        Object returnObj = null;
        if(index < 0 || index > SZ|| isEmpty()){
            return null;
        }
        Node node = first;
        int i = 0;
        while (i!=index){
            node = node.getNextElementLink();
            i++;
        }
        returnObj = node.getData();
        return returnObj;
    }
    public Node removeIndex(int index){
        Node removeObj = (Node) findIndex(index);
        Node prevObj = (Node)findIndex(index-1);
        prevObj.setNextElementLink(removeObj.getNextElementLink());
        SZ--;
        return removeObj;
    }

    private Object findIndex(int index) {
        Object returnObj = null;
        if(index < 0 || index > SZ|| isEmpty()){
            return null;
        }
        Node node = first;
        for (int i = 0; i <= index; i++){
            if(i == index){
                returnObj = node;
                break;
            }
            node = node.getNextElementLink();
        }
        return returnObj;
    }
}
