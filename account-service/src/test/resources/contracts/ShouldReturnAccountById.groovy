import org.springframework.cloud.contract.spec.Contract

    Contract.make {
        request {
            method 'GET'
            url value(consumer(regex('/account/[0-9]+')))
        }
        response {
            status 200
            body([
                    name: 'aritz',
                    lastname: 'aguila',
                    login: 'aaguila',
                    type: 'seller'
            ])
            headers {
                contentType(applicationJson())
            }
        }

}
