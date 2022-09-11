package domain.order

import config.ProductsEmptyError
import domain.product.Product

interface OrderService {

    fun printProduct(product: List<Product>)

    fun order(input: OrderInput)
}

class OrderServiceImpl : OrderService {
    override fun printProduct(product: List<Product>) {

        if (product.isEmpty()) throw ProductsEmptyError()

        println("상품번호 상품명                                   판매가격              판매수량")

        product.forEach { it ->
            println("${it.num} ${it.name}            ${it.price}               ${it.count}")
        }
    }

    override fun order(input: OrderInput) {
        // TODO("Not yet implemented")
    }
}