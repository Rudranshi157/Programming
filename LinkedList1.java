public class LinkedList1{
    //707. Design Linked List [NOT OPTIMISED]
    class Node{
        int val;
        Node next;
        
    }
    Node head;
    int size ;
    public void MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index+1 > size) return -1;
        int i = 0;
        Node temp = head;
        while(i!=index){
            temp = temp.next;
            i++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node();
        temp.val = val;
        temp.next = head;
        head = temp;
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp = head;
        size++;
        Node newNode = new Node();
        newNode.val = val;
        newNode.next = null;
        if(temp == null){
            head = newNode;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(size == index){
            addAtTail(val);
        }else if(size < index){
            return;
        }else{
            Node newNode = new Node();
            newNode.val = val;
            newNode.next = null;
            if(index == 0){
                newNode.next = head;
                head = newNode;
                size++;
                return;
            }
            Node temp = head;
            int i=0;
            while(index-1 > i){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < size && index >= 0){
            if(index == 0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            int i=0;
            while(i < index-1){
                temp = temp.next;
                i++;
            }
            if(temp.next != null) {
                temp.next = temp.next.next;
            }
            size--;
        }
    }
    public static void main(String[] args) {
        
    }
}