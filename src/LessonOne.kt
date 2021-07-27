import jdk.nashorn.internal.parser.Scanner
import kotlin.math.abs
var z = 0
val karta1 = CardOne()
val karta2 = CardTwo()
val karta3 = CardTree()
fun main() {do {
    val scan = java.util.Scanner(System.`in`)
    println("Введите пароль вашей карты")
    var kod: Int = scan.nextInt()
    if (kod == karta1.kodik){
        cartaOne()
    }else if (kod == karta2.kodik){
        cartaTwo()
    }else if (kod == karta3.kodik){
        cartaTree()
    }
    var i = 10
} while (i == 10)
}
fun cartaOne(){do {
    println("Введите проверка баланса(пб) или перевод денег(пд) или пополнение(п) или оплата(о) или соединение с оператором(сп), можете вписать сокраженную версию в скобках ")
    println("Если хотите поменять карту введите: поменять карту(пк)")
    val name = readLine()
    val proverkaBalanca = listOf("пб", "проверка баланса", "ПБ", "Проверка Баланса")
    val perevod = listOf("перевод денег", "пд", "ПД", "Перевод Денег")
    val popolnenie = listOf("пополнение", "Пополнение", "П", "п")
    val oplata = listOf("о", "оплата", "Оплата", "О")
    val soedinenie = listOf("соединение с оператором", "сп", "СП", "Соединение с Оператором")
    val pomenyat = listOf("поменять карту", "Поменять Карту", "пк", "ПК")
    for (i in proverkaBalanca)
        if (i == name) {
            println("Вы ввели: Проверка баланса")
            karta1.proverka()
        }
    for (i in perevod)
        if (i == name) {
            println("Вы ввели: перевод денег")
            karta1.perevod()
        }
    for (i in popolnenie)
        if (i == name) {
            println("Вы ввели: Пополнение")
            karta1.popolnenie()
        }
    for (i in oplata)
        if (i == name) {
            println("Вы ввели: Оплата")
            karta1.oplata()
        }
    for (i in soedinenie)
        if (i == name) {
            println("Вы ввели: Соединение с оператором")
            karta1.soedinenie()
        }
    for (i in pomenyat)
        if (i == name) {
            z = 10
        }
}
    while (z!=10)

}
fun cartaTwo(){do {
    println("Введите проверка баланса(пб) или перевод денег(пд) или пополнение(п) или оплата(о) или соединение с оператором(сп), можете вписать сокраженную версию в скобках ")
    println("Если хотите поменять карту введите: поменять карту(пк)")
    val name = readLine()
    val proverkaBalanca = listOf("пб", "проверка баланса", "ПБ", "Проверка Баланса")
    val perevod = listOf("перевод денег", "пд", "ПД", "Перевод Денег")
    val popolnenie = listOf("пополнение", "Пополнение", "П", "п")
    val oplata = listOf("о", "оплата", "Оплата", "О")
    val soedinenie = listOf("соединение с оператором", "сп", "СП", "Соединение с Оператором")
    val pomenyat = listOf("поменять карту", "Поменять Карту", "пк", "ПК")
    for (i in proverkaBalanca)
        if (i == name) {
            println("Вы ввели: Проверка баланса")
            karta2.proverka()
        }
    for (i in perevod)
        if (i == name) {
            println("Вы ввели: перевод денег")
            karta2.perevod()
        }
    for (i in popolnenie)
        if (i == name) {
            println("Вы ввели: Пополнение")
            karta2.popolnenie()
        }
    for (i in oplata)
        if (i == name) {
            println("Вы ввели: Оплата")
            karta2.oplata()
        }
    for (i in soedinenie)
        if (i == name) {
            println("Вы ввели: Соединение с оператором")
            karta2.soedinenie()
        }
    for (i in pomenyat)
        if (i == name) {
            z = 20
        }
}
    while (z!=20)
}
fun cartaTree(){do {
    println("Введите проверка баланса(пб) или перевод денег(пд) или пополнение(п) или оплата(о) или соединение с оператором(сп), можете вписать сокраженную версию в скобках ")
    println("Если хотите поменять карту введите: поменять карту(пк)")
    val name = readLine()
    val proverkaBalanca = listOf("пб", "проверка баланса", "ПБ", "Проверка Баланса")
    val perevod = listOf("перевод денег", "пд", "ПД", "Перевод Денег")
    val popolnenie = listOf("пополнение", "Пополнение", "П", "п")
    val oplata = listOf("о", "оплата", "Оплата", "О")
    val soedinenie = listOf("соединение с оператором", "со", "СО", "Соединение с Оператором")
    val pomenyat = listOf("поменять карту", "Поменять Карту", "пк", "ПК")
    for (i in proverkaBalanca)
        if (i == name) {
            println("Вы ввели: Проверка баланса")
            karta3.proverka()
        }
    for (i in perevod)
        if (i == name) {
            println("Вы ввели: перевод денег")
            karta3.perevod()
        }
    for (i in popolnenie)
        if (i == name) {
            println("Вы ввели: Пополнение")
            karta3.popolnenie()
        }
    for (i in oplata)
        if (i == name) {
            println("Вы ввели: Оплата")
            karta3.oplata()
        }
    for (i in soedinenie)
        if (i == name) {
            println("Вы ввели: Соединение с оператором")
            karta3.soedinenie()
        }
    for (i in pomenyat)
        if (i == name) {
            z = 30
        }
    }
    while (z!=30)
}
abstract class kartochka{
    abstract var balance:Int
    abstract fun proverka()
    abstract fun perevod()
    abstract fun popolnenie()
    abstract fun oplata()
    abstract fun soedinenie()
}
class CardOne():kartochka() {
    val kodik:Int = 1234
    override var balance: Int = 200
    override fun proverka() {
        println("Ваш баланс = $balance")
    }

    override fun oplata() {
        val reader = java.util.Scanner(System.`in`)
        println("Какую сумму вы хотите снять")
        var integer: Int = reader.nextInt()
        balance = balance - integer
        println("Вы сняли: $integer Ваш баланс: $balance")

    }

    override fun perevod() {
        val reader = java.util.Scanner(System.`in`)
        println("Какую сумму вы хотите перевести")
        var denga: Int = reader.nextInt()
        balance = balance - denga
        println("Вы перевели: $denga Ваш баланс: $balance")
    }

    override fun popolnenie() {
        val reader = java.util.Scanner(System.`in`)
        println("На какую сумму вы хотите пополнить счёт")
        var vvod: Int = reader.nextInt()
        balance = balance + vvod
        println("Вы пополнили на: $vvod Ваш баланс: $balance")
    }

    override fun soedinenie() {
        println("Соединяем с оператором")
    }
}
class CardTwo():kartochka(){
    val kodik:Int = 4321
    override var balance: Int = 500
    override fun proverka() {
        println("Ваш баланс = $balance")
    }

    override fun oplata() {
        val reader = java.util.Scanner(System.`in`)
        println("Какую сумму вы хотите снять")
        var integer: Int = reader.nextInt()
        balance = balance - integer
        println("Вы сняли: $integer Ваш баланс: $balance")

    }

    override fun perevod() {
        val reader = java.util.Scanner(System.`in`)
        println("Какую сумму вы хотите перевести")
        var denga: Int = reader.nextInt()
        balance = balance - denga
        println("Вы перевели: $denga Ваш баланс: $balance")
    }

    override fun popolnenie() {
        val reader = java.util.Scanner(System.`in`)
        println("На какую сумму вы хотите пополнить счёт")
        var vvod: Int = reader.nextInt()
        balance = balance + vvod
        println("Вы пополнили на: $vvod Ваш баланс: $balance")
    }

    override fun soedinenie() {
        println("Соединяем с оператором")
    }
}

class CardTree():kartochka(){
    val kodik:Int = 3214
    override var balance: Int = 1500
    override fun proverka() {
        println("Ваш баланс = $balance")
    }

    override fun oplata() {
        val reader = java.util.Scanner(System.`in`)
        println("Какую сумму вы хотите снять")
        var integer: Int = reader.nextInt()
        balance = balance - integer
        println("Вы сняли: $integer Ваш баланс: $balance")

    }

    override fun perevod() {
        val reader = java.util.Scanner(System.`in`)
        println("Какую сумму вы хотите перевести")
        var denga: Int = reader.nextInt()
        balance = balance - denga
        println("Вы перевели: $denga Ваш баланс: $balance")
    }

    override fun popolnenie() {
        val reader = java.util.Scanner(System.`in`)
        println("На какую сумму вы хотите пополнить счёт")
        var vvod: Int = reader.nextInt()
        balance = balance + vvod
        println("Вы пополнили на: $vvod Ваш баланс: $balance")
    }

    override fun soedinenie() {
        println("Соединяем с оператором")
    }
}