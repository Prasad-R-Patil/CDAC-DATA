#include<iostream>
using namespace std;

class base
{
	
	protected:
		int var;
	
	public:
		base()
		{
			cout<<"\n Default constructor ";
		     var=10;
		}
		
		base(int a)
		{
			cout<<"\n one parameter construct";
			int var=a;
		}
		
		~base()
		{
			cout<<"\n distructor is called";
			
		}
		
		
		void fun()
		{
			cout<<"\n fun() of base is called";
		}
		
		void display()
		{
			cout<<"\n variable is ="<<var;
		}
};

class Derived:public base
{	
	protected:
	
	int dvar;
	
	public:
	
	
	Derived()
	{
		dvar=20;
		cout<<"\n Default constructor of derived class";
	}
	
	Derived(int a)
	{
		dvar=a;
		cout<<"\n one parameter constructor of derived class";
	}
	
	~Derived()
	{
		cout<<"\n distructer of derived";
		
	}
	
	void display1()
	{
		
		cout<<"\n var = "<<var;
		cout<<"\n dvar = "<<dvar;
		
	}
};

class Derived2:public Derived
{
	
	int dvar2;
	
	public:
	
	
	Derived2()
	{
		dvar2=30;
		cout<<"\n Default constructor of derived2 class";
	}
	
	Derived2(int a)
	{
		dvar2=a;
		cout<<"\n one parameter constructor of derived 2 class";
	}
	
	~Derived2()
	{
		cout<<"\n distructer of derived2";
		
	}
	
	void display2()
	{
	
		cout<<"\n var = "<<var;
		cout<<"\n dvar = "<<dvar;
		cout<<"\n dvar2 = "<<dvar2;
		
	}
};

int main()
{
	base b1;
	Derived d1;
	Derived2 d2;
	b1.fun();
	d1.display();
	d1.display1();
	d2.display2();
}
