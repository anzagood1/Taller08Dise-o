public abstract class BaseHandler implements Handler{
    private Handler next;

    //Metodo para establecer el siguiente handler en la fila
    @Override
    public void setNext(Handler handler){

    }
    //Metodo para manejar parte de la la solicitud
    @Override
    public void handle(Request request){

    }
}
