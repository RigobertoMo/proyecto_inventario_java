import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InventarioTest {
    @Test 
    void calcularSubtotalDeCuatroProductos() {
        int resultado = Inventario.calcularSubtotal(50, 50);
        assertEquals(200, resultado);
    }
}