package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
    @GetMapping("/generar-password")

        public static void main(String[] args) {

            //Generador de contraseña
            String nuevoPassword;
            int longitudCadena=10;
            String generadorCadena,nuevaCadena;

            nuevaCadena=generadorCadena(longitudCadena);
            nuevoPassword=generarPassword();

            mostrarPassword(nuevoPassword,nuevaCadena);
        }



        public static String generadorCadena(int longitud){
            int indice;

            char [] alfabeto={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            char [] cadena= new char[longitud];
            for (int i=0;i<longitud;i++){
                indice=(int) (Math.random() * alfabeto.length);
                cadena[i] = alfabeto[indice];
            }

            return new String(cadena);
        }

        public static String generarPassword(){
            double aleatorio;
            long numeroAleatorio;


            aleatorio= Math.random()*1000000;
            numeroAleatorio= Math.round(aleatorio);



            return " "+ numeroAleatorio;
        }

        public static void mostrarPassword(String nuevoPassword, String nuevaCadena){
            System.out.println("Su nuevo password es: "+ nuevoPassword+nuevaCadena);
        }


}
