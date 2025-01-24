//Calculo do IMC
#include <stdio.h>

int main() {
    float peso, altura;
    float imc;

    printf("Digite o peso: ");
    scanf("%f", &peso);
    printf("Digite a altura: ");
    scanf("%f", &altura);

    imc = peso / (altura * altura);

    if (imc >= 30) {
        printf("Obesidade com IMC: ", imc);
    } else if (imc >= 25) {
        printf("Sobrepeso com IMC: ", imc);
    } else if (imc >= 18.5) {
        printf("Normal com IMC: ", imc);
    } else {
        printf("Abaixo do peso com IMC: ", imc);
    }

    return 0;
}