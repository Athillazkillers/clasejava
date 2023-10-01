public class Clase_Java {
    public class esudiantes {
        private String nombre;
        private int edad;
        private double promedio;

        public esudiantes(String nombre, int edad, double promedio) {
            this.nombre = nombre;
            this.edad = edad;
            this.promedio = promedio;
        }

        public String getNombre() {
            return this.nombre;
        }

        public int getEdad() {
            return this.edad;
        }

        public double getPromedio() {
            return this.promedio;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setPromedio(double promedio) {
            this.promedio = promedio;
        }
    }
}