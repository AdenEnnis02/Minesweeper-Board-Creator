package minesweeper
import kotlin.random.Random

fun main() {
    println("How many bombs would you like on the board? ")
    var bombCount = readln().toInt()
    val bomb = 'X'
    val c = '.'
    val emptyBoard = mutableListOf(
        mutableListOf<Char>('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        mutableListOf<Char>('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        mutableListOf<Char>('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        mutableListOf<Char>('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        mutableListOf<Char>('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        mutableListOf<Char>('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        mutableListOf<Char>('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        mutableListOf<Char>('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        mutableListOf<Char>('.', '.', '.', '.', '.', '.', '.', '.', '.'),
    )

    for (i in 0 until bombCount) {
        var randomBombX = Random.nextInt(0, 8)
        var randomBombY = Random.nextInt(0, 8)
        if (emptyBoard[randomBombX][randomBombY] == bomb) {
            bombCount += 1
        }
        else {
            emptyBoard[randomBombX][randomBombY] = bomb
        }
    }
    class BoardPrinter{
        fun printboard(){
            for (i in 0 until emptyBoard.size - 1) {
                print("\n")
                for (j in 0 until emptyBoard[i].size - 1) {
                    print(emptyBoard[i][j])
                }
            }
        }
    }
    val printer = BoardPrinter()
    printer.printboard()

}
