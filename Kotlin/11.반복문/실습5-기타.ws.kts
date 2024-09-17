val numbers = intArrayOf(5,10,15)

println("---------------------------")
// 값만 필요할 때
for(number in numbers){ // foreach 와 동일
    println(number)
}

println("---------------------------")
// 값과 인덱스 모두 필요할 때
for((index, value) in numbers.withIndex()){ // foreachindexed 와 동일
    println(index )
    println(value)
}

println("---------------------------")
// 인덱스만 필요할 때
for(index in numbers.indices){
    println(index)
}
println("---------------------------")
// 본문에서 사용될 변수이름을 기본 제공으로 사용
numbers.forEachIndexed{ index , i ->

}
// 본문에서 사용될 변수이름을 변경해서 사용
numbers.forEachIndexed{ index , value ->

}