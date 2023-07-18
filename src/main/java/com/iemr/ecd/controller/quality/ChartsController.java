package com.iemr.ecd.controller.quality;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iemr.ecd.dto.ResponseFetchQualityChartsDataDTO;
import com.iemr.ecd.service.quality.ChartsImpl;
import com.iemr.ecd.utils.advice.exception_handler.CustomExceptionResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(value = "/charts", headers = "Authorization")
@CrossOrigin()
public class ChartsController {

	@Autowired
	ChartsImpl chartsImpl;

	// chart - 1
	@GetMapping(value = "/getCentreOverallQualityRating/{psmId}/{frequency}/{month}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "", description = "Desc - ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = CustomExceptionResponse.SUCCESS_SC_V, description = CustomExceptionResponse.SUCCESS_SC, content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = CustomExceptionResponse.NOT_FOUND_SC_V, description = CustomExceptionResponse.NOT_FOUND_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC_V, description = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.DB_EXCEPTION_SC_V, description = CustomExceptionResponse.DB_EXCEPTION_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.BAD_REQUEST_SC_V, description = CustomExceptionResponse.BAD_REQUEST_SC) })
	public ResponseEntity<List<ResponseFetchQualityChartsDataDTO>> getTrendAnalysisOfCentreOverallQualityRatings(
			@PathVariable Integer psmId, @PathVariable String frequency, @PathVariable String month) {
		return new ResponseEntity<>(chartsImpl.getTrendAnalysisOfCentreOverallQualityRatings(psmId, frequency, month),
				HttpStatus.OK);
	}

	// chart - 2
	@GetMapping(value = "/getActorWiseQualityRatings/{psmId}/{roleName}/{month}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "", description = "Desc - ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = CustomExceptionResponse.SUCCESS_SC_V, description = CustomExceptionResponse.SUCCESS_SC, content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = CustomExceptionResponse.NOT_FOUND_SC_V, description = CustomExceptionResponse.NOT_FOUND_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC_V, description = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.DB_EXCEPTION_SC_V, description = CustomExceptionResponse.DB_EXCEPTION_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.BAD_REQUEST_SC_V, description = CustomExceptionResponse.BAD_REQUEST_SC) })
	public ResponseEntity<List<ResponseFetchQualityChartsDataDTO>> getActorWiseQualityRatings(
			@PathVariable Integer psmId, @PathVariable String roleName, @PathVariable String month) {
		return new ResponseEntity<>(chartsImpl.getActorWiseQualityRatings(psmId, roleName, month), HttpStatus.OK);
	}

	@GetMapping(value = "/getTenureWiseQualityRating/{psmId}/{roleName}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "", description = "Desc - ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = CustomExceptionResponse.SUCCESS_SC_V, description = CustomExceptionResponse.SUCCESS_SC, content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = CustomExceptionResponse.NOT_FOUND_SC_V, description = CustomExceptionResponse.NOT_FOUND_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC_V, description = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.DB_EXCEPTION_SC_V, description = CustomExceptionResponse.DB_EXCEPTION_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.BAD_REQUEST_SC_V, description = CustomExceptionResponse.BAD_REQUEST_SC) })
	public ResponseEntity<List<ResponseFetchQualityChartsDataDTO>> getTenureWiseQualityRatings(
			@PathVariable Integer psmId, @PathVariable String roleName) {
		return new ResponseEntity<>(chartsImpl.getTenureWiseQualityRatings(psmId, roleName), HttpStatus.OK);
	}

	@GetMapping(value = "/getGradeWiseAgentCount/{psmId}/{frequency}/{frequencyValue}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "", description = "Desc - ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = CustomExceptionResponse.SUCCESS_SC_V, description = CustomExceptionResponse.SUCCESS_SC, content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = CustomExceptionResponse.NOT_FOUND_SC_V, description = CustomExceptionResponse.NOT_FOUND_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC_V, description = CustomExceptionResponse.INTERNAL_SERVER_ERROR_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.DB_EXCEPTION_SC_V, description = CustomExceptionResponse.DB_EXCEPTION_SC),
			@ApiResponse(responseCode = CustomExceptionResponse.BAD_REQUEST_SC_V, description = CustomExceptionResponse.BAD_REQUEST_SC) })
	public ResponseEntity<List<ResponseFetchQualityChartsDataDTO>> getActorWiseQualityRatingByRoleIdAndPSMIdAndFrequency(
			@PathVariable Integer psmId, @PathVariable String frequency, @PathVariable String frequencyValue) {
		return new ResponseEntity<>(chartsImpl.gradeWiseAgentCount(psmId, frequency, frequencyValue), HttpStatus.OK);
	}

}
