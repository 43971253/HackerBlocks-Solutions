// 0 
// 1    1 
// 2    3     5 
// 8   13    21    34

#include<iostream>
using namespace std;
int main() {
	int n;
	cin>>n;
	int n1=0,n2=1,temp;
	for(int i=0;i<n;i++){
		for(int j=0;j<=i;j++){
			cout<<n1<<"\t";
			temp=n1;
			n1=n2;
			n2=n1+temp; 
		}
		cout<<"\n";
	}
	return 0;
}
