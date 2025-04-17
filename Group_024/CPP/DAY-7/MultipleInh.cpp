#include<iostream>
using namespace std;
class Base1
{
protected:
    int var1;
public:
    Base1()
    {
        cout<<"\n Base1 default constructor is called.";
        var1 = 10;
    }
    Base1(int a)
    {
        cout<<"\n Base1 param constructor is called.";
        var1 = a;
    }
    ~Base1()
    {
        cout<<"\n Destructor of base1 is called.";
    }
    void display()
    {
        cout<<"\n var1 = "<<var1;
    }
    void fun()
    {
        cout<<"\n fun() of base is called..";
    }
};


class Base2
{
protected:
    int var2;
public:
    Base2()
    {
        cout<<"\n Base2 default constructor is called.";
        var2 = 20;
    }
    Base2(int a)
    {
        cout<<"\n Base2 param constructor is called.";
        var2 = a;
    }
    ~Base2()
    {
        cout<<"\n Destructor of base2 is called.";
    }
    void display2()
    {
        cout<<"\n var2 = "<<var2;
    }

};

class Derived : public Base2, public Base1
{
    int var3;
public:
    Derived()
    {
        var3 = 30;
        cout<<"\n Default constructor of Derived..";
    }
    Derived(int a)
    {
        var3 = a;
        cout<<"\n 1 para constructor of Derived..";
    }
    Derived(int a, int b)
    {
        var1 = var2 = a;
        var3 = b;
    }
    ~Derived()
    {
        cout<<"\n Destructor of Derived..";
    }
};

int main()
{
    Derived d1;
    d1.display();
    d1.display2();
    return 0;
}
