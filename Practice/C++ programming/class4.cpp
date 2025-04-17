#include<iostream>
using namespace std;


class myComplex
{
	int real,imag;

	public:
	
	myComplex()
	{
		cout<<"\n Default Constructer is called..";
		real=0;
		imag=0;
	}
	
	myComplex(int a)
	{
		cout<<"\n single parameter Constructer..";
		real=imag=a;
		
	}

	myComplex(int a,int b)
	{
		cout<<"\n two parameter constructor..";
		real=a;
		imag=b;
	}

	~myComplex()
	{
		cout<<"\n Distructor is called..";
	}

	myComplex add(myComplex c)
	{
		myComplex temp;
		temp.real=real + c.real;
		temp.imag=imag + c.imag;
		return temp;
	}

	void display()
	{
		cout<<"\n Complex num is.."<<endl;
		cout<<real<<" + "<<imag<<"i";
	}
};

int main()
{
	myComplex c1(4,5);
	c1.display();
	myComplex c2(2,3);
	c2.display();
	myComplex c3;
	//myComplex c1(4,5),c2(2,3),c3;

	c3=c1.add(c2);

	c3.display();

	return 0;
}
