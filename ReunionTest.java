import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReunionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void obtenerAsistencias() {
    }

    @Test
    void obtenerAusencias() {
    }

    @Test
    void obtenerRetrasos() {
    }

    @Test
    void obtenerTotalAsistencia() {
        Empleado E = new Empleado("50", "De La Barrera Ortiz", "Juan", "hola@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionPresencial P = new ReunionPresencial(E, tipoReunion.MARKETING, F, HP, DP, "420");
        E.invitar(P);
        int I = P.obtenerTotalAsistencia();
        final int X = 1;
        Assertions.assertEquals(I, X);
    }

    @Test
    void obtenerPorcentajeAsistencia() {
        Empleado E = new Empleado("50", "De La Barrera Ortiz", "Juan", "hola@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionPresencial P = new ReunionPresencial(E, tipoReunion.MARKETING, F, HP, DP, "420");
        E.invitar(P);
        float I = P.obtenerPorcentajeAsistencia();
        final int X = 1;
        Assertions.assertEquals(I, X);
    }

    @Test
    void calcularTiempoReal() {
    }

    @Test
    void iniciar() {
        Empleado E = new Empleado("50", "De La Barrera Ortiz", "Juan", "hola@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionPresencial P = new ReunionPresencial(E, tipoReunion.MARKETING, F, HP, DP, "420");
        P.iniciar();
        Instant I = P.getHoraInicio();
        final Instant X = P.getHoraInicio();
        Assertions.assertEquals(I, X);
    }

    @Test
    void finalizar() {
        Empleado E = new Empleado("50", "De La Barrera Ortiz", "Juan", "hola@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionPresencial P = new ReunionPresencial(E, tipoReunion.MARKETING, F, HP, DP, "420");
        P.finalizar();
        Instant I = P.getHoraFin();
        final Instant X = P.getHoraFin();
        Assertions.assertEquals(I, X);
    }

    @Test
    void crearNota() {
        Empleado E = new Empleado("50", "De La Barrera Ortiz", "Juan", "hola@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionPresencial P = new ReunionPresencial(E, tipoReunion.MARKETING, F, HP, DP, "420");
        Nota I = P.crearNota("Hola mundo");
        final Nota X = new Nota("Hola mundo");
        Assertions.assertEquals(I, X);
    }
}
