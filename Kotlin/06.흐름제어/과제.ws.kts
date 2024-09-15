
//// 1. 변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않으면 false가 되는 변수 c를 선언한다.
//// 단, 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안된다.
val A : Int = 10
val B : Int = 10
val C : Boolean = if(A==B) true else false
println(C)
//
//// 2. 정수형 변수 A를 선언하고, 변수 B를 선언 한다 이때 변수 B는 A의 두배가 되어야 한다.
val AA : Int = 10
val BB : Int = A*2
println(B)

// 3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오
//    (90점 이상 A학점, 80~89점은 B학점, 70~79점은 C학점, 그렇지 않으면 F)
val score : Int = 70
fun returnGrade(score : Int) : Char {
    val grade : Char
    if(score>=90) {
        grade = 'A'
    }else if(score >= 80) {
        grade = 'B'
    }else if(score >= 70) {
        grade = 'C'
    }else {
        grade = 'F'
    }
    return grade
}
println(returnGrade(score))
fun checkGrade(score : Int) : String {
    when(score){
        in 90..100 -> return "A학점"
        in 80..90 -> return "B학점"
        in 70..80 -> return "C학점"
        else -> return "F학점"
    }
}


val result: String  = checkGrade(score)
println(result)

// 4. 학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수점(점수)를 반환하는 함수를 만드시오
//    (시험 문제는 총 20문제이고 만점은 100점)
fun scoreReturn(cnt : Int) : Int {
    val score : Int = cnt * 5
    return score
}
println(scoreReturn(5))

// 5. nullable 정수형 두개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다.
//    이때 인수중에 null이 있으면 0으로 취급하여 합을 구한다.
fun plusReturn(A : Int?, B : Int?) : Int {
    if (A == null) {
        return B + 0
    }
    if (B == null) {
        return A + 0
    }
    if (A==null && B==null) {
        return 0
    }
}
// 함수안에서 똑같은 이름을 갖고 있는 다른 두 변수가 있음면 안된다