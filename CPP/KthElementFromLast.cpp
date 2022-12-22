#include<iostream>
using namespace std;

class node{
	public:
	int data;
	node*next;
	//constructor
	node(int d){
		data=d;
		next=NULL;
	}
};

void insertAtTail(node*&head,int data)
{
    if(head==NULL)
    {
        head=new node(data);
        return;
    }
	node*tail=head;
	while(tail->next!=NULL)
	{
		tail=tail->next;
	}
	tail->next=new node(data);
    return;
}

void createList(node*&head)
{	
	int data;
	cin>>data;
	while(data!=-1)
	{
		insertAtTail(head,data);
		cin>>data;
	} 
}
node* kth_element(node*&head,int k)
{
    node * slow = head;
    node * fast = head;
    while(k--)
    {
        fast = fast->next;
    }
    while(fast!=NULL)
    {
        fast = fast->next;
        slow = slow->next;
    }
    return slow;
}

int main() {
	node*head=NULL;
	createList(head);
	int k;
    cin>>k;
    node* element=kth_element(head,k);
    cout<<element->data;
    
    return 0;
}
