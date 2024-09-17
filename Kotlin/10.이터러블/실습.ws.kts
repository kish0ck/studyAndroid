// Range
val range1 = 1..10
val range2 = 1 until 10 // -> 1..9
println(range1)
println(range2)

val range3 = 'A'..'Z'
println(range3)

//val range4 = 'ㄱ'..'ㅎ'
//range4.forEach{
//    println(it)
//}

// Progression
val range4 = 1..10 step 2
// (1,2,3,4,5,6,7,8,9,10) -> (1,3,5,7,9)
// (1,2,3,4,5,6,7,8,9) -> (1,3,5,7,9)
println(range4)

val range5 = 10 downTo 1 step 2
println(range5)

// STEP
//  - 특징 : step에 값과 상관없이 첫번째는 무조건 index 0 부터 시작한다



// Collection
val collection1 = listOf<Int>(1,2,3,4,5)
