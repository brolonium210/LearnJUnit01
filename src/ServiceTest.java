import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceTest {
@Test
     void getNametest() {
    Service service = new Service("Graham");
    String result = service.getName();
    Assertions.assertEquals("Graham", result);
    }
}