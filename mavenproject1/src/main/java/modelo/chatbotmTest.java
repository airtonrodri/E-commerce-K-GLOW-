package modelo;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


public class chatbotmTest {

    @Test
    public void testGetRespuesta_Hola() {
        chatbotm modelo = new chatbotm();
        String resultado = modelo.getRespuesta("hola");
        String esperado = "¡Hola! ¿En qué puedo ayudarte hoy?\n" +
                          "1. Productos\n" +
                          "2. Horarios\n" +
                          "3. Redes sociales\n" +
                          "4. Otras consultas\n" +
                          "5. Cita para maquillajes";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testGetRespuesta_Opcion1() {
        chatbotm modelo = new chatbotm();
        String resultado = modelo.getRespuesta("1");
        String esperado = "Información sobre productos: Aquí puedes encontrar detalles sobre nuestros productos.";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testGetRespuesta_OpcionInvalida() {
        chatbotm modelo = new chatbotm();
        String resultado = modelo.getRespuesta("99");
        String esperado = "Opción no válida. Por favor, selecciona una opción del 1 al 5.";
        assertEquals(esperado, resultado);
    }
}

