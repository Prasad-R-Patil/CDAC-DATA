#include<iostream>
using namespace std;

class animal
{
	public:
	virtual void make_sound()=0;
	
		
};

class cat:public animal
{
	public:
	void make_sound()
	{
		cout<<"maiuu maiuu"<<endl;
	}
	
};

class dog:public animal
{
	public:
	void make_sound()
	{
		cout<<"bhauu bhauuu"<<endl;
	}
};

int main()
{
	animal *ptr= new cat;
	ptr->make_sound();
	animal *ptr1= new dog;
	ptr1->make_sound();
	
 return 0;	
}