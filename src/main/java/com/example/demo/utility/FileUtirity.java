package com.example.demo.utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import com.example.demo.FileProperties;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FileUtirity {

	private final FileProperties fileProperties;

	public void write(String targetFileName, String base64string) throws IOException {

		byte[] decode = Base64.getDecoder().decode(base64string);
		Path path = Paths.get("./" + fileProperties.getFolder() + targetFileName);

		Files.write(path, decode);

	}

	public String read(String sourceFileName) throws IOException {

		Path path = Paths.get("./" + fileProperties.getFolder() + sourceFileName);
		byte[] encode = Base64.getEncoder().encode(Files.readAllBytes(path));

		return new String(encode);

	}

}
