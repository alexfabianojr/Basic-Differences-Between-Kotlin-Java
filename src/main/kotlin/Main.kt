fun main(args: Array<String>) {

    //val means the variable is immutable (equivalent to final in java)
    val number = 25 //most used
    val number2: Int
    val number3: Int = 15
    val number4: Short = 79

    number2 = 10 //can be assing one time cuz before was only the declaration

    var number5 = 43
    number5 = 66
    number5 = 120

    //kotlin recommends to use val variables always that it is possible

    println(number + number2 + number3 + number4 + number5)

    val names = arrayListOf("Jhon", "Alex", "Manuela")

    println(names[1])

    //there is no new keyword
    val employee1 = Employee("Lynn Jones", 500)

    //there is no ternary operator in kotlin

    employee1.name = "Lynn Smith"

    println(employee1.name)

    val employee2: Employee

    val mari = Employee("Mari", 1)
    val paulo1 = Employee("Paulo", 2)
    val paulo2 = Employee("Paulo", 2)

    println(mari.equals(paulo1))
    println(mari == paulo1)
    println(paulo1.equals(paulo2))
    println(paulo1 == paulo2)
    println(paulo1 === paulo2) //memory reference equality

    val tipoInt: Int = 10

    println( tipoInt is Int )
    println( tipoInt !is Int )

    if (tipoInt is Int) {
        val someThing: Any = Int
        val novoInt = someThing as Int //smart casting
        println(novoInt is Int)
    }

}