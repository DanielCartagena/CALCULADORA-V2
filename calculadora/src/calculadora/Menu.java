
package calculadora;

import java.util.Scanner;

public class Menu {
    
    public Menu(){
    }
    int Opcion=0; 
    double Resul,Nume=0,Cnume=0;
    Scanner sc=new Scanner(System.in);
    public void opciones(){
        System.out.println("\t\t CALCULADORA");
         System.out.println("1. SUMA");
         System.out.println("2. RESTA");        
         System.out.println("3. MULTIPLICAION");    
         System.out.println("4. DIVISION");
         System.out.println("5. ENESIMA-POTENCIA");
         System.out.println("6. RAIZ-ENESIMA");
         System.out.println("7. SENO");
         System.out.println("8. COSENO");
         System.out.println("9. TANGENTE");
         System.out.println("10. IVA(19%");
         System.out.println("\nSELECIONES UNA OPCION: ");
}
    public void setmenu(byte op){
    Opcion=op;switch (Opcion) {
            case 1:
                System.out.println("El resultado es: "+  Suma());
                break;
            case 2:
        
                 System.out.println("El resultado es: "+ Resta());
                break;
            case 3:
                 System.out.println("El resultado es: "+ Multiplicacion());
                break;
            case 4:
                 System.out.println("El resultado es: "+ Division());
                break;
              case 5:
                System.out.println("El resultado es: "+ Potencia());
                break;    
            case 6:
                System.out.println("El resultado es: "+ Raiz());
                break;   
            case 7:
                System.out.println("El resultado es: "+ Seno());
                break;
            case 8:
                System.out.println("El resultado es: "+ Coseno());
                break;    
            case 9:
                System.out.println("El resultado es: "+ Tangente());
                break;
            case 10:
                System.out.println("El resultado es: "+ Iva());
                break;  
            default:
                System.out.println("Opcion invalida.");
        }
    }
    public double Suma(){
        Nume=0;
        System.out.println("Cantidad de numeros a sumar: ");
        Cnume= sc.nextInt();
        for (int i = 0; i < Cnume; i++) {
            System.out.println("Ingrese el numero:");
            Nume+=sc.nextDouble();
        }
        return Resul=Nume;
    }
    public double Resta(){
        System.out.println("Cantidad de numeros a restar: ");
        Cnume= sc.nextInt();
        System.out.println("Ingrese el numero:");
            Nume=sc.nextDouble();
        for (int i = 0; i < Cnume-1; i++) {
            System.out.println("Ingrese el numero:");
            Nume-=sc.nextDouble();
        }
        return Resul=Nume;
    }
    public double Multiplicacion(){
        Nume=1;
        System.out.println("Cantidad de numeros a multiplicar: ");
        Cnume= sc.nextInt();
        for (int i = 0; i < Cnume; i++) {
            System.out.println("Ingrese el numero:");
            Nume*=sc.nextDouble();
        }
        return Resul=Nume;
    }
    public double Division(){
         System.out.println("Ingrese el dividendo:");
            Nume=sc.nextDouble();
            System.out.println("Ingrese el divisor:");
            Nume/=sc.nextDouble();
        return Resul=Nume;
    }
    public double Potencia(){
        System.out.println("Ingrese la base:");
        Nume=sc.nextDouble();
        System.out.println("Ingrese el exponente:");
        Cnume=sc.nextDouble();
        Resul=Math.pow(Nume,Cnume) ;
        return Resul;
    }
    public double Raiz(){
        System.out.println("Ingrese el radicando:");
        Nume=sc.nextDouble();
        System.out.println("Ingrese el indice:");
        Cnume=sc.nextDouble();
        Resul=Math.pow(Nume,1/Cnume) ;
        return Resul;
    }
    public double Seno(){
        System.out.println("Ingrese el angulo:");
        Nume=sc.nextDouble();
        Resul=Math.sin(Nume);
        return Resul;
    }
    public double Coseno(){
         System.out.println("Ingrese el angulo:");
        Nume=sc.nextDouble();
        Resul=Math.cos(Nume);
        return Resul;
    }
    public double Tangente(){
        System.out.println("Ingrese el angulo:");
        Nume=sc.nextDouble();
        Resul=Math.tan(Nume);
        return Resul;
    }
    public double Iva(){
         System.out.println("Ingrese el valor al caul se le calculara el IVA:");
        Nume=sc.nextDouble();
        Resul=Nume*0.19;
        return Resul;
    } 
}

