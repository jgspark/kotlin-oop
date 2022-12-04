package config

import domain.order.OrderPrintService
import domain.order.OrderPrintServiceImpl
import domain.product.ProductService
import domain.product.ProductServiceImpl

object App {

    fun init(): Ioc {
        // product service di
        val productService: ProductService = ProductServiceImpl()

        val orderPrintService: OrderPrintService = OrderPrintServiceImpl(productService)

        return Ioc(productService, orderPrintService)
    }
}

data class Ioc constructor(
    val productService: ProductService, val orderPrintService: OrderPrintService
)