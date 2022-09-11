import domain.order.OrderService
import domain.order.OrderServiceImpl
import domain.product.ProductService
import domain.product.ProductServiceImpl
import java.util.Scanner

fun main(args: Array<String>) {

    val sc: Scanner = Scanner(System.`in`)

    // product service di
    val productService: ProductService = ProductServiceImpl()

    val orderService: OrderService = OrderServiceImpl()

    val products = productService.findAll()

    println("입력(o[order]: 주문, q[quit]: 종료):")

    val type = sc.next()

    if ("o" == type) {

        orderService.printProduct(products)

        println("상품번호:")

        val num = sc.next()

        println("갯수:")

        val count = sc.next()


    } else {
        sc.close()
    }
}