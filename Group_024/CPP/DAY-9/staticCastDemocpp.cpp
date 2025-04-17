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


int main()
{
    base bobj;    // i
    derived dobj;  // i and j
    base *ptr = new derived();

    //derived *dptr = new base();// error

    //derived *dptr = ptr;  // error

    derived *dptr = static_cast<derived *>(ptr);
    dptr->fun1();
    dptr->fun();

  // base bobj;
   //cout<<"\n i = "<<bobj.i;
/*
   derived dobj;  // all public member of base and derived are accessible


   dobj.display_j();
*/
   return 0;
}
