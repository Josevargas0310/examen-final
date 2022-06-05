
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
}
