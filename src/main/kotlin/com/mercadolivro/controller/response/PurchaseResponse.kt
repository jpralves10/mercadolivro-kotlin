package com.mercadolivro.controller.response

import java.math.BigDecimal
import java.time.LocalDateTime

class PurchaseResponse(
    var id: Int?,
    var nfe: String?,
    var price: BigDecimal,
    var createdAt: LocalDateTime,
    var customer: CustomerResponse,
    var books: MutableList<BookResponse>
)