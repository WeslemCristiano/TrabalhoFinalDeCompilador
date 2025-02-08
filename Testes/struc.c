// teste de struct

#include <stdio.h>

struct pessoa {
    char nome[50];
    float altura;
};

int main() {
    
    struct pessoa p1;
    
    printf("Digite o nome da pessoa: ");
    scanf("%s", p1.nome);

    printf("Digite a altura da pessoa: ");
    scanf("%f", &p1.altura);

    printf("Nome: %s\n", p1.nome);
    printf("Altura: %.2f\n", p1.altura);

}