#include<iostream>
using namespace std;
class base {
    protected:
  int i;

 public:
  base()
  {
     cout<<"\nbase default constructor is called. ";
     i = 10;
  }
  base (int a)
  {
   cout<<"\n base paramterized constructor is called. ";
   i = a;
  }

  ~base() {cout<<"\n base destructor is called"; }

  void display_i()
  {
    cout<<"\n i = "<<i;
  }
  void fun()
  {
      cout<<"\n fun of base..";
  }
};


class derived : public base {
  int j;

  public:
  derived() {
   cout<<"\nderived default constructor is called. ";
   j = 12;
  }
  derived(int r) {
   cout<<"\nderived parameter constructor is called. ";
   j = r;
  }
  ~derived()
  {
    cout<<"\nderived destructor is called. ";
  }
  void display_j()
  {
     cout<<"\n i = "<<i;
     cout<<"\n j = "<<j;
  }
  void fun1()
  {
      cout<<"\n fun1 of derived";
  }
};

class superB{

};

class SubD:public superB{

};


int main()
{
   base *b = new base();
   derived *d = new derived();

   base *myb;

   cout<<"\n type id of b = "<<typeid(b).name();
   cout<<"\n type id of d = "<<typeid(d).name();
   cout<<"\n type id of myb = "<<typeid(myb).name();

   if(typeid(*myb)==typeid(*d))
      cout<<"\n Inside if..";

    b = dynamic_cast<derived*>(d);
    cout<<"\n d = "<<d;

    cout<<"\n b = "<<b;

    superB *ptr = new SubD();

    b = dynamic_cast<derived*>(ptr);
    cout<<"\n b = "<<b;
   return 0;
}
