import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EntregaAgendada extends Entrega{

    //Atributos
    private LocalDate dataEntrega;

    public EntregaAgendada(LocalDate dataEntrega){
        if (dataEntrega.isBefore(LocalDate.now())) { // Se a data escolhida for inferior a data de hoje
            System.out.println("A data de entrega não pode ser anterior à data atual!!!");
        } else {
            this.dataEntrega = dataEntrega;
        }
    }

    @Override
    public int calcularPrazo() { // Calcula quantos dias existem entre a data atual
        //                          e a data escolhida para a entrega.
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), dataEntrega);
    }

    @Override
    public float calcularFrete() {
        return 30.0f;
    }

    @Override
    public String toString(){
        return "Entrega Agendada";
    }
}
