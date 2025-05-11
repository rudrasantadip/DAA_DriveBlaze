#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int data;
    struct Node *next;
}Node;

typedef struct LinkedList{
    Node *head;
}LinkedList;

Node* createNode(int data)
{
    size_t size = sizeof(Node);
    Node* newNode = (Node *)malloc(size);
    newNode->data=data;
    newNode->next=NULL;
    return newNode;
}

LinkedList* createList (int data){
    LinkedList *ll = (LinkedList*)malloc(sizeof(LinkedList));
    ll->head=createNode(data);
    return ll;
}

//insert at the end of a linkedlist

void insert(LinkedList *ll,int data){
    Node *temp = ll->head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=createNode(data);
}

void printList(LinkedList *ll){
    Node *temp=ll->head;
    while (temp!=NULL)
    {
        printf("%d -> ",temp->data);
        temp=temp->next;
    }
}


int main()
{
    LinkedList *ll = createList(1);
    
    insert(ll,10);
    insert(ll,20);
    insert(ll,30);
    printList(ll);
    return 0;
}