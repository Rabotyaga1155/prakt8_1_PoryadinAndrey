fun main(){
    try {
        val ott: car = car(
            "Lada",
            410,
            610.900
        )
        ott.otv()
        ott.input()
    }catch (e:Exception){
        println("Неверный ввод")}
}