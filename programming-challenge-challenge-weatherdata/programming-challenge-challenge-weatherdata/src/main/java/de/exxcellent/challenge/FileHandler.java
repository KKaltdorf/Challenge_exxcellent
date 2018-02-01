package de.exxcellent.challenge;
/**
*includes all methods for handling of the input file
*/
public class FileHandler {
	//initializing variables
	String csvFileLocation = "";
	String directory = "";
	String csvFileName = "";
	
	
	//set path to directory
	void setDirectory() {
		directory = "C:\\Users\\Kristin\\Desktop\\programming-challenge-challenge-weatherdata\\programming-challenge-challenge-weatherdata\\src\\main\\resources\\de\\exxcellent\\challenge\\";
	}
	//set file name by user input
	void setFileName(String name) {
		csvFileName = name;
	}
	//add directory and file name to the absolute location of the file
	void setcsvFileLocation() {
		csvFileLocation = directory.concat(csvFileName);
	}
	//csvFileLocation includes the path and the file name
	String getcsvFileLocation() {
		return csvFileLocation;
	}
}
