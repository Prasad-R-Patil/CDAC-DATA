#include <stdio.h>


// Function to multiply two matrices
void multiplyMatrices(int firstMatrix[][10], int secondMatrix[][10], int result[][10], int row1, int col1, int col2) 
{
     printf("********************************************************************************************************************\n");
    for (int i = 0; i < row1; i++) 
    {
        for (int j = 0; j < col2; j++) 
        {
            result[i][j] = 0;
            for (int k = 0; k < col1; k++) 
            {
                result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
            }
        }
    }
     printf("********************************************************************************************************************\n");
}

// Function to take matrix input
void inputMatrix(int matrix[][10], int row, int col) 
{
     printf("********************************************************************************************************************\n");
    for (int i = 0; i < row; i++) 
    {
        for (int j = 0; j < col; j++) 
        {
            printf("Enter element [%d][%d]: ", i + 1, j + 1);
            scanf("%d", &matrix[i][j]);
        }
    }
     printf("********************************************************************************************************************\n");
}

// Function to display a matrix
void displayMatrix(int matrix[][10], int row, int col)
{
     printf("********************************************************************************************************************\n");
    for (int i = 0; i < row; i++) 
    {
        for (int j = 0; j < col; j++) 
        {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
     printf("********************************************************************************************************************\n");
}

int main() 
{
    int firstMatrix[10][10], secondMatrix[10][10], result[10][10];
    int row1, col1, row2, col2;

    printf("********************************************************************************************************************\n");
    // Taking input for the first matrix
    printf("Enter rows and columns for first matrix: ");
    scanf("%d %d", &row1, &col1);
    
     printf("********************************************************************************************************************\n");
    // Taking input for the second matrix
    printf("Enter rows and columns for second matrix: ");
    scanf("%d %d", &row2, &col2);
    printf("********************************************************************************************************************\n");
    // Check if multiplication is possible
    if (col1 != row2) {
        printf("Matrix multiplication not possible. Columns of first matrix must be equal to rows of second matrix.\n");
        return 0;
    }
     printf("********************************************************************************************************************\n");
    // Taking matrix inputs
    printf("Enter elements of first matrix:\n");
    inputMatrix(firstMatrix, row1, col1);

 printf("********************************************************************************************************************\n");
    printf("Enter elements of second matrix:\n");
    inputMatrix(secondMatrix, row2, col2);

 printf("********************************************************************************************************************\n");
    // Multiply matrices
    multiplyMatrices(firstMatrix, secondMatrix, result, row1, col1, col2);

 printf("********************************************************************************************************************\n");
    // Displaying matrices
    printf("First Matrix:\n");
    displayMatrix(firstMatrix, row1, col1);

 printf("********************************************************************************************************************\n");
    printf("Second Matrix:\n");
    displayMatrix(secondMatrix, row2, col2);
  
  printf("********************************************************************************************************************\n");
    printf("Product of matrices:\n");
    displayMatrix(result, row1, col2);
 
 printf("********************************************************************************************************************\n");
    return 0;
}
