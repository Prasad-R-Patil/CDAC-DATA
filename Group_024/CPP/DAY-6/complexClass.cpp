#include<iostream>
using namespace std;
 
class myComplex
{
    int real,imag;
    public:
      myComplex()
      {
        cout<<"\ndefault constructor is called";
        real=0;
        imag=0;
      }
      
      myComplex(int a)
      {
        cout<<"\nsingle parameter constructor is called";
        real=imag=a;
      }
      myComplex(int a, int b)
      {
        cout<<"\nTwo parameter constructor is called";
        real=a;
        imag=b;
        int c=a+b;
        cout<<"\t"<<c;
      }
      myComplex operator+ (myComplex c)
      {
        myComplex temp;
        cout<<"\n Inside function";

        temp.real=real+c.real;
        temp.imag=imag+c.imag;
        cout<<"\t"<<temp.imag;
        return temp;
      }
      
      ~myComplex()
      {
        cout<<"\ndestructor is called";
      }
      void display()
      {
        cout<<"\ncomplex no is"<<real<<" + "<<imag<<"i";
      }
};
int main()
{   
    myComplex c1;
    c1.display();
    myComplex a(9);
    a.display();
    myComplex c(4,5);
    c.display(); 
    myComplex c2(4,5);
    c.display();
    c2=c+c2;
    c2.display();
    return 0;
}