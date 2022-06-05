
package registrodedepartamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listas {
    static Scanner scanner = new Scanner (System.in);
    //declaracion de las listas 
    List<String>Departamentos = new ArrayList<>();
    List<Integer>noDepartamento = new ArrayList<>();
    List<String>cantidadMunicipios = new ArrayList<>();
    List<String>cabeceras = new ArrayList<>();
    
    
    public void departamentos(){
        System.out.println("Ingrese el nombre del departamento que desea registrar");
        String depa= scanner.next();
        System.out.println("Ingrese el numero de orden correspondiente al departamento");
        int num=scanner.nextInt();
        Departamentos.add(depa);
        noDepartamento.add(num);   
    }
    public void cabecerasDepartamentales(){
        System.out.println("Ingrese la cabecera del departamento");
        String cabe= scanner.next();
        cabeceras.add(cabe);
    }
    public void municipios(){
        System.out.println("Ingrese la cantidad de municipios del departamento");
        String muni= scanner.next();
        cantidadMunicipios.add(muni);
        
    }
    public void mostrarDepas(){
        for (int i=1; i<Departamentos.size(); i++){
            if(Departamentos !=null){
        System.out.println("DEPARTAMENTOS "+Departamentos);
        }
        }
        System.out.println("");
        for (String siguiente : Departamentos){
            if(siguiente !=null){
                
            }
        }
    }
    public void mostrarMunicipios(){
        for (int i=1; i<cantidadMunicipios.size(); i++){
         if (cantidadMunicipios!=null){
             System.out.println("Cantidad de municipios "+ cantidadMunicipios);
         }
        }
        System.out.println("");
        for (String siguiente : cantidadMunicipios){
            if(siguiente !=null){
                
            }
    }
    }
    public void mostrarCabeceras(){
        for (int i=1; i<cabeceras.size(); i++){
         if (cabeceras!=null){
             System.out.println("Cabecera del departamento "+ cabeceras);
         }
        }
        System.out.println("");
        for (String siguiente : cabeceras){
            if(siguiente !=null){
                
            }
    }
    }
    public void vaciarDepas(){
        Departamentos.clear();
    }
    public void vaciarMunicipios(){
        cantidadMunicipios.clear();
    }
    public void vaciarCabeceras(){
        cabeceras.clear();
    }
    
    public void verificador(){
        System.out.println("Ingrese el numero del departamento que desea buscar");
        int buscador=scanner.nextInt();
        int ubicacion= Departamentos.indexOf(buscador);
        if(ubicacion<=noDepartamento.indexOf(ubicacion)){
            System.out.println("Departamento >>> "+ Departamentos);
        }
            
    }
    
    //registro de datos
    public List<String> getDepartamentos(){
        return Departamentos;
    }
     public List<String> getcantidadMunicipios(){
     return cantidadMunicipios;
    }
      public List<String> getcabeceras(){
        return cabeceras;
    }
}

