package ru.sergeysemenov.soap_test.endpoints;

import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.sergeysemenov.soap_test.services.ProductService;
import ru.sergeysemenov.soap_test.soap.product.GetProductByIdRequest;
import ru.sergeysemenov.soap_test.soap.product.GetProductByIdResponse;

@Endpoint
@RequiredArgsConstructor
public class ProductEndpoint {
    private static final String NAME_SPACE = "http://www.sergeysemenov.ru/soap_test/product";
    private final ProductService productService;

    @PayloadRoot(namespace = NAME_SPACE, localPart = "getProductByIdRequest")
    @ResponsePayload
    public GetProductByIdResponse getProductById (@RequestPayload GetProductByIdRequest request){
        GetProductByIdResponse response = new GetProductByIdResponse();
        response.setProduct(productService.findById(request.getId()));
        return response;
    }
}
