package com.example.demo.service.file;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImageFileService {

	//	private final ProductImages fileProperties;

	public void write(String targetFileName, String base64string) throws IOException {

		//		Path path = Paths.get("./" + fileProperties.getUploadDirectory() + targetFileName);

		byte[] decodedBytes = Base64.getDecoder().decode(base64string.substring(23));
		FileUtils.writeByteArrayToFile(new File(targetFileName), decodedBytes);

		//		Path path = Paths.get("./" + fileProperties.getUploadDirectory() + targetFileName);
		//		Files.write(path, decode);

	}

	public String read(String sourceFileName) throws IOException {

		//		Path path = Paths.get("./" + fileProperties.getUploadDirectory() + sourceFileName);

		byte[] fileContent = FileUtils.readFileToByteArray(new File(sourceFileName));
		String encodedString = Base64.getEncoder().encodeToString(fileContent);

		//		Path path = Paths.get("./" + fileProperties.getUploadDirectory() + sourceFileName);
		//		byte[] encode = Base64.getEncoder().encode(Files.readAllBytes(path));

		return new String(encodedString);

	}

}
