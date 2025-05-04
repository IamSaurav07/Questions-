import java.util.*;

class LList {
    
    // node head;
    // private int size;

    // void LL(){
    //     this.size = 0;
    // }

    // class node{
    //     String data;
    //     node next;
        
    //     node(String data){
    //         this.data = data;
    //         this.next = null;
    //         size++;
    //     }
    // }

    // public int getSize(){
    //     return size;
    // }
    
    // //add-first
    // public void addFirst(String data){
    //     node newNode = new node(data);
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }

    //     newNode.next = head;
    //     head = newNode;
    // }

    // //add at last
    // public void addlast(String data){
    //     node newNode = new node(data);
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }

    //     node currNode = head;
    //     while (currNode.next != null) {
    //         currNode = currNode.next;
    //     }

    //     currNode.next = newNode;
    // }


    // //add at last
    // public void printNode(){
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     node currNode = head;
    //     while (currNode != null) {
    //         System.out.print(currNode.data+" -> ");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("Null");
    // }

    // //delete from first
    // public void deleteFirst(){
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     size--;
    //     head = head.next;
    // }

    // //delete from end
    // public void deleteLast(){
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     size--;
    //     if (head.next == null) {        //when linked list have only one node
    //         head = null;
    //         return;
    //     }

    //     node secLast = head;
    //     node lastNode = head.next;
    //     while (lastNode.next != null ) {
    //         lastNode = lastNode.next;
    //         secLast = secLast.next;
    //     }
    //     secLast.next = null;
    // }


    // public static void main(String[] args) {
    //     LList list = new LList();
    //     list.addFirst("a");
    //     list.addFirst("is");
    //     list.printNode();

    //     list.addlast("list");
    //     list.printNode();

    //     list.addFirst("This");
    //     list.printNode();                   //This -> is -> a -> list -> Null
    
    //     System.out.println(list.getSize());
    // }

    

    /*Using collection framework we don't need to write the whole code */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.add("list");           //bydefault element are added in the last
        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)); //to get element at i
        }
        System.out.println("Null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();              //bydefault last
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
