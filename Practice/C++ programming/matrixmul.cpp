#include<iostream>
using namespace std;

class myMatrix
{
	int row ,col;
	int **ptr;  //array of pointer address,array of integer
	
	
public:
		myMatrix()
		{
			row=3;
			col=3;
			ptr=new int *[row]; //allocate memory of integers pointer
			
			for (int i=0;i<row;i++)
			{
				ptr[i]=new int [col];
			}
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					ptr[i][j]=0;
				}
			}
		}
		


		myMatrix (int r,int c)
		{
			row=r;
			col=c;
			ptr=new int *[row]; //allocate memory of integers pointer
			
			for (int i=0;i<row;i++)
			{
				ptr[i]=new int [col];
			}
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					ptr[i][j]=0;
				}
			}
			
		}
		
		~myMatrix()
		{
			for (int i=0;i<row;i++)
			{
				delete []ptr[i];
			}
			delete []ptr;
		}
		
		
		myMatrix(myMatrix &m)
		{
			row=m.row;
			col=m.col;
			
			ptr=new int *[row];
			for(int i=0;i<row;i++)
			{
				ptr[i]=new int[col];
			}
			
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					ptr[i][j]=m.ptr[i][j];
				}
			}
		}
		
		const myMatrix &operator =(const myMatrix &m)
		{
			for(int i=0;i<row;i++)
			{
				delete []ptr[i];
			}
			delete []ptr;
			
			row=m.row;
			col=m.col;
			ptr=new int *[row];
			for (int i=0;i<row;i++)
			{
				ptr[i]=new int[col];
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					ptr[i][j]=m.ptr[i][j];
				}
				
			}
			return *this;
		}
		
		
		myMatrix  operator +(const myMatrix &m)
		{
			myMatrix temp;
			for(int i=0;i<row;i++)
			{
			
				for(int j=0;j<col;j++)
				{
					temp.ptr[i][j]=ptr[i][j]+m.ptr[i][j];
				}
			}
			return temp;
			
		}
		
		myMatrix  operator -(const myMatrix &m)
		{
			myMatrix temp;
			for(int i=0;i<row;i++)
			{
			
				for(int j=0;j<col;j++)
				{
					temp.ptr[i][j]=ptr[i][j]-m.ptr[i][j];
				}
			}
			return temp;
			
		}
		
		myMatrix operator *(const myMatrix &m)
		{
			myMatrix temp;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					temp.ptr[i][j]=0;
					for(int k=0;k<col;k++)
					{
						temp.ptr[i][j] = temp.ptr[i][j] + ptr[i][k] * m.ptr[k][j];
					}
				}
			}
			return temp;
		}
		
		
		void accept_array()
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					cout<<" Enter element of array ["<<i<<"] ["<<j<<"] :";
					cin>>ptr[i][j];
				}
			}
		}
		
		
		void display_array()
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					cout<<ptr[i][j]<<" ";
				}
				cout<<endl;
			}
		}
	
};


int main()
{
	myMatrix m;
	m.accept_array();
	m.display_array();
	cout<<endl;
	myMatrix m1(3,3);
	m1.accept_array();
	m1.display_array();
	cout<<endl;
	myMatrix m2;
	m2=m1+m;
	m2.display_array();
	cout<<endl;
	myMatrix m3;
	m3=m1-m;
	m3.display_array();
	cout<<endl;
	myMatrix m4;
	m4=m*m1;
	m4.display_array();
	
	
	return 0;
}
