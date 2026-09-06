public class RetiradaNaLoja extends Entrega{

    @Override
    public int calcularPrazo() {
        return 1;
    }

    @Override
    public float calcularFrete() {
        return 0.0f;
    }

    @Override
    public String toString(){
        return "Retirada na loja";
    }
}
