package com.mycompany.bibliotecapoo;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
     Biblioteca a = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese 1 para ingresar un libro");
int opcion1 = sc.nextInt();




switch (opcion1) {
    case 1:
    System.out.println("ingrese el nombre del libro");
String tituloSc = sc.nextLine();
sc.nextLine();
System.out.println("ingrese el nombre del autor del libro");
String autorSc = sc.nextLine();
System.out.println("ingrese el año de publicacion del libro");
int anoPublicacionSc = sc.nextInt();
sc.nextLine();
System.out.println("ingrese el genero del libro");
String generoSc = sc.nextLine();

Libro lectura = new Libro(tituloSc, autorSc, anoPublicacionSc, generoSc);
System.out.println("ingrese 1 para mostrar el libro");
System.out.println("ingrese 2 para buscar el libro");
System.out.println("ingrese 3 para marcar el libro como leido");
System.out.println("ingrese 4 para mostrar los libros no leidos");
        
      int opcion2 = sc.nextInt();  



      
      switch (opcion2) {
            case 1:

            a.mostrarLibro();

            System.out.println(a.mostrarLibro());
    break;

    case 2://buscar libro

    a.buscarLibro(tituloSc);
    a.buscarLibro(autorSc);
    a.buscarLibro(generoSc);

    System.out.println(a.buscarLibro(tituloSc)+" "+a.buscarLibro(autorSc)+" 1"+a.buscarLibro(generoSc));

    break;

    case 4:

    lectura.marcarLeido();



        break;

        case 5:

        a.mostrarLibrosNoLeidos();

        System.out.println(a.mostrarLibrosNoLeidos());


        default:
            break;
    }


break;

    default:
        break;
}






            


    }
}
