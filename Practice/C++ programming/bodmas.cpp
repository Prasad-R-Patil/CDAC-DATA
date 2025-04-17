/*
#include<iostream>
using namespace std;
int main()
{
        int a,b,c,d,e,f,g,h,k;
	a=8, b=4, c=2, d=1, e=5, f=20;
	cout<<"\t"<< a+b-(c+d)*3%e+f/9;
	a=17, b=5, c=6, d=3, e=5;
	cout<<"\t"<<a%6-b/2+(c*d-5)/e;
	a=4, b=5, c=6, d=3, e=5, f=10;
	cout<<"\t"<<a*b-c/d;
	a=8, b=5, c=8, d=3, e=65, f=10, g=2, h=5, k=2;
	cout<<"\t"<<(a-b+c/d);
	int r1 = a-b+c/d ;
	int r2 = (e/f-g+h%k);
        cout<<"\t"<<(r1 == r2);  //remove (   ) and check
	a=8, b=3, c=2, d=3, e=2, f=11;
	cout<<"\n"<<a-b||(a-b*c)+d&&e-f%3;
	return 0;
}



#include<iostream>
using namespace std;
int main(void)
{
	int a=9,b=15,c=16,d=12,e,f;
	e = !(a<b || b<c);
	f = (a>b) ? a-b: b-a;
	cout<<" e = "<<e <<" f = "<< f;
	return 0;
}

*/
#include<iostream>
using namespace std;
int main(void)
{
    int x,y,z,k=10;
    k+=(x=5, y=x+2, z=x+y);
	cout<<"\n x = "<<x <<" y = "<< y <<" z = "<<z<< " k = "<<k;
    return 0;
}




