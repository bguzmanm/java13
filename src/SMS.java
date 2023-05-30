public class SMS implements Notificador {
  @Override
  public void enviarMensaje(String mensaje) {
    System.out.println("Enviando un SMS con el body -> " + mensaje);
  }
}
