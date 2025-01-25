/* Elabore um programa que receba o nome e a idade de uma pessoa e informe o nome,
a idade e o valor da mensalidade de um plano de saúde.*/

#include <stdio.h>
int main()
{
    char nome[50];
    float mensalidade, idade;

    printf("Digite o nome: ");
    scanf("%s", nome);
    printf("Digite a idade: ");
    scanf("%f", &idade);
    printf("\n");

    if (idade < 18)
    {
        mensalidade = 100;
    }
    else if (idade >= 18 && idade <= 29)
    {
        mensalidade = 150;
    }
    else if (idade >= 30 && idade <= 45)
    {
        mensalidade = 200;
    }
    else if (idade >= 46 && idade <= 65)
    {
        mensalidade = 250;
    }
    else
    {
        mensalidade = 300;
    }

    printf("### Plano de saúde ###");
    printf("Nome: ", nome);
    printf("Idade: ", idade);
    printf("Mensalidade: ", mensalidade);
   
}