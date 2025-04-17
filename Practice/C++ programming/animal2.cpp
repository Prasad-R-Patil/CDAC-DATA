#include<iostream>
#include<string.h>
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

	virtual ~animal()
	{

	}

	virtual void talk()=0;

};

class cat:public animal
{

	public:
	cat(string n,int a):animal(n,a)
	{

	}

	virtual ~cat()
	{

	}

	bool  operator ==(cat m)
	{
		if (strcmp(name.c_str(), m.name.c_str())==0)
		{
			return true;
		}
		else
		{
			return false;
		}




	}

	void talk()
	{
		cout<<"cat can = mauee mauee"<<endl;
	}

};

class dog:public animal
{
	public:
	dog(string n,int a):animal(n,a)
	{

	}

	virtual~dog()
	{

	}

	void talk()
	{
		cout<<"dog can = bark"<<endl;
	}
};

int main()
{
	//animal *animal = new animal;
	//this line give error

	animal *dogPtr = new dog("Boss",15);

	dogPtr->talk();//Every animal has unique way of sound
	delete dogPtr;
	//My cat name is Puppy & she is 3 month old and it is-a Animal
	cat c1("puppy",3);

	cat c2("puppy",4);
	//Use strcmp function to to compare names of 2 Cat
	if(c1 == c2)
		cout<<"Both are same!"<<endl;
	else
		cout<<"Both are different!"<<endl;


    cat c3("cacac",3);

	cat c4("puppy",4);
		if(c3 == c4)
		cout<<"Both are same!"<<endl;
	else
		cout<<"Both are different!"<<endl;


	c1.talk();


	return 0;
}
