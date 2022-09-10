package domain.order

import domain.order.data.OrderInput

interface OrderService {

    fun order(input : OrderInput)
}