public class EntregaNormal extends Entrega{


    //Sobrescrevendo um metodo da classe da classe pai (Definindo o proprio comportamento)
    //A classe filha recebe um metodo da classe pai e fornece uma nova implementação para ele.

    @Override //É a anotação que diz ao Java: "Estou sobrescrevendo um metodo que veio da classe pai; verifique isso para mim."
    public int calcularPrazo() {
        return 7;
    }

    @Override
    public float calcularFrete() {
        return 21.0f;
    }

    //Metodo que retorna o nome da classe como String
    @Override
    public String toString(){
        return "Entrega normal";
    }
}
