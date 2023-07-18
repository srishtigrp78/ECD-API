package com.iemr.ecd.model.excel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {

	public static final String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	static String[] CriteriaHEADERs = { "Filter Name", "Value" };
	static String SHEET = "Users";

	public static ByteArrayInputStream tutorialsToExcel(String[] headers, List<Object[]> result, Criteria criteria,
			String[] criteriaColumns) throws Exception {
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
			Sheet criteriaSheet = workbook.createSheet("Criteria");

			// Removing milliseconds from timestamp
			criteria.setStart_Date(criteria.getStart_Date().replaceAll("\\.\\d+", ""));
			criteria.setEnd_Date(criteria.getEnd_Date().replaceAll("\\.\\d+", ""));

			// Header
			Row headerRowCriteria = criteriaSheet.createRow(0);

			for (int col = 0; col < CriteriaHEADERs.length; col++) {
				Cell cell = headerRowCriteria.createCell(col);
				cell.setCellValue(CriteriaHEADERs[col]);
			}
			int criteriaRowIndex = 1;

			for (int j = 0; j < criteriaColumns.length; j++) {
				Row row = criteriaSheet.createRow(criteriaRowIndex++);
				row.createCell(0).setCellValue(criteriaColumns[j]);
				if (criteriaColumns[j].equalsIgnoreCase("Start_Date")) {
					row.createCell(1).setCellValue(criteria.getStart_Date());
				} else if (criteriaColumns[j].equalsIgnoreCase("End_Date")) {
					row.createCell(1).setCellValue(criteria.getEnd_Date());
				} else if (criteriaColumns[j].equalsIgnoreCase("Role")) {
					row.createCell(1).setCellValue(criteria.getRole());
				} else if (criteriaColumns[j].equalsIgnoreCase("Agent_Id")) {
					row.createCell(1).setCellValue(criteria.getAgent_Id());
				}
			}
			Sheet sheet = workbook.createSheet("Report");

			// Header
			Row headerRow = sheet.createRow(0);
			CellStyle headerStyle = workbook.createCellStyle();
			headerStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
			headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			Font headerFont = workbook.createFont();
			headerFont.setBold(true);
			headerStyle.setFont(headerFont);
			for (int col = 0; col < headers.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(headers[col]);
				cell.setCellStyle(headerStyle);
			}
		//	headerRow.setRowStyle(headerStyle);
			int rowIdx = 1;
			int size = 0;
			int sno = 1, a = 1;
			for (Object[] obj : result) {
				Row row = sheet.createRow(rowIdx++);
				size = obj.length;
				row.createCell(0).setCellValue(sno++);
				a = 1;
				for (int i = 0; i < size; i++) {
					Boolean isDate = isValidDate(obj[i] != null ? obj[i].toString() : "");
					if (isDate) {
						row.createCell(a)
								.setCellValue(obj[i] != null ? obj[i].toString().replaceAll("\\.\\d+", "") : "");
					} else
						row.createCell(a).setCellValue(obj[i] != null ? obj[i].toString() : "");
					a++;
				}
			}
			workbook.write(out);
			return new ByteArrayInputStream(out.toByteArray());
		} catch (Exception e) {
			throw new Exception("fail to import data to Excel file: " + e.getMessage());
		}
	}

	public static boolean isValidDate(String inDate) {

		SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {

			Date date = inputDateFormat.parse(inDate);
		} catch (ParseException pe) {
			return false;
		}
		return true;
	}

}
