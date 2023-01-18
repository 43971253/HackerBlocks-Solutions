#include <iostream>
using namespace std;
int pow(int x,int n){
  if(n==0) //if(n==1)
  return 1; //retuen x;
  
  else
  return x*pow(x,n-1);
}

int main() 
{
  int x , n;
  cin>>x;
  cin>>n;
  cout<<pow(x,n);
  return 0;
}
