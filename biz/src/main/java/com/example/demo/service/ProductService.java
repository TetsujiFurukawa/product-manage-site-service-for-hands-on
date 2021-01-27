package com.example.demo.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.ProductMst;
import com.example.demo.entity.domain.ProductMstExample;
import com.example.demo.entity.domain.ProductMstStockMst;
import com.example.demo.properties.ProductImageProperties;
import com.example.demo.repository.ProductMstMapper;
import com.example.demo.service.file.ImageFileService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductMstMapper productMstMapper;
  private final ImageFileService imageFileService;
  private final ProductImageProperties productImagesProperties;

  /**
   * Select product mst stock mst.
   *
   * @param searchProductMst the search product mst
   * @param limit the limit
   * @param offset the offset
   * @return the list
   */
  public List<ProductMstStockMst> selectProductMstStockMst(ProductMst searchProductMst,
      Integer limit, Long offset) {

    return productMstMapper.selectProductMstStockMst(searchProductMst, limit, offset);

  }

  /**
   * Count product mst stock mst.
   *
   * @param productMst the product mst
   * @return the long
   */
  public Long countProductMstStockMst(ProductMst productMst) {

    return productMstMapper.countProductMstStockMst(productMst);

  }

  /**
   * Gets the product list by code.
   *
   * @param productCode the product code
   * @return the product list by code
   */
  public List<ProductMst> getProductListByCode(String productCode) {

    ProductMstExample producMstExample = new ProductMstExample();
    producMstExample.createCriteria().andProductCodeEqualTo(productCode);

    return productMstMapper.selectByExample(producMstExample);
  }

  /**
   * Insert product.
   *
   * @param productMst the product mst
   * @return the product mst
   */
  public ProductMst insertProduct(ProductMst productMst) {

    productMstMapper.insert(productMst);
    return getProductListByCode(productMst.getProductCode()).get(0);
  }

  /**
   * Select for update product mst by code.
   *
   * @param productMst the product mst
   * @return the product mst
   */
  public ProductMst selectForUpdateProductMstByCode(ProductMst productMst) {

    return productMstMapper.selectForUpdateProductMstByCode(productMst);

  }

  /**
   * Update product.
   *
   * @param productMst the product mst
   * @return the product mst
   */
  public ProductMst updateProduct(ProductMst productMst) {

    productMstMapper.updateByPrimaryKey(productMst);
    return productMstMapper.selectByPrimaryKey(productMst.getProductSeq());
  }

  /**
   * Write product image.
   *
   * @param productCode the product code
   * @param base64string the base 64 string
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public void writeProductImage(String productCode, String base64string) throws IOException {

    String filePath = getFilePath(productCode);

    imageFileService.write(filePath, base64string);
  }

  /**
   * Read product image.
   *
   * @param productCode the product code
   * @return the string
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public String readProductImage(String productCode) throws IOException {

    String filePath = getFilePath(productCode);

    Path file = Paths.get(filePath);
    if (!Files.exists(file)) {
      return null;
    }

    return imageFileService.read(filePath);

  }

  /**
   * Delete product image.
   *
   * @param productCode the product code
   */
  public void deleteProductImage(String productCode) {

    String filePath = getFilePath(productCode);

    imageFileService.delete(filePath);

  }

  /**
   * Product image exist.
   *
   * @param productCode the product code
   * @return true, if successful
   */
  public boolean productImageExist(String productCode) {

    String filePath = getFilePath(productCode);

    return imageFileService.fileExist(filePath);

  }

  private String getFilePath(String productCode) {

    Path path = Paths.get(productImagesProperties.getUploadDirectory() + productCode
        + productImagesProperties.getDefaultExtension());

    return path.toString();
  }

}
