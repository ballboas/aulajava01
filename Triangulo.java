import javax.swing.JOptionPane;
import java.util.Scanner;

class Triangulo{
  
  public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);
        
    int base;
    int altura;
    
    System.out.println("Digite a base do triangulo: ");
    base = Integer.parseInt(entrada.nextLine());
    
    System.out.println("Digite a altura do triangulo: ");
    altura = Integer.parseInt(entrada.nextLine());
    
    //2d para considerar o resultado como double
    double area = (base*altura)/2d;
    
    System.out.printf("A Area do Triangulo e: %f", area);

  }
}