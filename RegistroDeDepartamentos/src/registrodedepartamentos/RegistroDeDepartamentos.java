
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
              