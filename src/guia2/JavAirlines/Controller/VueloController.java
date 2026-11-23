package guia2.JavAirlines.Controller;

import guia2.JavAirlines.Model.Usuario;
import guia2.JavAirlines.Model.Vuelo;
import guia2.JavAirlines.Model.VueloDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class VueloController {

    private final String usuarioActivo;
    private final VueloDAO vueloDAO;

    public VueloController() {
        this.usuarioActivo = "Operador";
        this.vueloDAO = new VueloDAO();
    }

    public VueloController(Usuario usuario) {
        if (usuario != null && usuario.getUsername() != null && !usuario.getUsername().isBlank()) {
            this.usuarioActivo = usuario.getUsername().trim();
        } else {
            this.usuarioActivo = "Operador";
        }
        this.vueloDAO = new VueloDAO();
    }

    public void iniciar() {
        boolean ejecutando = true;

        while (ejecutando) {
            String entradaOpcion = JOptionPane.showInputDialog(
                    null,
                    "=== MENÚ DE VUELOS (" + usuarioActivo + ") ===\n"
                    + "1. Agregar vuelo\n"
                    + "2. Ver vuelos\n"
                    + "3. Actualizar vuelo\n"
                    + "4. Eliminar vuelo\n"
                    + "5. Cerrar sesión\n\n"
                    + "Elige una opción:",
                    "JavAirlines",
                    JOptionPane.PLAIN_MESSAGE
            );

            if (entradaOpcion == null) {
                ejecutando = false;
                continue;
            }

            Integer opcion = parsearEntero(entradaOpcion, "Debes ingresar un número del 1 al 5.");
            if (opcion == null) {
                continue;
            }

            switch (opcion) {
                case 1 -> agregarVuelo();
                case 2 -> verVuelos();
                case 3 -> actualizarVuelo();
                case 4 -> eliminarVuelo();
                case 5 -> ejecutando = false;
                default -> JOptionPane.showMessageDialog(null, "Opción no válida. Elige un número del 1 al 5.");
            }
        }
    }

    private void agregarVuelo() {
        String origin = pedirTexto("Ingresa el origen del vuelo (origin):");
        if (origin == null) return;

        String destiny = pedirTexto("Ingresa el destino del vuelo (destiny):");
        if (destiny == null) return;

        Integer capability = pedirEnteroPositivo("Ingresa la capacidad del vuelo (capability, mayor a 0):");
        if (capability == null) return;

        String status = pedirTexto("Ingresa el estado del vuelo (status: Programado, Retrasado, Cancelado):");
        if (status == null) return;

        Vuelo nuevoVuelo = new Vuelo(destiny, capability, status, origin);
        boolean guardado = vueloDAO.agregar(nuevoVuelo);

        JOptionPane.showMessageDialog(
                null,
                guardado
                        ? "Vuelo guardado:\nOrigen: " + origin + " -> Destino: " + destiny
                        + "\nCapacidad: " + capability + " | Estado: " + status
                        : "No se pudo guardar el vuelo. Revisa la conexión a la base de datos."
        );
    }

    private void verVuelos() {
        List<Vuelo> vuelos = vueloDAO.verTodos();
        if (vuelos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay vuelos registrados.");
            return;
        }

        StringBuilder listado = new StringBuilder("=== VUELOS REGISTRADOS ===\n");
        for (Vuelo vuelo : vuelos) {
            listado.append("#").append(vuelo.getFlightId())
                   .append(" | ").append(vuelo.getOrigin())
                   .append(" -> ").append(vuelo.getDestiny())
                   .append(" | Cap: ").append(vuelo.getCapability())
                   .append(" | Estado: ").append(vuelo.getStatus())
                   .append("\n");
        }

        JOptionPane.showMessageDialog(null, listado.toString());
    }

    private void actualizarVuelo() {
        Integer flightId = pedirEnteroPositivo("Ingresa el ID del vuelo a actualizar (flightId):");
        if (flightId == null) return;

        String origin = pedirTexto("Ingresa el nuevo origen (origin):");
        if (origin == null) return;

        String destiny = pedirTexto("Ingresa el nuevo destino (destiny):");
        if (destiny == null) return;

        Integer capability = pedirEnteroPositivo("Ingresa la nueva capacidad (capability, mayor a 0):");
        if (capability == null) return;

        String status = pedirTexto("Ingresa el nuevo estado (status):");
        if (status == null) return;

        Vuelo vueloActualizado = new Vuelo(flightId, destiny, capability, status, origin);
        boolean actualizado = vueloDAO.actualizar(vueloActualizado);

        JOptionPane.showMessageDialog(
                null,
                actualizado
                        ? "Vuelo #" + flightId + " actualizado correctamente."
                        : "No se pudo actualizar el vuelo #" + flightId + " (revisa si el ID existe)."
        );
    }

    private void eliminarVuelo() {
        Integer flightId = pedirEnteroPositivo("Ingresa el ID del vuelo a eliminar (flightId):");
        if (flightId == null) return;

        int confirmacion = JOptionPane.showConfirmDialog(
                null,
                "¿Seguro que deseas eliminar el vuelo #" + flightId + "?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean eliminado = vueloDAO.eliminar(flightId);
            JOptionPane.showMessageDialog(
                    null,
                    eliminado
                            ? "Vuelo #" + flightId + " eliminado."
                            : "No se pudo eliminar el vuelo #" + flightId + " (revisa si el ID existe)."
            );
        }
    }

    private String pedirTexto(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) return null;
            String limpio = entrada.trim();
            if (limpio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Este campo no puede quedar vacío.");
                continue;
            }
            return limpio;
        }
    }

    private Integer pedirEnteroPositivo(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            if (entrada == null) return null;
            Integer numero = parsearEntero(entrada, "Ingresa un número entero válido.");
            if (numero != null) {
                if (numero <= 0) {
                    JOptionPane.showMessageDialog(null, "El número debe ser mayor que cero.");
                    continue;
                }
                return numero;
            }
        }
    }

    private Integer parsearEntero(String texto, String mensajeError) {
        String limpio = texto.trim();
        if (limpio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes escribir un número.");
            return null;
        }
        try {
            return Integer.parseInt(limpio);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, mensajeError);
            return null;
        }
    }
}