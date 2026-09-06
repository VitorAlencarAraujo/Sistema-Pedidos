import java.sql.SQLOutput;

void main(){

    System.out.println("\n PEDIDO NORMAL:");

    Pedido pedidoNormal = new Pedido(
            10,
            "Vitor",
            140.0f,
            13.5f,
            new EntregaNormal()
    );
    pedidoNormal.status();

    System.out.println("");
    System.out.println("\n PEDIDO NORMAL COM TESTE DE VALIDAÇÃO: ");

    Pedido pedidoNomalTesteValidacao = new Pedido(
            -11,
            null,
            -140.0f,
            -13.5f,
            new EntregaNormal()
    );
    pedidoNomalTesteValidacao.status();

    System.out.println("");
    System.out.println("\n PEDIDO EXPRESSO:");

    Pedido pedidoEspresso = new Pedido(
            12,
            "Vitor",
            140.0f,
            13.5f,
            new EntregaExpressa()
    );
    pedidoEspresso.status();

    System.out.println("");
    System.out.println("\n RETIRADA NA LOJA:");

    Pedido pedidoRetiradaLoja = new Pedido(
            13,
            "Vitor",
            140.0f,
            13.5f,
            new RetiradaNaLoja()
    );
    pedidoRetiradaLoja.status();

    System.out.println("");
    System.out.println("\n ENTREGA AGENDADA:");

    Pedido pedidoEntregaAgendada = new Pedido(
            14,
            "Vitor",
            140.0f,
            13.5f,
            new EntregaAgendada(LocalDate.of(2026,9,10))
    );
    pedidoEntregaAgendada.status();

}