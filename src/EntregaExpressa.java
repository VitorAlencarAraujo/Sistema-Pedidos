public class EntregaExpressa extends Entrega{

    @Override
    public int calcularPrazo() {
        return 2;
    }

    @Override
    public float calcularFrete() {
        return 52.50f;
    }

    @Override
    public String toString(){
        return "Entrega Expressa";
    }
}
