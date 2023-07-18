package com.iemr.ecd.controller.data_upload;

import java.io.IOException;

import org.apache.el.parser.ParseException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iemr.ecd.dao.DataTemplate;
import com.iemr.ecd.service.data_upload.DataTemplateServiceImpl;
import com.iemr.ecd.utils.advice.exception_handler.CustomExceptionResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/***
 * 
 * @author NE298657
 *
 */

@RestController
@RequestMapping(value = "/dataTemplate",headers = "Authorization")
@CrossOrigin()
public class DataTemplateController {

	@Autowired
	private DataTemplateServiceImpl dataTemplateServiceImpl;

	@PostMapping(value = "/uploadTemplate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Create template upload", description = "Desc - Create template upload")
	@ApiResponses(value = {
			@ApiResponse(responseCode = CustomExceptionResponse.SUCCESS_SC_V, description = CustomExceptionResponse.SUCCESS_SC, content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = CustomExceptionResponse.NOT_FOUND_SC_V, description = CustomExceptionResponse.NOT_FOUND_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC_V, description = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.DB_EXCEPTION_SC_V, description = CustomExceptionResponse.DB_EXCEPTION_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.BAD_REQUEST_SC_V, description = CustomExceptionResponse.BAD_REQUEST_SC)})
	public ResponseEntity<Object> uploadTemplate(@RequestBody DataTemplate dataTemplate)
			throws ParseException, InvalidFormatException, IOException {
		return new ResponseEntity<>(dataTemplateServiceImpl.uploadTemplate(dataTemplate), HttpStatus.OK);

	}

	@GetMapping(value = "/downloadTemplate/{psmId}/{fileType}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Download template", description = "Desc - Download template")
	@ApiResponses(value = {
			@ApiResponse(responseCode = CustomExceptionResponse.SUCCESS_SC_V, description = CustomExceptionResponse.SUCCESS_SC, content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = CustomExceptionResponse.NOT_FOUND_SC_V, description = CustomExceptionResponse.NOT_FOUND_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC_V, description = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.DB_EXCEPTION_SC_V, description = CustomExceptionResponse.DB_EXCEPTION_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.BAD_REQUEST_SC_V, description = CustomExceptionResponse.BAD_REQUEST_SC)})
	public ResponseEntity<Object> downloadTemplate(@PathVariable Integer psmId, @PathVariable String fileType) {
		return new ResponseEntity<>(dataTemplateServiceImpl.downloadTemplate(psmId, fileType), HttpStatus.OK);

	}
	
//	@PostMapping(value = "/update/templateUpload", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@Operation(summary = "Update template", description = "Desc - Update template")
//	@ApiResponses(value = {
//			@ApiResponse(responseCode = CustomExceptionResponse.SUCCESS_SC_V, description = CustomExceptionResponse.SUCCESS_SC, content = {
//					@Content(mediaType = "application/json") }),
//			@ApiResponse(responseCode = CustomExceptionResponse.NOT_FOUND_SC_V, description = CustomExceptionResponse.NOT_FOUND_SC),
//			@ApiResponse(responseCode = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC_V, description = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC),
//			@ApiResponse(responseCode = CustomExceptionResponse.DB_EXCEPTION_SC_V, description = CustomExceptionResponse.DB_EXCEPTION_SC) })
//	public ResponseEntity<Object> updateTemplateUpload(@RequestBody DataTemplate dataTemplate) {
//		return new ResponseEntity<>(dataTemplateServiceImpl.updateTemplateUpload(dataTemplate), HttpStatus.OK);
//
//	}
}
