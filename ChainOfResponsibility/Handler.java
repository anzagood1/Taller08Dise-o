public interface Handler{

    //Metodo abstracto para establecer el siguiente handler en la fila
    void setNext(Handler handler);

    //Metodo abstracto para manejar parte de la la solicitud
    void handle(Request request);
}
