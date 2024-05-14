import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void invitar() {
        Empleado E = new Empleado("50", "De La Barrera Ortiz", "Juan", "hola@gmail.com", true);
        Empleado E1 = new Empleado("55", "González Villagra", "Franco", "chao@gmail.com", false);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionPresencial P = new ReunionPresencial(E, tipoReunion.MARKETING, F, HP, DP, "420");
        E.invitar(P);
        E1.invitar(P);
        int I = P.obtenerTotalAsistencia();
        final int X = 1;
        Assertions.assertEquals(I, X);
    }
}
