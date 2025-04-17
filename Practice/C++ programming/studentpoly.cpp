#include<iostream>
using namespace std;

class animal
{
	protected:
	
	string name;
	int age;
	
	public:
	
	animal()
	{
		name="pet";
		age=2;
	}
	
	animal(string n,int a)
	{
		name=n;
		age=a;
	}
	
	~animal()
	{
		cout<<"dA"<<endl;
	}
	
	virtual void talk()=0;
	
};

class cat
{
	
	public:
	cat(string n,int a):animal(n,a)
	{
		
	}
	
	~cat()
	{
		cout<<"dC"<<endl;
	}
	
	void talk()
	{
		cout<<"cat can = mauee mauee"<<endl;
	}
	
};

class dog
{
	public:
	dog(string n,int a):animal(n,a)
	{
		
	}
	
	~dog()
	{
		cout<<"dD"<<endl;
	}
	
	void talk()
	{
		cout<<"dog can = bark"<<endl;
	}
};

int main()
{
	animal *animal = new animal();
	//this line give error
	
	animal *dogPtr = new dog("Boss",15);
	
	dogPtr->talk();//Every animal has unique way of sound
	delete dogPtr;
	//My cat name is Puppy & she is 3 month old and it is-a Animal
	cat c1("puppy",3);
	
	cat c2("sweety",4);
	//Use strcmp function to to compare names of 2 Cat
	if(c1 == c2)  
		cout<<"Both are same!"<<endl;
	else
		cout<<"Both are different!"<<endl;
	
	
	c1.talk();
	
	
	return 0;
}