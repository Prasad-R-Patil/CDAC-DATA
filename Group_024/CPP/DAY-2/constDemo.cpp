#include<iostream>
using namespace std;

int main()
{
    const int i = 10;
    int n = 5;
    constexpr int num = i * i;
    cout<<"\n i = "<<i << "num = "<<num;
    // num = 20;  note down the findings
    return 0;
}
/*Assignment : Write a program to demonstrate const
and constexpr for calculating area of circle.
Try to change the value of num after stat 8

use #include<climits>
            <cfloat>
sizeof, UINT_MAX, INT_MAX, INT_MIN,
 FLT_DIG
  DBL_DIG
  LDBL_DIG
 */
