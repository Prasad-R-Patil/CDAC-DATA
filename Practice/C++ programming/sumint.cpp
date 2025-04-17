#include<iostream>
using namespace std;

class myadd
{
	int a,b;
	
	
	public:
	myadd()
	{
		a=0;
		b=0;
	}
	
	myadd(int c)
	{
		a=b=c;
		
	}
	myadd(int d,int e)
	{
		a=d;
		b=e;
	}
	
	myadd operator +(const myadd &m)
	{
		myadd temp;
		temp.a = a + m.a;
		temp.b = b + m.b;
		return temp;
	}
	
	~myadd()
	{
		cout<<"distruct is called"<<endl;
	}
	void display()
	{
		cout<<"addition is "<<a<<" and "<<b<<" ";
	}
	
	
	
};

int main()
{
	myadd m1(2,2),m2(3,3),m3;
	
	m3=m1+m2;
	
	m3.display();
}