import java.util.*;
class Q_3{
Node head;
private int size;

    Q_3(){
this.size = 0;
}

class Node{
int a;
Node next;

Node(int a){
this.a = a;
this.next = null;
size++;
}
}

public void addfirst(int a){
   Node newnode=new Node(a);
   if(head==null)
   {
       head=newnode;
       return;
   }
   newnode=head.next;
   head=newnode;
}

public void addlast(int a){
   Node newnode=new Node(a);
   if(head==null)
   {
       head=newnode;
       return;
   }
   Node currnode=head;
   while(currnode.next != null)
   {
       currnode=currnode.next;
   }
   currnode.next=newnode;
}

public void printlist(){
   if(head==null){
       System.out.println("EMPTY LINKLIST");
       return;
   }
   Node currnode=head;
   while(currnode != null){
       System.out.print(currnode.a + "  ");
       currnode=currnode.next;
   }
   System.out.println("NULL");
}

public int search(int value){
   if(head==null){
       return -2;
   }
   int i=0;
   Node currnode=head;
   while(currnode.next != null){
       if(currnode.a==value){
           return i;
       }
       currnode=currnode.next;
       i++;
   }
   return -1;
}

public static void main(String[] args){
   Q_3 phv=new Q_3();
   Scanner sc=new Scanner(System.in);
   // linked list :(1, 5, 7, 3 , 8, 2, 3)
   System.out.print("we have this linked list: ");
   phv.addfirst(1);
   phv.addlast(5);
   phv.addlast(7);
   phv.addlast(3);
   phv.addlast(8);
   phv.addlast(2);
   phv.addlast(3);
   phv.printlist();
   System.out.println("Enter the keyvalue which you wanted to find:");
   int value = sc.nextInt();
   int temp=phv.search(value);
   if(temp==-1){
       System.out.println(value +" is not in linkedlist");
   }
   else if(temp==-2){
       System.out.println("Empty linked list");
   }
   else{
       System.out.println(value +" is at index "+temp);
   }
}
}
