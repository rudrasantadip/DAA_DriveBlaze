#include <stdio.h>
#include <stdlib.h>

/*
Node 
integer -> int (data part)
address -> self referencing pointer
*/

typedef struct Node {
    int data;
    struct Node* next;
}Node;

void func()
{

}


int main()
{
    Node* head; //declaration
    head = (Node *) malloc(sizeof(Node));
   
}