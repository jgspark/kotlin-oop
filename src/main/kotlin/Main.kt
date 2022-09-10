import domain.product.ProductService
import domain.product.ProductServiceImpl

fun main(args: Array<String>) {

    // product service di
    val productService : ProductService = ProductServiceImpl()

    productService.findAll()

}