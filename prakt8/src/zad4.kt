fun main(){
    try {
        val ott: cake = cake(
            "Дрожжевое",
            "Сливочный",
            5.0,
            3100,
            5100.0
        )
        ott.otv()
        ott.input()
    }catch (e:Exception){
        println("Неверный ввод")}
}