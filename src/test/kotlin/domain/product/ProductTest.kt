package domain.product

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ProductTest {

    @Test
    fun `product class check created`() {

        val num = 768848

        val name = "상품1"

        val price = "21,000원"

        val count = 45

        val product = Product(
            num = num,
            name = name,
            price = price,
            count = count
        )

        assertEquals(num, product.num)
        assertEquals(name, product.name)
        assertEquals(price, product.price)
        assertEquals(count, product.count)
    }
}