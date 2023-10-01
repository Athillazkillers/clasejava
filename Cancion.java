public class Cancion {
    private String titulo;
    private String artista;
    private int duracion; // Duración en segundos

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}

class Principal {
    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("Imagine", "John Lennon", 183);

        // Llamar a los métodos getter
        System.out.println("Título: " + cancion1.getTitulo());
        System.out.println("Artista: " + cancion1.getArtista());
        System.out.println("Duración: " + cancion1.getDuracion() + " segundos");


        cancion1.setTitulo("Let It Be");
        cancion1.setArtista("The Beatles");
        cancion1.setDuracion(243);


        System.out.println("Título: " + cancion1.getTitulo());
        System.out.println("Artista: " + cancion1.getArtista());
        System.out.println("Duración: " + cancion1.getDuracion() + " segundos");
    }
}
