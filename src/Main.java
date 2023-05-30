public class Main {
  public static void main(String[] args) {

    Cliente cliente1 = new Cliente(new CorreoElectronico());

    cliente1.notificarCliente();
    Cliente cliente2 = new Cliente(new SMS());

    cliente2.notificarCliente();

  }
}