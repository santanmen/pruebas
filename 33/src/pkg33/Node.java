/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg33;

/**
 *
 * @author ZULEMA
 */
public class Node {
    private Object data;
    private Node next;
    
    public Node (){}

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(Node next) {
        this.next = next;
    }

    public Node(Object data) {
        this.data = data;
    }
    
    
    
}
