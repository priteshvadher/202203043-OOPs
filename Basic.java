public class Basic {
Node head;
private int size;

Basic(){
this.size = 0;
}

class Node{
String data;
Node next;

Node(String data){
this.data = data;
this.next = null;
size++;
}
}
public void addfirst(String data){
   Node newnode =new Node(data);
   if(head==null){
       head=newnode;
       return;
   }
   newnode.next=head;
   head=newnode;
}
public void addlast(String data)
{
   Node newnode=new Node(data);
   if(head==null){
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
public void print(){
   if(head==null)
   {
       System.out.println("empty string");
       return;
   }
   Node currnode=head;
   while(currnode != null)
   {
       System.out.print(currnode.data+" > ");
       currnode=currnode.next;
   }
   System.out.println("null");
   
}
public void deletefirst(){
    if(head==null)
   {
       System.out.println("empty string");
       return;
   }
   head=head.next;
}
public void deletelast(){
    if(head==null)
   {
       System.out.println("empty string");
       return;
   }
   Node secondlast=head;
   Node lastnode=head.next;
   while(lastnode.next != null)
   {
       
       secondlast=secondlast.next;
       lastnode=lastnode.next;
   }
   secondlast.next=null;
}
public static void main(String[] args){
   
   Basic phv =new Basic();
   
   phv.addfirst("dhirubhai");
   phv.print();
   phv.addfirst("DAIICT");
   phv.print();
   phv.addlast("ambani");
   phv.print();
   phv.addlast("institute");
   phv.print();
   phv.deletefirst();
   phv.print();
   phv.deletelast();
   phv.print();
   phv.deletelast();
   phv.print();
}
}
