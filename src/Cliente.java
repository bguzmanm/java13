public class Cliente {
  private Notificador notificador;

  public Cliente(Notificador notificador) {
    this.notificador = notificador;
  }

  public void notificarCliente(){
    notificador.enviarMensaje("Hola cliente!");
  }
}
