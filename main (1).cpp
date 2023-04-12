#include<iostream>
/*

 .............................. from Creation of linked list to its insertion and deletion ..................................
*/
using namespace std;

class node
{
   public:
   string line;
   node * next;

   node(string line)
   {
      this->line=line;
      this->next=NULL;
   }
};
void Insert_Athead(node *& head,string line)
{
     node * temp = new node(line);
     temp->next=head;
     head=temp;
}

void Insert_Attail(node *& tail,string line)
{
     node * temp = new node(line);
     tail->next=temp;
     tail=temp;
}
void Insert_Atposition(node * & tail,node *& head,int position,string line)
{
    int count=1;
    node * temp=head;

    if(position==1)
    {
      Insert_Athead(head,line);
      return ;
    }
    while(count < position-1)
    {
      
      temp=temp->next;
      count ++;
    }
    
    if(temp->next==NULL)
    {
      Insert_Attail(tail,line);
      return ;
    }
    node * temp1= new node(line);

    temp1->next=temp->next;
    temp->next=temp1;
}
void print(node *& head)
{
   node * temp =head;

   while(temp!=NULL)
   {
      cout << temp->line << " ";
      temp = temp->next;
   }

   cout <<"NULL"<< endl;
 
}
void Deletion_of_node(node *& tail,node *& head,int position)
{
   int count=1;
   int count1=1;
   node * temp=head;
   node * temp1=head;
   
   if(position==1)
   {
      head=temp->next;
      return ;
   }

   while(count < position-1)
   {
      temp=temp->next;
      count++;
   }

   while(count1 <= position-1)
   {
      temp1=temp1->next;
      count1++;
   }
   

   if(temp1->next==NULL)
   {
   tail->line=temp->line;
   }

   temp->next=temp1->next;

}
void Deletion_Athead(node * &tail,node *&head)
{
   node * temp=head;
   head=temp->next;
   return ;
}

void Deletion_Attail(node *& tail,node *& head)
{
   if (head == tail) {
       delete tail;
       head = NULL;
       tail = NULL;
       return;
   }
   
   node *temp = head;
   while (temp->next != tail) {
       temp = temp->next;
   }
   
   temp->next = NULL;
   delete tail;
   tail = temp;

}
int main()
{
   
   node * node1 = new node("dhirubhai");


   node * head=node1;
   node * tail=node1;

   print(head);
   
   Insert_Attail(tail,"ambani");
   print(head);
   
   Insert_Athead(head,"DAIICT");
   print(head);
   Insert_Attail(tail,"information");
   print(head);

  Insert_Atposition(tail,head,3,"institute");
  print(head);
  
  Insert_Athead(head,"mnc");
   print(head);
  Insert_Atposition(tail,head,5,"communication");
  print(head);

  Insert_Atposition(tail,head,6,"technology");
  print(head);
  cout << "Head is:"<<head->line<<endl;
  cout << "Tail is:"<<tail->line<<endl<<endl;

  Deletion_of_node(tail,head,6);
  print(head);
  cout << "Head is:"<<head->line<<endl;
  cout << "Tail is:"<<tail->line<<endl;
 
 Deletion_Athead(tail,head);
 print(head);
 cout << "Head is:"<<head->line<<endl;
 cout << "Tail is:"<<tail->line<<endl;
 
 Deletion_Attail(tail,head);
  print(head);
 cout << "Head is:"<<head->line<<endl;
 cout << "Tail is:"<<tail->line<<endl;
  
   return 0;
}
