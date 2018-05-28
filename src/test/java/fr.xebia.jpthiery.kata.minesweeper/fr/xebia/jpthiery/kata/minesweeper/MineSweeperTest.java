package fr.xebia.jpthiery.kata.minesweeper;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MineSweeperTest {

    @Test
    public void say_hello_works_fine() {
        var result = MineSweeper.sayHello();
        Assertions.assertThat(result).as("say Hello").isEqualTo("Hello");
    }

}