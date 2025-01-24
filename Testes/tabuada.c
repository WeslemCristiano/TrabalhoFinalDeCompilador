// tabuada - Programa que exibe a tabuada de um número

#include <stdio.h>

int main() {
    int n, i, a;

    printf("Digite um numero:");
    scanf("%d", &n);
    printf("Tabuada do ", n);

    for (i = 0; i <= 10; i = i + 1) {
        a = n * i;
        printf(n, " x ", i, " = ", a);
    }

    return 0;
}