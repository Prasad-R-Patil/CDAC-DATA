#include<iostream>
using namespace std;
class ABC {


};

class BXYZ{


};
int main()
{
    int i;
    float *f;
    char *p;
    ABC obja1,obja2;
    BXYZ objb1, objb2;

    cout<<"\n type Id of i = "<<typeid(i).name();
    cout<<"\n type Id of f = "<<typeid(f).name();
    cout<<"\n type Id of p = "<<typeid(p).name();

    cout<<"\n type Id of obja = "<<typeid(obja2).name();
    cout<<"\n type Id of objb = "<<typeid(objb2).name();



    return 0;

}
