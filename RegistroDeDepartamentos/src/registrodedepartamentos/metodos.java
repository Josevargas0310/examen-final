
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


