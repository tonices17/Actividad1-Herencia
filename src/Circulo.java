import java.util.Scanner;

public class Circulo {

    public double radio;

    public Circulo(double radio){
        if(radio<0){
            this.radio=0;
        }
        else{
            this.radio=radio;
        }
    }

    public double getRadio(){
        return radio;
    }
    public double getArea(){
        return radio*radio*Math.PI;
    }

    public static class Cilindro extends Circulo{

        public double altura;

        public Cilindro(double radio, double altura) {
            super(radio);
            if(altura<0){
                this.altura=0;
            }
            else{
                this.altura=altura;
            }
        }

        public double getAltura(){
            return altura;
        }
        public double getVolumen(){
            return getArea()*altura;
        }
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.print("Introduce el radio del círculo: ");
        Circulo circulo = new Circulo(sc.nextDouble());
        System.out.println("El radio introducido es: "+circulo.getRadio());
        System.out.println("El area del circulo con radio "+circulo.getRadio()+" es: "+circulo.getArea());

        System.out.println("---------------------------------");
        System.out.print("Introduce la altura del cilindro: ");
        Cilindro cilindro = new Cilindro(circulo.radio, sc.nextDouble());
        System.out.println("La altura introducida es: "+cilindro.getAltura());
        System.out.println("El volumen del cilindro de radio "+circulo.getRadio()+" es: "+cilindro.getVolumen());
    }
}
