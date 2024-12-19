package com.ladinenga.ShopCart.service.product;

import com.ladinenga.ShopCart.dto.ProductDto;
import com.ladinenga.ShopCart.model.Product;
import com.ladinenga.ShopCart.request.AddProductRequest;
import com.ladinenga.ShopCart.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductByCategory(String category);
    List<Product> getProductByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
