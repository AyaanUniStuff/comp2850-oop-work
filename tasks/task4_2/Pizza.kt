fun main() {
    println("""
    PIZZA MENU
    
    (a) Margherita
    (b) Quattro Stagioni
    (c) Seafood
    (d) Hawaiian

    """)

    val ans = readln().lowercase()

    if (ans.length == 1 && ans[0] in 'a'..'d'){
        println("Order accepted")
    }
    else {
        println("Invalid Choice")
    }
    
}