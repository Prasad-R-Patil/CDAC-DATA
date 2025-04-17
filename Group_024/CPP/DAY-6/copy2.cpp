#include<iostream>
using namespace std;

class myComplex
{
    int real,imag;
    public:
    myComplex()
    {
        cout<<"\n default constructor is called";
        real=0;
        imag=0;
    }
    myComplex(int a)
    {
        cout<<"\n single Para constructor is called";
        real=imag=a;

    }
    myComplex(int a,int b)
    {
        cout<<"\n Para constructor is called";
        real= a;
        imag=b;

    }
    ~myComplex()
    {

        cout<<"\n destructor is called";
    }
    myComplex add(myComplex c)
    {
        myComplex temp;
        temp.real=real+c.real;
        temp.imag=imag+c.imag;
        return temp;

    }
    void display()
    {
        cout<<"\n"<<real<<" + "<<imag<<"i";
    }
    myComplex operator+(myComplex c)
    {
         myComplex temp;
        temp.real=real+c.real;
        temp.imag=imag+c.imag;
        return temp;

    }
};
int main()
{
    myComplex c1(4,5),c2(3,4),c3;
   // c3=c1.add(c2);
    c3=c1+c2;
    c3.display();
    return 0;
}
