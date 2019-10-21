package com.example.demo.service.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import org.springframework.stereotype.Service;

import com.example.demo.FileProperties;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FileIoService {

	private final FileProperties fileProperties;

	public void write(String targetFileName, String base64string) throws IOException {

		byte[] decode = Base64.getDecoder().decode(base64string);
		Path path = Paths.get("./" + fileProperties.getUploadDir() + targetFileName);

		Files.write(path, decode);

	}

	public String read(String sourceFileName) throws IOException {

		Path path = Paths.get("./" + fileProperties.getUploadDir() + sourceFileName);

		byte[] encode = Base64.getEncoder().encode(Files.readAllBytes(path));

		return new String(encode);

	}

}
