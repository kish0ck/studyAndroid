// getter/ setter
//class Book(){
//    var title : String = "모름"
////        get() {
////            println("getter")
////            return "책제목"
////        }
//        get() {
//            println("getter")
//            return field
//        }
//        set(value) {
//            println("setter")
//            field = value
//        }
//
//}
//
//val book = Book()
//println(book.title)
//book.title = "제목 변경"
//println(book.title)



// lateinit
class MasterBook2(){
    lateinit var title : String


    fun nextPage(){
        if(::title.isInitialized == true) {
            println("페이지가 넘어간다")
        }else{
            println("초기화필요")
        }
    }
}

val book = MasterBook2() // MasterBook -> 거푸집 book -> 객체, 찍어낸거
book.title = "책이름"
println(book.nextPage())


val book2 = MasterBook2() // MasterBook -> 거푸집 book2 -> 객체, 찍어낸거
println(book2.nextPage())

