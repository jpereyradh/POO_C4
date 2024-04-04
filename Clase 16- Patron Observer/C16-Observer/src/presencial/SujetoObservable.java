package presencial;

public interface SujetoObservable {
    void agregarSeguidor(SujetoObservador sujetoObservador);
    void eliminarSujeto(SujetoObservador sujetoObservador);
    void notificar(SujetoObservador sujetoObservador, String mensaje);
    String subirFoto();
}
