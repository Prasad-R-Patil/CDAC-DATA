#include<iostream>
using namespace std;

class myComplex
{
	int real,imag;
	
	public:
	
	myComplex()
	{
		cout<<"\n Default Constructer....";
		real=0;
		imag=0;
	}
	
	myComplex(int a)
	{
		cout<<"\n Single parameter Constructer..";
		real=imag=a;
	}
	
	~myComplex()
	{
		cout<<"\n Destructor is called..";
	}
	
	void display()
	{
		cout<<"\n Complex num is .."<<endl;
		cout<<real<<" + "<<imag<<"i";
	}
};

int main()
{
	myComplex c1(4);
	c1.display();
	myComplex c2(2);
	c2.display();
	
}
