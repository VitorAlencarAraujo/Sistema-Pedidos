public abstract class Entrega {

    //Atributos
    public String destino;

    //Métodos       //Esses metodos são abstratos então toda classe que herdar de
    //               -Entrega- deve obrigatoriamente herdar esses métodos

    public abstract int calcularPrazo();
    public abstract float calcularFrete();

}
