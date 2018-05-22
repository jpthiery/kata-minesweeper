package fr.xebia.jpthiery.kata.minesweepper

import org.junit.jupiter.api.Test
import  org.assertj.core.api.Assertions.*

internal class MineSweeperTest {

    @Test
    fun say_hello() {
        val swipper = MineSweeper()
        val result = swipper.hello()
        assertThat(result).isEqualTo("Hello")
    }

}