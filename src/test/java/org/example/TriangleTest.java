package org.example;


import ch.qos.logback.classic.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.MatcherAssert.assertThat;


public class TriangleTest {

    Triangle triangle = new Triangle();
    private static Logger logger = (Logger) LoggerFactory.getLogger(TriangleTest.class);

    @BeforeAll
    static void beforeAllTests() {
        logger.info("До тестирования");}

    @Test
    @DisplayName("Соответствие ожидаемому верному результату")
    void  complianceExpectedResult(){
        double a = triangle.squareTriangle(3,4,5);
        assertThat(a).as("Результат соответствует ожидаемому").isEqualTo(6);
    }

    @Test
    @DisplayName("Соответствие ожидаемому неверному результату")
    void ComplianceNotExpectedResult(){
        double a = triangle.squareTriangle(3,4,5);
        assertThat(a).as("Результат не соответствует ожидаемому").isNotEqualTo(12);
    }

    @Test
    @DisplayName("Проверка исключения при передаче параметров, не соответствующих треугольнику")
    void throwAnExceptionNotTriangle(){
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> triangle.squareTriangle(1,2,4));
        assertEquals("Это не треугольник", exception.getMessage());
    }
    @Test
    @DisplayName("Проверка исключения при передаче некорректных параметров")
    void throwAnExceptionNotCurrentArguments(){

        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> triangle.squareTriangle(0,-2,1));
        assertEquals("Введены некорректные данные", exception.getMessage());
    }


}