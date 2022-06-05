
package registrodedepartamentos;
import java.util.Scanner;
public class metodos {
    static Scanner scanner = new Scanner (System.in);
    private String[] departamentos;
    private String[]cabeceras;
    private String[]municipios;
    private int inicio;
    
    public metodos(){
    cabeceras=new String[24];
    municipios=new String[100];
    departamentos = new String[24];
    }
    
    //metodos
    public void departamentos(){
    System.out.println("Ingrese los nombres de los departamentos");
    String departamento=scanner.next();
    inicio=inicio+1;
    departamentos[inicio]="Departamento>>>> "+departamento;
    
    }
    public void municipios (){
    System.out.println("Ingrese la cantidad de municipios del departamento");
    String muni=scanner.next();
    inicio=inicio+1;
    municipios[inicio]= "Cantidad de municipios>>>>"+muni;
    }
    public void cabeceras (){
    System.out.println("Ingrese la cabecera del departamento");
    String cabeceras1=scanner.next();
    inicio=inicio+1;
    cabeceras[inicio]= "Cabeceras>>>>"+cabeceras1;
    }
    public void mostrarDepartamentos(){
        for (int i=1; i<departamentos.length; i++){
        if(departamentos[i]!=null){
            System.out.println("Departamento====="+ departamentos[i]);
        }
    }
        System.out.println("");
        for(String siguiente: departamentos){
            if(siguiente!=null){
                
            }
        }
    }
    public void mostrarMunicipios(){
          for (int i=1; i<municipios.length; i++){
        if(municipios[i]!=null){
            System.out.println("Departamento====="+ municipios[i]);
        }
    }
        System.out.println("");
        for(String siguiente: municipios){
            if(siguiente!=null){
                
            }
        }
    }   
    public void mostrarCabeceras(){
        for (int i=1; i<cabeceras.length; i++){
        if(cabeceras[i]!=null){
            System.out.println("Departamento====="+ cabeceras[i]);
        }
    }
        System.out.println("");
        for(String siguiente: cabeceras){
            if(siguiente!=null){
                
            }
        }
    }
    public void busquedaDapa(){
        String buscador=null;
        int pos=1;
        int res=pos;
        System.out.println("Imgrese el nombre del departamento que desea buscar");
        buscador=scanner.next();
        
        while (pos<departamentos.length){
            if(departamentos.equals(buscador)){
                res=pos++;
                   break;
            }else{
                pos++;
            }
        }if(res<=(departamentos.length+1)){
            System.out.println("El departamento que ingreso: "+buscador+" esta posicionado en: "+res);   
        }else{
            System.out.println("El departamento que ingreso no se encuentra");
        }
        
    }
    }


