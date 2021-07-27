fun cardAdd(){
    while(true) {
        println("Введите проверка баланса(пб)\nили пополнение счета(пс)\nили exit, чтобы выйти")
        val name = readLine()
        for (i in checkPlusAdd) {
            for (z in i) {
                if (name == z && i == checkbalancenum) {
                    println("Вы ввели: Проверка баланса")
                    cardZero.check()
                } else if (name == z && i == addnum) {
                    println("Вы ввели: пополнение счета")
                    cardZero.add()
            }
        }
        if(name == f){
            break
        }
    }
}
}
fun cardTrancefer(){
    while (true){
        println("Введите оплата(о)\nили перевод денег(пд)\nили exit, чтобы выйти")
        val name = readLine()
        for (i in payPlustrancefer) {
            for (z in i) {
                if (name == z && i == paynum) {
                    println("Вы ввели: Оплата")
                    cardZero.pay()
                } else if (name == z && i == trancefernum) {
                    println("Вы ввели: Перевод денег")
                    cardZero.trancefer()
                }
            }
            if(name == f){
                break
            }
        }
    }
}
fun firstCheck() {
    while (true){
        println("Введите: проверка(пр) для того, что бы проверить баланс или пополнить баланс.\nоперации(оп) для того, чтобы произвести перевод или оплату\nсоединение с оператором(со), чтобы связаться с оператором\nесли хотите выйти введите exit")
        val scanline = readLine()
        for (i in checkoperachions){
            for (z in i){
                if (scanline == z && i == checkcheck) {
                    cardAdd()
                } else if (scanline == z && i == operashions) {
                    cardTrancefer()
                } else if (scanline==z && i == connectnum){
                    cardZero.connect()
                }
            }
        }
        if(scanline == f){break}
    }
}