
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          NewJFrame gui=new NewJFrame();
        byte opc=0,op=0;
     Menu mn= new Menu();
        System.out.println("\tCALCULADORA EN CONSOLA Y GUI.");
        System.out.println("1.CONSOLA.");
        System.out.println("2.GUI.");
        System.out.println("SELECIONE UNA OPCION.");
        op=sc.nextByte();
        if (op==1){
         mn.opciones();
         opc=sc.nextByte();
         mn.setmenu(opc);
        }
        if(op==2){
         gui.setTitle("CALCULADORA GUI");
        gui.setVisible(true);
        }
}
}
