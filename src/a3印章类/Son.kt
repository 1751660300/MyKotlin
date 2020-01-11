package a3印章类

sealed class Son {  //使用场景：子类有限
    fun say(){
        print("hello")
    }

    class Son1 : Son()
    class Son2 : Son()
}