#include<iostream>
using namespace std;

int main()
{
	int **ptr;
	int *p;
	int i=10;
	
	p=&i;
	ptr=&p;
	
	cout<<"\n ptr = "<<ptr; //10
	cout<<"\n p = "<<p;     //10 
	cout<<"\n &ptr = "<<&ptr; //1001
	cout<<"\n &i = "<<&i;     //2002
	cout<<"\n &p = "<<&p;      //3003
	cout<<"\n *ptr = "<<*ptr;    //10
	cout<<"\n *p = "<<*p;       //10
	cout<<"\n **ptr = "<<**ptr;  //10
	
	return 0;
}