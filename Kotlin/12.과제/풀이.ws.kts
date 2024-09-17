// 1번
fun printN (inputString : String, N : Int ) : Unit{
    for(value in 1..N){
        println(inputString)
    }
}
printN("더워뒤지겠네", 4)

// 2번
fun sumN (inputInt : Int ) : Int {
    var sum = 0
    for(value in 1..inputInt){
        sum += value
    }
    return sum
}
println(sumN(10))

// 3번
fun returnSevenSum():Int {
    var sum = 0
    for (value in 1..100){
        if(value%7==0){
            sum += value
        }
    }
    return sum
}
returnSevenSum()

// 4번
fun solve4 (inputInt : Int) : Unit{
    if(inputInt<100){
        inputInt++
        if(inputInt==100) break;
    }
}
