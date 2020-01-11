package a2委托和代理

class SmallHeadFather:WashBowl by BigHeadSon {
    override fun washing() {
        BigHeadSon.washing()
        println("让儿子洗碗，给她一块钱，我赚九块钱，哈哈哈哈")
    }
}