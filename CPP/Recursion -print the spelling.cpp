#include <iostream>
#include<string>
#include<bits/stdc++.h>
using namespace std;
string arr[10]={"zero","one","two","three","four","five","six","seven","eight","nine"};

void printSpl(int n){
  if(n==0){
  return;
  }
  int digit=n%10;
   cout<<arr[digit]<<" ";
   printSpl(n/10);
 
 

}

int main() 
{
  int n;
  cin>>n;
  printSpl(n);
  
  return 0;
}
