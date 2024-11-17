package com.dirsio.product.controller.swagger;

import org.springframework.http.ResponseEntity;

import com.dirsio.product.model.ProductVo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Product")
public interface ProductCtrlSwagger {

	@Operation(summary = "Post add new Product")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Product was created"),
			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
			@ApiResponse(responseCode = "401", description = "Forbidden", content = @Content),
			@ApiResponse(responseCode = "501", description = "Internal server error", content = @Content),
	})
	public ResponseEntity<ProductVo> addProduct(ProductVo productVo);
}
