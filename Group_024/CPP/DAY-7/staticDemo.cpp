#include<iostream>
using namespace std;

class myClass
{
   int var1, var2;
   static int st_var;

   public:
       myClass()
       {
           var1 = 10;
           var2 = 10;
           st_var = st_var + 1;
       }
       myClass(int a, int b)
       {
           var1 = a;
           var2 = b;
           st_var = st_var + 1;
       }
    void display()
    {
        cout<<"\n var1 = "<<var1<<" var2 = "<<var2;
    }
    static int no_of_objects()
    {
        //var1 = var1 + 4;  error
        return st_var;
    }
};

int myClass::st_var = 0;

int main()
{
    myClass obj1;
    myClass obj2(4,5);
    obj1.display();
    obj2.display();
    cout<<"Total objects created of myClass ="<<myClass::no_of_objects();
}
