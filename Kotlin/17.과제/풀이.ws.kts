class Calculator1 {
    var result : Int = 0
        set(value) {
            field = value
            println("중간 계산 값 : $field")
        }
    fun sum(inputNumber : Int){
        result += inputNumber
    }
    fun minus(inputNumber : Int){
        result -= inputNumber
    }
    fun muliply(inputNumber : Int){
        result *= inputNumber
    }
    fun devide(inputNumber : Int){
        result /= inputNumber
    }
}

val calculator1 = Calculator1()
calculator1.sum(10)
calculator1.devide(2)
println(calculator1.result)
calculator1.muliply(3)



class Calculator2 constructor(val initialValue : Int = 0){
    val result : Int

    init {
        this.result = initialValue
    }

    fun calculator(function: Char, inputNumber : Int){
        if(function=='+'){
            println("+ : $result + $inputNumber = "+ (result+inputNumber))
        }else if(function=='-'){
            println("- : $result - $inputNumber = " + (result - inputNumber))
        }else if(function=='*'){
            println("* : $result * $inputNumber = " + (result * inputNumber))
        }else if(function=='/'){
            println("/ : $result / $inputNumber = " + (result / inputNumber))
        }else{
            println("잘못된 연산 입니다.")
        }

    }
}

val calculator2 = Calculator2(10)
calculator2.calculator('+', 10)
calculator2.calculator('/', 20)
calculator2.calculator('-', 100)


class Calculater3 {
    var result: Int = 0

    fun calcualte(operaters: List<Char>, inputNumbers: List<Int>) {
        operaters.forEachIndexed { index, operater ->
            this._calculate(operater, inputNumbers[index])
        }
    }


    fun _calculate(function: Char, inputNumber: Int) {
        when (function) {
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *= inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못된 연산 입니다")
        }
    }
}

val calculater3 = Calculater3()
calculater3.calcualte(listOf<Char>('+', '-'), listOf<Int>(10, 20))
println(calculater3.result)


//['+', '-', '*'], [10, 20, 30]

//[('+', 50) ('-', 60)]
//[(Any, Any) (Any, Any)] - > 실제
//[(Char, Int) (Char, Int)] -> 기대
// Any -> Char, Int 으로 변환