import org.springframework.cloud.contract.spec.Contract

    Contract.make {
        request {
            method 'GET'
            url  '/accounts'
        }
        response {
            status 200
            body(           [   [
                                        name: 'aritz',
                                        lastname: 'aguila',
                                        login: 'aaguila',
                                        type: 'seller'
                                ],
                                [
                                        name: 'aker',
                                        lastname: 'beltz',
                                        login: 'abeltz',
                                        type: 'buyer'
                                ]
                            ]
            )
            headers {
                contentType(applicationJson())
            }
        }

}
