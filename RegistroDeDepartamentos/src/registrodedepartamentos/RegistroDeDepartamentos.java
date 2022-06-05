
package registrodedepartamentos;
import java.util.Scanner;
public class RegistroDeDepartamentos {
static Scanner scanner = new Scanner (System.in);
listas obj = new listas();
  
    public static void main(String[] args) {
        System.out.println("/-----------------------------------------------------------------------------------------------------/\n"
                + "/                           BIENVENIDO AL SISTEMA DE REGISTRO DE Departamentos                        /\n"
                + "/-----------------------------------------------------------------------------------------------------/\n"
                + "/  A continuacion se le presenta distintas opciones escoja la opcion deseada                          /\n"
                + "/                                                                                                     /\n"
                + "/  1. Ingresar datos atraves de listas               2. Ingresar datos atraves de vectors             /\n"
                + "/-----------------------------------------------------------------------------------------------------/\n");
        int opcion=scanner.nextInt();
        if (opcion==1){
            int ok;
            listas objeto = new listas();
            do{ 
            System.out.println("/-----------------------------------------------------------------------------------------------------/\n"
                + "/                           BIENVENIDO AL SISTEMA DE REGISTRO DE DEPARTAMENTOS                        /\n"
                + "/-----------------------------------------------------------------------------------------------------/\n"
                + "/  A continuacion se le presenta distintas opciones escoja la opcion deseada                          /\n"
                + "/                                                                                                     /\n"
                + "/  1. REGISTRAR DEPARTAMENTOS              2. MOSTRAR LOS DEPARTAMENTOS REISTRADOS                    /\n"
                + "/  3. BUSCAR UN DEPARTAMENTO REGISTRADO    4. VACIAR LSITA                                            /\n"
                + "/  5. MOSTRAR TODOS LOS DATOS REGISTRADOS  6. salir del programa                                      /\n"
                + "/-----------------------------------------------------------------------------------------------------/\n");
              int opcion1=scanner.nextInt();
              switch(opcion1){
                  case 1 : 
                      int seguir;
                      do{
                      objeto.departamentos();
                      objeto.cabecerasDepartamentales();
                      objeto.municipios();
                       System.out.println("si deseas seguir registrando departaemntos ingresa 0, de lo contrario ingresa 1.");
                      seguir =scanner.nextInt();
              }while(seguir==0);
                  break;
                  case 2:
                      objeto.mostrarDepas();
                   break;
                  case 3:
                      objeto.verificador();
                      
                   break;
                  case 4: 
                      objeto.vaciarDepas();
                      objeto.vaciarCabeceras();
                      objeto.vaciarMunicipios();
                   break;
                  case 5:
                      objeto.mostrarDepas();
                      objeto.mostrarCabeceras();
                      objeto.mostrarMunicipios();
              }
              System.out.println("si deseas continuar ingresa 0, de lo contrario ingrese 6");
              ok=scanner.nextInt();
              }while(ok==0);
    
            
        }if(opcion==2){
            int seguir;
            metodos utilizable= new metodos();
            do{ 
            System.out.println("/-----------------------------------------------------------------------------------------------------/\n"
                + "/                           BIENVENIDO AL SISTEMA DE REGISTRO DE DEPARTAMENTOS                        /\n"
                + "/-----------------------------------------------------------------------------------------------------/\n"
                + "/  A continuacion se le presenta distintas opciones escoja la opcion deseada                          /\n"
                + "/                                                                                                     /\n"
                + "/  1. REGISTRAR DEPARTAMENTOS              2. BUSCAR UN DEPARTAMENTO REGISTRADO                       /\n"
                + "/  3. MOSTRAR CABECERAS DEPARTAMENTALES    4. MOSTRAR municipios                                      /\n"
                + "/  5. MOSTRAR TODOS LOS DATOS REGISTRADOS                                                             /\n"
                + "/-----------------------------------------------------------------------------------------------------/\n");
            int opc=scanner.nextInt();
            switch(opc){
                case 1: 
                    int auxiliar;
                    do{
                    utilizable.departamentos();
                    utilizable.cabeceras();
                    utilizable.municipios();
                    System.out.println("si desea seguir registrando departamentos ingrese 0, de lo contrario ingrese 6");
                    auxiliar=scanner.nextInt();
                    }while(auxiliar==0);
                break;
                case 2:
                    utilizable.busquedaDapa();
                break;
                case 3:
                    utilizable.mostrarCabeceras();
                  break;
                case 4:
                    utilizable.mostrarMunicipios();
                    break;
                case 5: 
                    utilizable.mostrarDepartamentos();
                    utilizable.mostrarMunicipios();
                    utilizable.mostrarCabeceras();
                break;
                    
                    
            }
            System.out.println("si deseas continuar ingresa 0");
            seguir=scanner.nextInt();
            }while(seguir==0);
            
            
        }else{
            System.out.println("Por favor ingrese uno de los dos digitos que se le presentan");
        }
    
    

}
}
