package view

object InputView {
    private const val HEADER_READ_AMOUNT = "구입금액을 입력해 주세요."
    private const val HEADER_READ_WINNING_NUMBERS = "지난 주 당첨 번호를 입력해 주세요."

    fun readAmount(): String {
        println(HEADER_READ_AMOUNT)
        return readln()
    }

    fun readWinningNumbers(): String {
        println(HEADER_READ_WINNING_NUMBERS)
        return readln()
    }
}
