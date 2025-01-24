// Calculo da media do aluno de inteiros

#include <stdio.h>

int main() {
    float n1, n2, n3, n4;
    float media;

    printf("Digite a primeira nota: ");
    scanf("%d", &n1);
    printf("Digite a segunda nota: ");
    scanf("%d", &n2);
    printf("Digite a terceira nota: ");
    scanf("%d", &n3);
    printf("Digite a quarta nota: ");
    scanf("%d", &n4);

    media = (n1 + n2 + n3 + n4) / 4;

   if (media >= 70) {
        printf("Aprovado com media: ", media);
    } else if (media >= 40) {
        printf("Recuperacao com media: ", media);
    } else {
        printf("Reprovado com media: ", media);
    }
    return 0;
}
