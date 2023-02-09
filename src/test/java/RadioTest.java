import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // Тесты радиостанций

    @Test
    public void selectCorrectStationTest () {   // Тестируем установку корректной радиостанции
        Radio radio = new Radio();
        radio.setStation(7);

        int expected = 7;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void selectNegativeStationTest () {   // Тестируем установку отрицательной радиостанции
        Radio radio = new Radio();
        radio.setStation(-2);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void selectAboveBorderStationTest () {   // Тестируем установку радиостанции за верхней границей
        Radio radio = new Radio();
        radio.setStation(14);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void selectBottomLineStationTest () {  // Тестируем установку радиостанции в пределах нижних граничных значений
        Radio radio = new Radio();
        radio.setStation(0);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void selectBottomLineStationTestTwo () {     // Тестируем установку радиостанции в пределах нижних граничных значений
        Radio radio = new Radio();
        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void selectBottomLineStationTestThree () {   // Тестируем установку радиостанции в пределах нижних граничных значений
        Radio radio = new Radio();
        radio.setStation(1);

        int expected = 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void selectUpperBoundStationTest () {   // Тестируем установку радиостанции в пределах верхних граничных значений
        Radio radio = new Radio();
        radio.setStation(9);

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void selectUpperBoundStationTestTwo () {   // Тестируем установку радиостанции в пределах верхних граничных значений
        Radio radio = new Radio();
        radio.setStation(8);

        int expected = 8;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void selectUpperBoundStationTestThree () {   // Тестируем установку радиостанции в пределах верхних граничных значений
        Radio radio = new Radio();
        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void correctSwitchNextStationTest () {   // Тестируем переключение радиостанции вперед
        Radio radio = new Radio();
        radio.setStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void bottomLineSwitchNextStationTest () {   // Тестируем переключение радиостанции вперед в нижней границе
        Radio radio = new Radio();
        radio.setStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void bottomLineSwitchNextStationTestTwo () {   // Тестируем переключение радиостанции вперед в нижней границе
        Radio radio = new Radio();
        radio.setStation(1);
        radio.nextStation();

        int expected = 2;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void upperBoundSwitchNextStationTest () {   // Тестируем переключение радиостанции вперед в верхней границе
        Radio radio = new Radio();
        radio.setStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void upperBoundSwitchNextStationTestTwo () {   // Тестируем переключение радиостанции вперед в верхней границе
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void correctSwitchPrevStationTest () {   // Тестируем переключение радиостанции назад
        Radio radio = new Radio();
        radio.setStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void bottomLineSwitchPrevStationTest () {   // Тестируем переключение радиостанции в нижней границе назад
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void bottomLineSwitchPrevStationTestTwo () {   // Тестируем переключение радиостанции в нижней границе назад
        Radio radio = new Radio();
        radio.setStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void upperBoundSwitchPrevStationTest () {   // Тестируем переключение радиостанции в верхней границе назад
        Radio radio = new Radio();
        radio.setStation(8);
        radio.prevStation();

        int expected = 7;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void upperBoundSwitchPrevStationTestTwo () {   // Тестируем переключение радиостанции в верхней границе назад
        Radio radio = new Radio();
        radio.setStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }


    // Тесты громкости

    @Test
    public void selectCorrectVolumeTest () {   // Тестируем установку корректной громкости
        Radio radio = new Radio();
        radio.setVolume(5);

        int expected = 5;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void selectNegativeVolumeTest () {   // Тестируем установку отрицательной громкости
        Radio radio = new Radio();
        radio.setVolume(-13);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void selectAboveBorderVolumeTest () {   // Тестируем установку громкости за верхней границей
        Radio radio = new Radio();
        radio.setVolume(130);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void selectBottomLineVolumeTest () {  // Тестируем установку громкости в пределах нижних граничных значений
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void selectBottomLineVolumeTestTwo () {  // Тестируем установку громкости в пределах нижних граничных значений
        Radio radio = new Radio();
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void selectBottomLineVolumeTestThree () {  // Тестируем установку громкости в пределах нижних граничных значений
        Radio radio = new Radio();
        radio.setVolume(1);

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void selectUpperBoundVolumeTest () {   // Тестируем установку громкости в пределах верхних граничных значений
        Radio radio = new Radio();
        radio.setVolume(99);

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void selectUpperBoundVolumeTestTwo () {   // Тестируем установку громкости в пределах верхних граничных значений
        Radio radio = new Radio();
        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void selectUpperBoundVolumeTestThree () {   // Тестируем установку громкости в пределах верхних граничных значений
        Radio radio = new Radio();
        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldCorrectIncreaseVolume () {   // Тестируем повышение громкости
        Radio radio = new Radio();
        radio.setVolume(6);
        radio.increaseVolume();

        int expected = 7;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
@Test
    public void shouldBottomLineIncreaseVolume () { // Тестируем повышение громкости в нижней границе
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
@Test
    public void shouldUpperBoundIncreaseVolume () {   // Тестируем повышение громкости в верхней границе
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCorrectDecreaseVolume () {   // Тестируем понижение громкости
        Radio radio = new Radio();
        radio.setVolume(6);
        radio.decreaseVolume();

        int expected = 5;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldBottomLineDecreaseVolume () {   // Тестируем понижение громкости в нижней границе
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldUpperBoundDecreaseVolume () { //   // Тестируем понижение громкости в верхней границе
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationCount () { //   // Тестируем понижение громкости в верхней границе
        Radio radio = new Radio(25);
        radio.setStation(12);

        int expected = 12;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

}
