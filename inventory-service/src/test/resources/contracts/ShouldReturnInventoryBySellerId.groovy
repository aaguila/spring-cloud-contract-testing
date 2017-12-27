import org.springframework.cloud.contract.spec.Contract

    Contract.make {
        request {
            method 'GET'
            url value(consumer(regex('/inventory/seller/[0-9]+')))
            headers {
                contentType(applicationJson())
            }
        }
        response {
            status 200
            body([  account: [
                                name: 'aritz',
                                lastname: 'aguila',
                                login: 'aaguila',
                                type: 'seller'
                            ],
                    items: [
                            [
                                 name: 'Explore It!',
                                 stock: 1,
                                 price: 20.00
                            ],
                            [
                                 name: 'Growing Object-Oriented Software',
                                 stock: 4,
                                 price: 15.00
                            ]
                    ]
            ])
            headers {
                contentType(applicationJson())
            }
        }

}
