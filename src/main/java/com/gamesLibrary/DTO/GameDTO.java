package com.gamesLibrary.DTO;

import java.text.DecimalFormat;

import org.springframework.web.multipart.MultipartFile;

public class GameDTO {
	
	private int GAMEID;
	private String TITLE;
	private String DEVELOPER;
	private String DEVELOPERCOUNTRY;
	private String PUBLISHER;
	private String PUBLISHERCOUNTRY;
	private String SERIESNAME;
	private int SERIESNUMBER;
	private String GNERE;
	private MultipartFile IMAGEFILE;
	private String IMGPATH;
	private int PRICE;
	private String PRICETOSTRING;
	private String RELEASEDATE;
	private String DESCRIPTION;
	
	public GameDTO() {
		super();
	}

	public int getGameId() {
		return GAMEID;
	}

	public void setGameId(int gameId) {
		this.GAMEID = gameId;
	}

	public String getTitle() {
		return TITLE;
	}

	public void setTitle(String title) {
		this.TITLE = title;
	}

	public String getDeveloper() {
		return DEVELOPER;
	}

	public void setDeveloper(String developer) {
		this.DEVELOPER = developer;
	}

	public String getDeveloperCountry() {
		return DEVELOPERCOUNTRY;
	}

	public void setDeveloperCountry(String developerCountry) {
		this.DEVELOPERCOUNTRY = developerCountry;
	}

	public String getPublisher() {
		return PUBLISHER;
	}

	public void setPublisher(String publisher) {
		this.PUBLISHER = publisher;
	}

	public String getPublisherCountry() {
		return PUBLISHERCOUNTRY;
	}

	public void setPublisherCountry(String publisherCountry) {
		this.PUBLISHERCOUNTRY = publisherCountry;
	}

	public String getSeriesName() {
		return SERIESNAME;
	}

	public void setSeriesName(String seriesName) {
		this.SERIESNAME = seriesName;
	}

	public int getSeriesNumber() {
		return SERIESNUMBER;
	}

	public void setSeriesNumber(int seriesNumber) {
		this.SERIESNUMBER = seriesNumber;
	}

	public String getGenre() {
		return GNERE;
	}

	public void setGenre(String genre) {
		this.GNERE = genre;
	}

	public String getImgPath() {
		return IMGPATH;
	}

	public void setImgPath(String imgPath) {
		this.IMGPATH = imgPath;
	}

	public String getReleaseDate() {
		return RELEASEDATE;
	}

	public void setReleaseDate(String releaseDate) {
		this.RELEASEDATE = releaseDate;
	}

	public String getDescription() {
		return DESCRIPTION;
	}

	public void setDescription(String description) {
		this.DESCRIPTION = description;
	}

	public int getPrice() {
		return PRICE;
	}

	public void setPrice(int price) {
		DecimalFormat df = new DecimalFormat("###,###");
		this.PRICETOSTRING = df.format(PRICE);
		this.PRICE = price;
	}

	public String getPriceToString() {
		return PRICETOSTRING;
	}

	public void setPriceToString(String priceToString) {
		DecimalFormat df = new DecimalFormat("###,###");
		this.PRICETOSTRING = df.format(PRICE);
		this.PRICETOSTRING = priceToString;
	}

	public MultipartFile getImageFile() {
		return IMAGEFILE;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.IMAGEFILE = imageFile;
	}

}
