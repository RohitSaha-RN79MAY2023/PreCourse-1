// Java program to implement
// a Singly Linked List
//space complexity O(Number of nodes)
public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    //Time complexity = O(Number of nodes)
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node node = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        if( list.head == null) {
            list.head = node;
            return list;
        }
        // Else traverse till the last node
        // and insert the new_node there
        // Insert the new_node at last node
        // Return the list by head
        Node curr = list.head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;

        return list;
    }

    // Method to print the LinkedList.
    // Time Complexity: O(Number of nodes)
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node curr = list.head;

        while(curr.next != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        // Print the data at current node
        // Go to next node
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}