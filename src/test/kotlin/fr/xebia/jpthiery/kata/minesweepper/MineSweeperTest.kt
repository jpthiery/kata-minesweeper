package fr.xebia.jpthiery.kata.minesweepper

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MineSweeperTest {

    @Test
    fun i_could_create_a_2x2_playground_without_mine() {
        val input = "2 2\n" +
                ". .\n" +
                ". .\n"
        val playGround = MineSweeper.process(input)

        assertThat(playGround).isEqualTo("Field #1:\n" +
                "00\n" +
                "00\n")
    }

    @Test
    fun i_could_create_a_3x3_playground_without_mine() {
        val input = "3 3\n" +
                ". . .\n" +
                ". . .\n" +
                ". . .\n"
        val playGround = MineSweeper.process(input)

        assertThat(playGround).isEqualTo("Field #1:\n" +
                "000\n" +
                "000\n" +
                "000\n")
    }

    @Test
    fun i_could_create_a_3x4_playground_without_mine() {
        val input = "3 4\n" +
                ". . . .\n" +
                ". . . .\n" +
                ". . . .\n"
        val playGround = MineSweeper.process(input)

        assertThat(playGround).isEqualTo("Field #1:\n" +
                "0000\n" +
                "0000\n" +
                "0000\n")
    }

    @Test
    fun i_could_create_a_1x1_playground_with_1_mine() {
        val input = "1 1\n" +
                "*\n"
        val playGround = MineSweeper.process(input)

        assertThat(playGround).isEqualTo("Field #1:\n" +
                "*\n")
    }

    @Test
    fun i_could_create_a_1x2_playground_with_1_mine() {
        val input = "1 2\n" +
                "* .\n"
        val playGround = MineSweeper.process(input)

        assertThat(playGround).isEqualTo("Field #1:\n" +
                "*1\n")
    }

    @Test
    fun i_could_create_a_3x5_playground_with_3_mines() {
        val input = "3 5\n" +
                "**...\n" +
                ".....\n" +
                ".*...\n"
        val playGround = MineSweeper.process(input)

        assertThat(playGround).isEqualTo("Field #1:\n" +
                "**100\n" +
                "33200\n" +
                "1*100\n")
    }

}