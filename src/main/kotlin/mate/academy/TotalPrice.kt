package mate.academy

/*
    Calculate the products total price based on the provide price per product and products amount.
    If the price is not provided, use default price per product equal to 29.99
 */
const val THIRTY = 29.99

fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    val price: Double = pricePerProduct?:THIRTY
    return price * count
}
