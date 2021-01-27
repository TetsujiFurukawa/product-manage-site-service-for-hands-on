package com.example.demo.entity.dto.response;

import lombok.Data;

@Data
public class UploadFileResponse {

  private String fileName;
  private String fileDownloadUri;
  private String fileType;
  private long size;

  /**
   * Instantiates a new upload file response.
   *
   * @param fileName the file name
   * @param fileDownloadUri the file download uri
   * @param fileType the file type
   * @param size the size
   */
  public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size) {
    this.fileName = fileName;
    this.fileDownloadUri = fileDownloadUri;
    this.fileType = fileType;
    this.size = size;
  }

}
