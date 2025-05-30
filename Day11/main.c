#include <stdio.h>

void sumOfN(int i, int *sum){
    if(i==0){
        return;
    }
    *sum=*sum+i;
    sumOfN(i-1,sum);
}

int main(){
    int sum=0;
    int *ptr=&sum;
    sumOfN(5,ptr);
    printf("%d",sum);
    return 0;
}