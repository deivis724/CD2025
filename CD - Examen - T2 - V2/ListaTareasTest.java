public class ListaTareasTest {

    @Test
    public void testAgregarTarea() {
        ListaTareas listaTareas = new ListaTareas();
        listaTareas.agregarTarea("Comprar leche");
        assertEquals(1, listaTareas.obtenerNumeroTareasPendientes());
    }

    @Test
    public void testMarcarTareaComoCompletada() {
        ListaTareas listaTareas = new ListaTareas();
        listaTareas.agregarTarea("Comprar leche");
        listaTareas.marcarTareaComoCompletada(0);
        assertEquals(0, listaTareas.obtenerNumeroTareasPendientes());
    }
}