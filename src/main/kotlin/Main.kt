fun main(args: Array<String>) {
    val secondCount = 12350

    println(agoToText(secondCount))


}
fun agoToText(secondCount: Int): String {
    var ans =""
    when (secondCount){
        in 1..60 -> ans = "был(а) в сети только что"
        in 1 .. 60*60 -> ans = minuteDeclination(secondCount)
        in 60*60+1..24*60*60  -> ans = hourDelination(secondCount)
        in 24*60*60+1..48*60*60 -> ans = "был(а) в сети вчера"
        in 48*60*60+1..72*60*60 -> ans = "был(а) в сети позавчера"
        else -> ans = "был(а) в сети давно"
    }
    return ans
}

fun hourDelination(secondCount: Int): String {
    val hour = secondCount / 60 / 60
    var ans = "неизвестно"
//    when(hour){
//        (hour % 10 == 1 && hour % 100 != 11) -> ans = "был(а) в сети $hour час назад"
//        (hour % 10 == 5  || hour % 100 == 11) -> ans = "был(а) в сети $hour часов назад"
//        else -> ans = "был(а) в сети $hour часа назад"
//    }
    if (hour % 10 == 1 && hour % 100 != 11){
        ans = "был(а) в сети $hour час назад"
    }else if (hour % 10 == 5  || hour % 100 == 11){
        ans = "был(а) в сети $hour часов назад"
    }else{
        ans = "был(а) в сети $hour часа назад"
    }
    return ans
}

fun minuteDeclination(secondCount: Int): String {
    val min = secondCount / 60
    var ans = "неизвестно"
//    when(min){
//        (min % 10 == 1 && min % 100 != 11) -> ans = "был(а) в сети $min минуту назад"
//        (min % 10 == 5  || min % 100 == 11) -> ans = "был(а) в сети $min минут назад"
//        else -> ans = "был(а) в сети $min минуты назад"
//    }
    if (min % 10 == 1 && min % 100 != 11){

    }else if (min % 10 == 2 || min % 10 == 8){ //min % 10 == 5  || min % 100 == 11 || min % 10 == 0
        ans = "был(а) в сети $min минут назад"
    }
    else{
        ans = "был(а) в сети $min минуты назад"
    }
    return ans
}
