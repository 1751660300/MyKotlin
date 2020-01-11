fun main() {
    var result = 0;
    add(100000,result)
//    print(result)
    var s="1230"
    var i:Int
    i = s.toInt()
}

tailrec fun add(num:Int, result:Int):Int{
    if (num == 0){
        print(result)
        return 0;
    }
    else{
//        println(result)
        return add(num-1,result+num)
    }
}