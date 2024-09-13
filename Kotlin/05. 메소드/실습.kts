var number100 : Int = 100


// 함수를 선언하는 방법
fun plusNumbers(first_num: Int, second_num : Int) : Int {
    val result: Int = first_num + second_num
    return result
}

// 함수를 사용(호출) 하는 방법
plusNumbers(first_num = 10, second_num = 20) // -> 30
println(plusNumbers(10,20)) // -> 30
val result : Int = plusNumbers(first_num = 5, second_num = 7)
println(result)

// 기본값이 있는 함수
fun plusNumbersWithDefalut(first_num : Int, second_num : Int = 10): Int {
    return first_num + second_num
}

val result2 : Int = plusNumbersWithDefalut(first_num = 10)
println("result2 : " + result2)
val result3 : Int = plusNumbersWithDefalut(first_num = 10, second_num = 20)
println("result3 : " + result3)

// 반환값이 없는 함수를 선언하는 방법
fun plusNumberWithNoReturn(first_num : Int, second_num : Int) : Unit{
    val result : Int = first_num + second_num
    println(result)
}
plusNumberWithNoReturn(100,200)

// Unit 을 생략해도 된다
fun plusNumberWithNoReturn2(first_num : Int, second_num : Int) {
    val result : Int = first_num + second_num
    println(result)
}
plusNumberWithNoReturn2(100,300)

// return 만 적어야됨
fun plusNumberWithNoReturn3(first_num : Int, second_num : Int) : Unit{
    val result : Int = first_num + second_num
    println(result)
//    return Unit
    return
}
plusNumberWithNoReturn3(100,200)


// 함수선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum : Int, secondNum : Int) = firstNum + secondNum
val result10 : Int = shortPlusNumbers(firstNum = 1, secondNum = 100)
println(result10)
// 가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int): Unit {
    for (number in numbers) {
        println(number)
    } // numbers에 들어온 값들을 하나하나 돌면서 println을 진행한다
}
plusMultipleNumbers(1, 2, 3, 4, 5)

number100 = 200
println(number100)
