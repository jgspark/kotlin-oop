package domain.order

import config.ProductsEmptyError
import domain.product.ProductService
import domain.product.ProductServiceImpl
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class OrderServiceImplTest {

    private var productService: ProductService? = null

    private var orderService: OrderService? = null

    @BeforeEach
    fun init() {

        productService = ProductServiceImpl()

        orderService = OrderServiceImpl()
    }

    @Test
    fun `상품 리스트 성공 케이스`() {

        val products = productService!!.findAll()

        orderService!!.printProduct(products)
    }

    @Test
    fun `products empty case`() {
        assertThrows(ProductsEmptyError::class.java) {
            orderService!!.printProduct(listOf())
        }
    }
}