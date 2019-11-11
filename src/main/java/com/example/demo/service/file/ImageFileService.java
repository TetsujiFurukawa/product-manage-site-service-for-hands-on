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

	public void write(String targetFileName, String base64string) throws IOException {

		byte[] decodedBytes = Base64.getDecoder().decode(base64string.substring(23));
		FileUtils.writeByteArrayToFile(new File(targetFileName), decodedBytes);

	}

	public String read(String sourceFileName) throws IOException {

		byte[] fileContent = FileUtils.readFileToByteArray(new File(sourceFileName));
		String encodedString = Base64.getEncoder().encodeToString(fileContent);

		return new String(encodedString);

	}

	public void delete(String targetFileName) {

		FileUtils.deleteQuietly(new File(targetFileName));

	}

	public boolean fileExist(String targetFileName) {

		File file = new File(targetFileName);

		return file.exists();

	}

}
