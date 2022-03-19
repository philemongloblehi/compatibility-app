import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LauncherTest {

    @Test
    public void testTousLesCaracteres() {
        List<String> listCaracterePhilemon = List.of("Java", "PHP", "C++", "Python", "Angular");
        List<String> listCaractereAnge = List.of("Java", "PHP", "C++", "Python", "Angular");

        List<String> listCaractereCommuns = Launcher.getCaractereCommuns(listCaracterePhilemon, listCaractereAnge);

        assertThat(listCaractereCommuns).hasSize(5);
        assertThat(listCaractereCommuns).contains("Java", "PHP", "C++", "Python", "Angular");
        System.out.println(listCaractereCommuns);
    }

    @Test
    public void testDeuxCaracteres() {
        List<String> listCaracterePhilemon = List.of("Java", "PHP", "GO", "JavaScript", "Angular");
        List<String> listCaractereAnge = List.of("Java", "PHP", "C++", "Python", "ReactJS");

        List<String> listCaractereCommuns = Launcher.getCaractereCommuns(listCaracterePhilemon, listCaractereAnge);

        assertThat(listCaractereCommuns).hasSize(2);
        assertThat(listCaractereCommuns).contains("Java", "PHP");
        System.out.println(listCaractereCommuns);
    }

    @Test
    public void testAucunCaracteres() {
        List<String> listCaracterePhilemon = List.of("Java", "PHP", "GO", "JavaScript", "Angular");
        List<String> listCaractereAnge = List.of("Visual Basic", "Dart", "C++", "Python", "ReactJS");

        List<String> listCaractereCommuns = Launcher.getCaractereCommuns(listCaracterePhilemon, listCaractereAnge);

        assertThat(listCaractereCommuns).isEmpty();
        System.out.println(listCaractereCommuns);
    }
}
