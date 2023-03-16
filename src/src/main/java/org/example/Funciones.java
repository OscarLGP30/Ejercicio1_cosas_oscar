package org.example;

public class Funciones {
    //Escribir una función recursiva que calcule x elevado y mediante multiplicaciones sucesivas,
    //Siendo x e y dos números enteros.
    //Con double para que no haya problemas con los decimales.
    public double potencia(double x, int y){
        if (y == 0){
            return 1;
        }else{
            return x * potencia(x, y-1);
        }
    }





    //Escribir una función recursiva que calcule x elevado
    //Con un orden computacional de O log(n) aprovechando la propiedad.
    //Con double para que no haya problemas con los decimales.
    public double potencia2(double x, int y){
        if (y == 0){
            return 1;
        }else if (y % 2 == 0){
            return potencia2(x*x, y/2);
        }else{
            return x * potencia2(x*x, (y-1)/2);
        }
    }







}
