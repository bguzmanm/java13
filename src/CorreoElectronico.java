public class CorreoElectronico implements Notificador {
  @Override
  public void enviarMensaje(String mensaje) {
    System.out.println("Enviando correo electrónico: body -> " + mensaje);
  }
}
