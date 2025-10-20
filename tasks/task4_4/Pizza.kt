fun main() {
    println("""
    PIZZA MENU
    
    (a) Margherita
    (b) Quattro Stagioni
    (c) Seafood
    (d) Hawaiian

    """)

   
    var flag = true 
    while (flag) {
        val ans = readln().lowercase()
        if (ans.length == 1 && ans[0] in 'a'..'d'){
        println("Order accepted")
        flag = false
        }
        else {
            println("Invalid Choice")
        }
    }
    
    
}