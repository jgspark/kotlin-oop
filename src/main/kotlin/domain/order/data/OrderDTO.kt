package domain.order.data

data class OrderInput constructor(
    private val productNum: Int,
    private val orderCount: Int,
)