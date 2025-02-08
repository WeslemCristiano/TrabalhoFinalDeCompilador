
#include <stdio.h>
#define max 10
#define min 5

int main()
{
    int x;

    printf("digite um numero: ");
    scanf("%d", &x);

    if (x > max)
    {
        printf("O numero: ", x, " e maior que: ", max);
    }
    else if (x < min)
    {
        printf("O numero: ", x, " e menor que: ", min);
    }
    else
    {
        printf("O numero: ", x, " esta entre: ", min, " e ", max);
    }
}
