package com.example.demo.service.file;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.example.demo.properties.ProductImageProperties;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImageFileService {

  private final ProductImageProperties productImageProperties;

  /**
   * Write.
   *
   * @param targetFileName the target file name
   * @param base64string the base 64 string
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public void write(String targetFileName, String base64string) throws IOException {

    byte[] decodedBytes = Base64.getDecoder()
        .decode(StringUtils.substringAfter(base64string, "64,"));
    FileUtils.writeByteArrayToFile(new File(targetFileName), decodedBytes);

  }

  /**
   * Read.
   *
   * @param sourceFileName the source file name
   * @return the string
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public String read(String sourceFileName) throws IOException {

    byte[] fileContent = FileUtils.readFileToByteArray(new File(sourceFileName));
    String encodedString = productImageProperties.getDataType()
        + Base64.getEncoder().encodeToString(fileContent);

    return new String(encodedString);

  }

  /**
   * Delete.
   *
   * @param targetFileName the target file name
   */
  public void delete(String targetFileName) {

    FileUtils.deleteQuietly(new File(targetFileName));

  }

  /**
   * File exist.
   *
   * @param targetFileName the target file name
   * @return true, if successful
   */
  public boolean fileExist(String targetFileName) {

    File file = new File(targetFileName);

    return file.exists();

  }

}
