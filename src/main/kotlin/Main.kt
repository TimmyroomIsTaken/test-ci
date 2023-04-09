class Main() {
    enum class CalType {ADD, SUB, MUL, DIV}

    fun calculate(type: CalType, a: Int, b: Int): Int {
        return when(type) {
            CalType.ADD -> a + b
            CalType.SUB -> a - b
            CalType.MUL -> a * b
            CalType.DIV -> a / b
        }
    }
}