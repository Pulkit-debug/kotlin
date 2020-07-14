    // ***************** Classes and Objects ***************
    // classes are basically is a blueprint of the objects which have some basica common properties
    // class naming with capital letters start.


    fun main() {
        // creating an object of class user
        var account: Account = Account()
        account.details(123, "pulkit")
        println("Account no: ${account.accountNo}, Account Holder Name: ${account.name}, Account Holder Balance: ${account.accountMoney}")
        account.depositMoney(100f)
        account.withdrawMoney(99f)


    }


    class Account {
        var accountNo: Int = 0
        var name: String? = null
        var accountMoney: Float = 0f

        // Constructor
        // There are two types of constructors
        // 1. Primay Constructor: Only 1
        // 2. Secondry Constructor: can be multiple
        constructor() {
            println("Constructor is working!")
        }


        fun details(accountNo: Int, name: String) {
            this.accountNo = accountNo
            this.name = name
        }

        fun depositMoney(amount: Float) {
            accountMoney += amount
            getMoney()
        }

        fun withdrawMoney(amount: Float) {
            accountMoney -= amount
            getMoney()
        }

        fun getMoney() {
            println("Your currne balance is $accountMoney")
        }

    }