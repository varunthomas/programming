#include<stdio.h>
    int fact(int n){
        int factorial=1;
        int m=1;    
        while(m<=n){
            factorial = factorial*m;
            m++;
        }
        return factorial;

    }

    void main(){

        
        int n,m;
        scanf("%d %d",&n,&m)
        int f,ans;
        f=fact(n);
        ans=f%m;
        printf("%d",ans);
    }
