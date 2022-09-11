package domain.product

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ProductServiceImplTest {

    private var productService: ProductService? = null

    @BeforeEach
    fun init() {
        productService = ProductServiceImpl()
    }

    @Test
    fun `데이터 불러오기`() {

        val products: List<Product> = productService!!.findAll()

        assertNotNull(products)

        assertEquals(products.size, 19)
    }
}