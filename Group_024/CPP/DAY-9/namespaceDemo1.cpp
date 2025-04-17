#include<iostream>
using namespace std;

namespace myNamespace{
 class myClass{
   public:
       void fun()
       {
           cout<<"\n fun of myClass from myNamespace";
       }
 };

}


namespace yourNamespace {
 class myClass{
     public:
     void fun1()
     {
         cout<<"\n fun1 of myClass in yourNamespace.";
     }
 };
}

int main()
{

    using namespace myNamespace;
    myClass ob;
    ob.fun();

    using namespace yourNamespace;
    yourNamespace::myClass ob1;
    ob1.fun1();

    return 0;
}
