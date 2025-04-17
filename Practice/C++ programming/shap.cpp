#include<iostream>
using namespace std;

class shape
{ 	
	protected:
	int width,hight,redius;
	float PI=3.14f;

	public:
	shape()
	{
		width=0;
		hight=0;
		redius=0;
		
	}
	shape(int r)
	{
		redius=r;
	}
	
	shape(int w,int h)
	{
		width=w;
		hight=h;
	}
	
	~shape()
	{
		
	}
	virtual float getArea()=0;
	
	
};

class triangleShape:public shape
{	

	public:

	
	triangleShape(int a,int b):shape(a,b)
	{
		
	}
	
	~triangleShape()
	{
		
	}
	float getArea()
	{
		return (width*hight)/2;
		
	}
};

class circle:public shape
{
	int x;
	int y;
	public:
	
	circle()
	{
		x=1;
		y=1;
	}
	circle(int a,int b,int r):shape(r)
	{
		x=a;
		y=b;
	}
	
	~circle()
	{
		
	}
	
	bool  operator ==(circle m)
	{
		if (redius==m.redius)
		{
			return true;
		}
		else
		{
			return false;
		}




	}
	
	float getArea()
	{
		return (PI*redius*redius);
	}
	
	
};



int main()

{
	//This line should give compile time error like "Cant create object of abstract class" as we can't draw Shape. 
	//shape *shape = new shape();
		
	//My Triangle's width is 10 & height is 3 
	shape *triangle = new triangleShape(10, 3);
	
	//Triangle's area formula is (width * height)/2 
	cout<<"Area of triangle is = "<<triangle->getArea()<<endl;
	
	delete triangle;

	//My Circle's centre is at 2,2 (x,y) and radius of 3 and it is-a Shape
	circle c1(2,2,3);
	circle c2(3,3,8);
	
	//Please check both circles areas to verify whether they are equal or not
	//Circle's area formula is (3.14 * radius * radius)
	if(c1 == c2)
		cout<<"Both circle are of same area"<<endl;
	else
		cout<<"Both circle are of different area"<<endl;	
}