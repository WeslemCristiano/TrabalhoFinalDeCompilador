//Faça um programa que leia um número e informe se ele é divisível por 5.

 #include <stdio.h>
 int main(){
     int num;
     printf("Digite um número: ");
     scanf("%d", &num);
     if(num % 5 == 0){
         printf("O número é divisível por 5: ", num);
     }else{
         printf("O número não é divisível por 5: ", num);
     }
     return 0;
 }