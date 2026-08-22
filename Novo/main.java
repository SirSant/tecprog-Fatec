public class main{
    public static void main(String[]args){
        carro carro1 = new carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.cor = "Branco";
        carro1.velocidade = 0;

        System.out.println ("Estado incial: ");
        carro1.mostrardanos();

        System.out.println ("Acelerando...");
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        carro1.mostrardanos();

        System.out.println("Freando...");
        carro1.frear();
        carro1.frear();
        carro1.frear();
    
        carro1.mostrardanos();
    }
}