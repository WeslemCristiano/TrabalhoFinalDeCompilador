// matriz 2x3

#include <stdio.h>

int main()
{
    int a[2][3] = {{1, 2, 3}, {4, 5, 6}};
    int i, j;

    for (i = 0; i < 2; i = i + 1)
    {
        for (j = 0; j < 3; j = j + 1)
        {
            printf("Matriz (A): ", a[i][j]);
        }
    }

  

    return 0;
}