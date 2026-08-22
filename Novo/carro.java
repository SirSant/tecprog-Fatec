public class carro{
    String marca;
    String modelo;
    String cor;
    int velocidade;

    public static void main(String[] args){
    }
    void acelerar(){
        velocidade = velocidade + 10;
    }
    void frear (){
        velocidade = velocidade - 10;
    }
    void bater(){
        velocidade = 0;
    }

    void mostrardanos(){
        System.out.println("marca:" + marca);
        System.out.println("Cor:" + cor);
        System.out.println("modelo:" + modelo);
        System.out.println("Velocidade:" + velocidade);
    }
}