package pl.pam.receiptsaver.constants

enum class ExpenseCategory(val categoryName: String, val categoryId: String) {
    FOOD("Jedzenie", "0"),
    CAR("Samochód", "1"),
    SERVICES("Usługi", "2");

    companion object {
        fun getNameById(categoryId: String): String {
            return values().find { it.categoryId == categoryId }?.categoryName.orEmpty()
        }
    }
}