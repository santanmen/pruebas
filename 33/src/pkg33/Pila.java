/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg33;

public class Pila implements Methods {

    int size = 0;
    Node head = null;

    @Override
    public void push(Object data) {
        Node insert = new Node(data);
        insert.setNext(head);
        head = insert;
        size++;
    }

    @Override
    public void pop() {
        Node help = head;
        head = head.getNext();
        help = null;
        size--;

    }

    @Override
    public void getAll() {
        Node pivote = head;
        while (pivote != null) {
            System.out.println(" -> " + pivote.getData());
            pivote = pivote.getNext();
        }
    }

    @Override
    public void size() {

    }

    @Override
    public void get(int position) {
        int count = 0;
        if (!(position >= count || position < 0)) {
            Node pivote = head;
            while (position > count) {
                pivote = pivote.getNext();

            }
            System.out.println(" -> " + pivote.getData());
        } else {
            System.out.println("La cagaste mano, eso no existe");
        }
    }

    public static void main(String[] args) {
        Pila pila = new Pila();
        System.out.println("Cheetos – A1 || Doritos – A2 || Sabritas – A3\n"
                + "Galletas Emperador – B1 || Barritas – B2 || Galletas María – B3\n"
                + "Cacahuates – C1 || Sopa Maruchan – C2 || Pingüinos – C3 \n"
                + "Fanta en lata – D1 || Coca cola en lata – D2 || Pepsi en lata – D3\n"
                + "Pringles – E1 || M&m’s – E2|| Skittles – E3");

    }

}
/*
pila.push("Cheetos");
        pila.push("");
        pila.push("Alan");
        System.out.println("------------");
        
        System.out.println("------------");
        System.out.println(pila.size);
        System.out.println("--------------Pop------------");
        pila.pop();
        pila.pop();
  
pila.getAll();
*/
