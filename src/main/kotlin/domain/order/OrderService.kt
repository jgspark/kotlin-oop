package domain.order

interface OrderService {

    fun order(input: OrderInput)
}

class OrderServiceImpl : OrderService {

    override fun order(input: OrderInput) {
        // TODO("Not yet implemented")
    }
}