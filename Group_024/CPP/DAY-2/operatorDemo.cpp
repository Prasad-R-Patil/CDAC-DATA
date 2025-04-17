#include<iostream>
using namespace std;

int main()
{
    unsigned short a = 5, b = 9, result;

    result = a & b;
    cout<<"\n a  &  b = "<<result;

    result = a | b;
    cout<<"\n a  |  b = "<<result;

    result = a ^ b;
    cout<<"\n a  ^  b = "<<result;

    a = a << 1;
    cout<<"\n a  << 1 = "<<a;

    return 0;
}
