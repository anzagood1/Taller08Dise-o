

public class IteradorTecnologia implements IteradorBase {
    public InventarioTecnlogia inventario;
    
    @Override
    public Producto getNext() {
        return null;
    }

    @Override
    public boolean hasMore() {
        return true;
    }
    
}
