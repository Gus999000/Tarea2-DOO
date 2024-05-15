import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void invitar() {
        Empleado E = new Empleado("25", "De La Barrera Ortiz", "Juan", "hola@gmail.com", true);
        Empleado E1 = new Empleado("55", "Miranda Ortiz", "Franco", "chao@gmail.com", false);
        Empleado E2 = new Empleado("69", "Cartes Ortiz", "Patricio", "ortiz@gmail.com", true);
        Departamento D = new Departamento("Recursos humanos");
        D.addMiembros(E);
        D.addMiembros(E1);
        D.addMiembros(E2);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionPresencial P = new ReunionPresencial(E, tipoReunion.MARKETING, F, HP, DP, "420");
        D.invitar(P);
        int I = P.obtenerTotalAsistencia();
        final int X = 2;
        Assertions.assertEquals(I, X);
    }
}
