#include<iostream>
using namespace std;

class Base
{
protected:
    int var;
public:
    Base()
    {
        cout<<"\n Base default constructor is called.";
        var = 10;
    }
    Base(int a)
    {
        cout<<"\n Base param constructor is called.";
        var = a;
    }
    ~Base()
    {
        cout<<"\n Destructor of base is called.";
    }
    void display()
    {
        cout<<"\n var = "<<var;
    }
    void fun()
    {
        cout<<"\n fun() of base is called..";
    }
};

class Derived : public Base
{
    int dvar;
    public:
    Derived()
    {
        dvar = 20;
        cout<<"\n Default constructor of Derived..";
    }
    Derived(int a)
    {
        dvar = a;
        cout<<"\n Param constructor of Derived..";
    }
    Derived(int a, int b):Base(a)
    {
        dvar = b;
        cout<<"\n 2 Param constructor of Derived..";
    }
    ~Derived()
    {
        cout<<"\n Destructor of Derived..";
    }
    void display_dvar()
    {
        cout<<"\n var = "<<var;
        cout<<"\n dvar = "<<dvar;
    }
};

int main()
{
   // Base b1(3);
    Derived d1(7,5);
    d1.fun();
   // b1.display();
    d1.display_dvar();
    return 0;
}
