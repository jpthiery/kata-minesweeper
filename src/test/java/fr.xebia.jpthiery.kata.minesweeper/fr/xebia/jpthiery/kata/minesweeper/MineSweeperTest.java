package fr.xebia.jpthiery.kata.minesweeper;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MineSweeperTest {

    @Test
    public void not_null() {

        //  Given

        var input = ". .";
        var minesweeper = new MineSweeper();

        //  When

        var result = minesweeper.feed(input);

        //  Then

        assertThat(result).isNotNull();

    }

    @Test
    public void retrieve_number_of_rows() {
        //  Given
        var input = ". .";

        var minesweeper = new MineSweeper();

        //when
        var result = minesweeper.feed(input);

        //Then
        assertThat(result.numberRows()).isEqualTo(1);

    }

    @Test
    public void retrieve_correct_number_of_rows() {
        //  Given
        var input = ". .\n" +
                ". .";

        var minesweeper = new MineSweeper();

        //when
        var result = minesweeper.feed(input);

        //Then
        assertThat(result.numberRows()).isEqualTo(2);

    }

    @Test
    public void retrieve_one_mine() {
        //  Given
        var input = "* .";

        var minesweeper = new MineSweeper();

        //when
        var result = minesweeper.feed(input);

        //Then
        assertThat(result.hasMine()).isTrue();

    }

    @Test
    public void retrieve_3mines_2_rows() {
        //  Given
        var input = "* .\n" +
                "* *";

        var minesweeper = new MineSweeper();

        //when
        var result = minesweeper.feed(input);

        //Then
        assertThat(result.numberMines()).isEqualTo(3);

    }

    @Test
    public void retrieve_2mines_2_rows() {
        //  Given
        var input = "* .\n" +
                ". *";

        var minesweeper = new MineSweeper();

        //when
        var result = minesweeper.feed(input);

        //Then
        assertThat(result.numberMines()).isEqualTo(2);

    }


}