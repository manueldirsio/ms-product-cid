package com.dirsio.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dirsio.product.controller.swagger.ProductCtrlSwagger;
import com.dirsio.product.model.ProductVo;

@RestController
@RequestMapping("/product")
public class ProductControllerImpl implements ProductCtrlSwagger {

	@PostMapping
	public ResponseEntity<ProductVo> addProduct(@RequestBody ProductVo productVo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productVo);
	}

}
