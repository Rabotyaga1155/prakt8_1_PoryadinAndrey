class cake(var dough: String, var cream: String, var weight: Double,var kkal: Int,var price: Double) {
    fun otv(){
        println("Тесто - $dough \n Крем - $cream \n Вес - $weight \n Калорийность - $kkal \n Цена - $price")
    }
    fun input(){
        println("Введите тесто")
        dough = readln()
        println("Введите Крем")
        cream = readln()
        println("Введите Вес")
        weight = readLine()!!.toDouble()
        println("Введите Калорийность")
        kkal = readln()!!.toInt()
        println("Введите цена")
        price = readln()!!.toDouble()


    }
}