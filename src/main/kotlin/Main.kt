import config.App
import domain.order.OrderPrintService
import domain.order.OrderPrintServiceImpl
import domain.product.ProductService
import domain.product.ProductServiceImpl
import java.util.*

fun main(args: Array<String>) {

    val sc: Scanner = Scanner(System.`in`)

    val (productService, orderPrintService) = App.init()

    println("입력(o[order]: 주문, q[quit]: 종료):")

    val type = sc.next()

    if ("o" == type) {

        orderPrintService.print()

        println("상품번호:")

        val num = sc.next()

        println("갯수:")

        val count = sc.next()

    } else {
        sc.close()
    }
}