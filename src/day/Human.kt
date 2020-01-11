package day

import day.AbstractClass

class Human(name:String): AbstractClass(name = name) {
    override fun fun1(){
        var li = 1 .. 100
        for (i in li){
            println(i)
        }

        print("${name}你好！！")
    }
}