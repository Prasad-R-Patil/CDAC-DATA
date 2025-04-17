#include<iostream>
using namespace std;

class myArray
{
	int len;
	int *ptr;
	
	
	public:
	
	myArray()
	{
		cout<<"\n Default Constructer.."<<endl;
		len = 5;
		ptr = new int[len];
		for (int i=0;i<len;i++)
			ptr[i]=0;
	}
	
	myArray(int s)
	{
		cout<<"Single parameter constructer.."<<endl;
		len = s;
		ptr = new int[len];
		for (int i=0;i<len;i++)
			ptr[i]=0;
		
	}
	~myArray()
	{
		cout<<" Distructer is called.."<<endl;
		delete []ptr;
	}
	
	void accept_element()
	{
		for(int i=0;i<len;i++)
		{
			cout<<"\n Enter number :";
			cin>>ptr[i];  //thid->ptr[i]
		}
	}
	
	void display()
	{
		cout<<"\n Array values are:"<<endl;
		for(int i=0;i<len;i++)
			cout<<" "<<ptr[i];
	}
	
	const myArray operator = (const myArray &a)
	{
		delete []ptr;
		len = a.len;
		ptr=new int[len];
		for (int i=0;i<len;i++)
			ptr[i]=a.ptr[i];
		return *this;
	}
	
	
	
	myArray(myArray &a)
	{
		len=a.len;
		ptr=new int[len];
		for (int i=0;i<len;i++)
			ptr[i]=a.ptr[i];
	}
};


int main()
{
	myArray obj1,obj2(7),obj3;
	obj1.accept_element();
	cout<<"obj1.accept_element..:"<<endl;
	obj2.accept_element();
	cout<<"obj2.accept_element..:"<<endl;
	obj1.display();
	obj2.display();
	
	myArray abj3(obj1);
	obj3 = obj2;
	obj3.display();
	
	obj3=obj2=obj1;
	obj3.display();
	
	return 0;
	
}