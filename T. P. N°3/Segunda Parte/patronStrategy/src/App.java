import edu.unam.modelo.EnvioExpreso;
import edu.unam.modelo.EnvioInternacional;
import edu.unam.modelo.EnvioRegular;
import edu.unam.modelo.Pedido;

public class App {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(2.5);  // peso del pedido en kg

        // Envío Regular
        pedido.establecerMetodoEnvio(new EnvioRegular());
        pedido.calcularCostoEnvio();

        // Envío Expreso
        pedido.establecerMetodoEnvio(new EnvioExpreso());
        pedido.calcularCostoEnvio();

        // Envío Internacional
        pedido.establecerMetodoEnvio(new EnvioInternacional());
        pedido.calcularCostoEnvio();
    }
}
