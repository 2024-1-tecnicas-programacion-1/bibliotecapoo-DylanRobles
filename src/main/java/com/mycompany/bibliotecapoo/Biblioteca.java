package com.mycompany.bibliotecapoo;
import java.util.LinkedList;
public class Biblioteca {
LinkedList <Libro> libros = new LinkedList<>();


public Libro registarLibro(Libro registro){

    libros.add(registro);

return registarLibro(registro);
}

public String buscarLibro(String palabraBusqueda){

for (Libro r : libros) {
    
   
    if(r.getTitulo().equals(palabraBusqueda)){

        return palabraBusqueda;
    }


}
return "";
}

public Libro mostrarLibro(){

 for(int i = 0; i > libros.size(); i++){

  return  libros.get(i);
 }   

return libros.get(0);

}

public String mostrarLibrosNoLeidos(){
    
    
   for (Libro r : libros) {
    if(r.getLeido() == false){

        return r.getTitulo();
    }

   }
      

return "este libro ya ha sido leido";
}


}

