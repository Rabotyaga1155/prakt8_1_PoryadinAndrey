class car(var brand: String,var power: Int,var price: Double) {
    fun otv(){
        println("Марка автомобиля - $brand \n Мощность автомобиля - $power \n Стоимость автомобиля - $price")
    }
    fun input(){
        println("Введите марку автомобиля")
        brand = readln()
        println("Введите мощность автомобиля")
        power = readLine()!!.toInt()
        println("Введите стоимость автомобиля")
        price = readLine()!!.toDouble()
    }
}