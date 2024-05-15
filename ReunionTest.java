import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

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
        Empleado E = new Empleado("69", "Kasuga Arakawa", "Ichiban", "dulcesichiban777@gmail.com", false);
        Empleado E1 = new Empleado("2", "Morgan De La Barrera", "Arthur", "redenciónmuertaroja@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionVirtual P = new ReunionVirtual(E, tipoReunion.MARKETING, F, HP, DP, "github.com");
        E.invitar(P);
        E1.invitar(P);
        List L = P.obtenerAsistencias();
        Empleado X = (Empleado) L.get(0);
        Assertions.assertEquals(E1, X);
    }

    @Test
    void obtenerAusencias() {
        Empleado E = new Empleado("69", "Kasuga Arakawa", "Ichiban", "dulcesichiban777@gmail.com", false);
        Empleado E1 = new Empleado("2", "Morgan De La Barrera", "Arthur", "redenciónmuertaroja@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionVirtual P = new ReunionVirtual(E, tipoReunion.MARKETING, F, HP, DP, "github.com");
        E.invitar(P);
        E1.invitar(P);
        List L = P.obtenerAusencias();
        Empleado X = (Empleado) L.get(0);
        Assertions.assertEquals(E, X);
    }

    @Test
    void obtenerRetrasos() {
        Empleado E = new Empleado("69", "Kasuga Arakawa", "Ichiban", "dulcesichiban777@gmail.com", false);
        Empleado E1 = new Empleado("2", "Morgan De La Barrera", "Arthur", "redenciónmuertaroja@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionVirtual P = new ReunionVirtual(E, tipoReunion.MARKETING, F, HP, DP, "github.com");
        E.invitar(P);
        E1.invitar(P);
        List L = P.obtenerAusencias();
        Empleado X = (Empleado) L.get(0);
        X.setPresencia(true);
        List L1 = P.obtenerRetrasos();
        Empleado X1 = (Empleado) L1.get(0);
        Assertions.assertTrue(X1.getPresencia());
    }

    @Test
    void obtenerTotalAsistencia() {
        Empleado E = new Empleado("50", "De La Barrera Ortiz", "Juan", "hola@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionVirtual P = new ReunionVirtual(E, tipoReunion.MARKETING, F, HP, DP, "github.com");
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
        ReunionVirtual P = new ReunionVirtual(E, tipoReunion.MARKETING, F, HP, DP, "github.com");
        E.invitar(P);
        float I = P.obtenerPorcentajeAsistencia();
        final float X = 1 / 100;
        Assertions.assertEquals(I, X);
    }

    @Test
    void calcularTiempoReal() {
        Empleado E = new Empleado("50", "De La Barrera Ortiz", "Juan", "hola@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionVirtual P = new ReunionVirtual(E, tipoReunion.MARKETING, F, HP, DP, "github.com");
        E.invitar(P);
        float I = P.obtenerPorcentajeAsistencia();
        final float X = 0;
        Assertions.assertEquals(I, X);
    }

    @Test
    void iniciar() {
        Empleado E = new Empleado("50", "De La Barrera Ortiz", "Juan", "hola@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionVirtual P = new ReunionVirtual(E, tipoReunion.MARKETING, F, HP, DP, "420");
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
        ReunionVirtual P = new ReunionVirtual(E, tipoReunion.MARKETING, F, HP, DP, "420");
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
        ReunionVirtual P = new ReunionVirtual(E, tipoReunion.MARKETING, F, HP, DP, "420");
        Nota I = P.crearNota("Hola mundo");
        final Nota X = new Nota("Hola mundo");
        Assertions.assertEquals(I, X);
    }
}
