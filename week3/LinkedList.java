/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylinkedlist;

/**
 *
 * @author acahit
 */
public class LinkedList {
    
    public Node head;
    public int  size;
    
    public LinkedList(){
        
        this.head   = null; 
        this.size   = 0; 
    }
    public boolean isEmpty(){
        
        return (this.head == null);
    }
    public void addNode(Node newNode){
      
      Node current = this.head;
      
      if(current == null){
          this.head = newNode;
          this.size++ ;
      }
      else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            this.size++ ;
      }
    }
    public void deleteNode(int key){
        
                     
    }
    public void printList(){
        
        Node currNode = this.head;
    
        System.out.println("LinkedList: ");
    
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(" {id:" + currNode.id + "   " + currNode.name + "}  --->");
    
            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("");
          
    }
    
  
    
}
