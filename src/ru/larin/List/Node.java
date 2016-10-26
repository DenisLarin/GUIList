package ru.larin.List;

import java.io.Serializable;

/**
 * Created by mrden on 25.10.2016.
 */
public class Node{
    private Node nextElementLink;
    private Object data;

    public Node(Object data){
        this.data = data;
    }

    public Node getNextElementLink() {
        return nextElementLink;
    }

    public void setNextElementLink(Node nextElementLink) {
        this.nextElementLink = nextElementLink;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
