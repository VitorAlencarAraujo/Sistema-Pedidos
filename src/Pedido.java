import java.sql.SQLOutput;

public class Pedido {

    //Atributos
    private int numero;
    private String nomeCliente;
    private float valor;
    private float pesoTotal;
    private Entrega entrega;

    // Construtor -> Metodo especial que é executado quando você cria um objeto
    public Pedido(int numero, String nomeCliente, float valor, float pesoTotal, Entrega entrega){

        if (numero <= 0 ){
            System.out.println("O número do pedido não pode ser menor ou igual a 0!!!");
            this.numero = numero;

        } else {
            this.numero = numero;
        }

        if (nomeCliente == null){
            System.out.println("É preciso informar o nome do cliente!!!");
            this.nomeCliente = "";
        } else {
            this.nomeCliente = nomeCliente;
        }

        if (valor <= 0 ){
            System.out.println("valor não pode ser menor ou igual a 0!!!");
            this.valor = valor;
        }else {
            this.valor = valor;
        }

        if (pesoTotal <=0 ){
            System.out.println("O peso não pode ser menor ou igual a 0!!!");
            this.pesoTotal = pesoTotal;
        } else {
            this.pesoTotal = pesoTotal;
        }

        if (entrega == null){
            System.out.println("É preciso informar o tipo da entrega!!!");
        } else {
            this.entrega = entrega;
        }
    }

    public double calcularFrete(){
        return entrega.calcularFrete();
    }

    public int calcularPrazo(){
        return entrega.calcularPrazo();
    }

    public double calcularTotal(){
        return valor + entrega.calcularFrete();
    }

    //Metodo para retornar os status do pedido
    public void status(){
        System.out.println("\nNúmero do pedido: " + this.numero);
        System.out.println("Nome cliente: " + this.nomeCliente);
        System.out.println("Valor em produtos: R$" + this.valor);
        System.out.println("Peso: " + this.pesoTotal + "g");
        System.out.println("Tipo de entrega: " + entrega.toString());
        System.out.println("Frete: R$" + calcularFrete());
        System.out.println("Prazo: " + calcularPrazo() + " dias");
        System.out.println("========== PREÇO FINAL ==========");
        if (calcularTotal() <=0){
            System.out.println(" - ERRO - ");
        } else {
            System.out.println("R$ " + calcularTotal());
        }
    }
}
