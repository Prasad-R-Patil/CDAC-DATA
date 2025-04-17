#include<iostream>
using namespace std;

class myComplex
{
	int real,imag;
	
	public:
	
	myComplex()
	{
		cout<<"\n Default constructer is called";
		real=0;
		imag=0;
	}
	myComplex(int a)
	{
		cout<<"\n Single parameter Constructer";
		real=imag=a;
	}
	myComplex(int a,int b)
	{
		cout<<"\n Two parameter constructer is called..";
		real=a;
		imag=b;
	}
	
	~myComplex()
	{
		cout<<"\n Destructor is called..";
	}
	
	
	void display()
	{
		cout<<"\n Complex num is ";
		cout<<real<<" + "<<imag<<"i"<<endl;
	}
};



int main()
{
	myComplex c1;
	c1.display();
	return 0;
}