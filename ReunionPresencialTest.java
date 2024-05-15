import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReunionPresencialTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void crearInforme() throws IOException {
        Empleado E = new Empleado("69", "Kasuga Arakawa", "Ichiban", "dulcesichiban777@gmail.com", true);
        Date F = new Date();
        Instant HP = Instant.now();
        Duration DP = Duration.between(LocalTime.of(15, 10), LocalTime.of(18, 15));
        ReunionPresencial P = new ReunionPresencial(E, tipoReunion.MARKETING, F, HP, DP, "github.com");
        P.iniciar();
        P.finalizar();
        P.crearInforme();
    }
}
