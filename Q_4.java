class Q_4{
    Node head;
    private int size;

    Q_4(){
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
        Node newnode = new Node(a);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
   
    public void addlast(int a){
        Node newnode=new Node(a);
         if(head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next != null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
   
    public void deletefirst(){
        if(head==null){
            System.out.println("Empty linked list");
            return;
        }
        head=head.next;
    }
   
    public void deletelast(){
        if(head==null){
            System.out.println("Empty linked list");
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next != null){
            secondlast=secondlast.next;
            lastnode=lastnode.next;
        }
        secondlast.next=null;
    }
   
    public void printlist(){
         if(head==null){
            System.out.println("Empty linked list");
            return;
        }
        Node currnode=head;
        while(currnode != null){
            System.out.print(currnode.a +"\t");
            currnode=currnode.next;
        }
    }
    public static void main(String[] args){
       
        Q_4 phv=new Q_4();
        for(int i=1;i<=50;i++){
            phv.addlast(i);
        }
        System.out.println("The linklist is: ");
        phv.printlist();
        for(int i=1;i<=25;i++){
            phv.deletelast();
        }
        System.out.print("\n\nAfter deleting nodes which are greater than 25 ,new linklist is : ");
        System.out.println();
        phv.printlist();
       
    }
}
