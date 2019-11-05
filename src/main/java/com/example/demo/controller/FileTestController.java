package com.example.demo.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.file.ImageFileService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class FileTestController {

	private final ImageFileService fileIoService;

	@GetMapping("/file-read")
	public void fileUpload() throws IOException {

		String sourceFileName = "queen.jpg";

		String base64string = fileIoService.read(sourceFileName);

		fileIoService.write("test01.png", base64string);
	}

}
