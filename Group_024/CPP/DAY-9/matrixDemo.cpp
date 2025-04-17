#include<iostream>
using namespace std;

class matrix{
  int row,col;
  int **mat;

  public:
      matrix();
      matrix(int);
      matrix(int, int);
      ~matrix();
      matrix(const matrix &);
      void accept_values();
      void display();
      matrix operator +(matrix &);
      const matrix &operator = (const matrix &);
      matrix operator *(matrix &);

      friend istream & operator >>(istream &din, matrix &m);
      friend ostream &operator<<(ostream &dout, matrix &m);

  /*    void transpose();
      int sum_diagonal();
      void spiral_print();
      void MakeNonDiagonalZero();*/

};

istream & operator >>(istream &din, matrix &m)
{
 /*   cout<<"\n Enter row and col for matrix :";
    din>>m.row;
    din>>m.col;  does not make any sense*/
    for(int i=0;i<m.row ; i++)
    {
        for(int j = 0;j<m.col;j++)
        {
            din>>m.mat[i][j];
        }
    }
    return din;
}

ostream &operator<<(ostream &dout, matrix &m)
{
    for(int i=0;i<m.row;i++)
    {
        for(int j=0;j<m.col;j++)
            dout<<"  "<<m.mat[i][j];
        dout<<"\n";
    }
    return dout;
}

matrix::matrix()
{
    row = col = 3;
    mat = new int*[row];
    for(int i=0 ; i<row; i++)
        mat[i] = new int[col];

    for(int i=0;i<row;i++)
    {
        for(int j = 0;j<col ;j++)
            mat[i][j] = 0;
    }
}


matrix::matrix(int r, int c)
{
    row = r;
    col = c;
    mat = new int*[row];
    for(int i=0 ; i<row; i++)
        mat[i] = new int[col];

    for(int i=0;i<row;i++)
    {
        for(int j = 0;j<col ;j++)
            mat[i][j] = 0;
    }
}

matrix::matrix(int r)
{
    row = col = r;
    mat = new int*[row];
    for(int i=0 ; i<row; i++)
        mat[i] = new int[col];

    for(int i=0;i<row;i++)
    {
        for(int j = 0;j<col ;j++)
            mat[i][j] = 0;
    }
}

matrix:: ~matrix()
{
    for(int i=0;i<row ; i++)
        delete []mat[i];

    delete []mat;
}

matrix::matrix(const matrix &m)
{
    row = m.row;
    col = m.col;
    mat = new int *[row];
    for(int i = 0;i<row ;i++)
        mat[i] = new int[col];

    for(int i=0; i<row; i++)
    {
        for(int j = 0;j<col ;j++)
        {
            mat[i][j] = m.mat[i][j];
        }
    }
}

void matrix::accept_values()
{
    for(int i=0;i<row ;i++)
    {
        for(int j=0;j<col;j++)
        {
            cout<<"\n Enter a number :";
            cin>>mat[i][j];
        }
    }
}
void matrix::display()
{
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
            cout<<"   "<<mat[i][j];

        cout<<"\n";
    }
}

matrix matrix::operator +(matrix &m)
{
    matrix temp(row,col);
    for(int i=0 ;i < row;i++)
    {
        for(int j=0;j<col;j++)
        {
          temp.mat[i][j] = mat[i][j] + m.mat[i][j];
        }
    }
    return temp;
}

const matrix &matrix::operator = (const matrix &m)
{
    for(int i=0;i<row ; i++)
        delete []mat[i];

    delete []mat;

    row = m.row;
    col = m.col;

    mat = new int *[row];
    for(int i = 0;i<row ; i++)
        mat[i] = new int[col];

    for(int i=0 ;i<row ; i++)
    {
        for(int j = 0;j<col ;j++)
            mat[i][j] = m.mat[i][j];
    }
    return *this;
}
// 2 * 2
matrix matrix::operator*(matrix &m)  // matrix m(m2)
{
   matrix temp(m.row,m.col);
   int i,j,k,sum;

   for(i=0; i<row ;i++)
   {
       for(j=0;j<col;j++)
       {
           sum = 0;
           for(k=0;k<row ;k++)
           {
               sum = sum + mat[i][k] * m.mat[k][j];
           }
           temp.mat[i][j] = sum;
       }
   }

}




int main()
{
    matrix m1(2,2), m2(2,2), m3(2,2);
    //matrix m4(m3);
    //m1.accept_values();
    cout<<"\n Enter values for matrix: ";
    cin>>m1;
    m2.accept_values();

   // m3 = m1 + m2;
    m3 = m1 * m2;   //m1.operator*(m2)
    m3.display();

   // m3 = m2 = m1;

   // m1.display();
    cout<<m1;
   // m2.display();
  //  m3.display();
    // m3 = m2;   // m3.operator =(m2)
    return 0;
}
