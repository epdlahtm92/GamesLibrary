package com.gamesLibrary.domain;

import java.text.DecimalFormat;

import org.springframework.web.multipart.MultipartFile;

public class Game {
	
	private int gameId;
	private String title;
	private String developer;
	private String developerCountry;
	private String publisher;
	private String publisherCountry;
	private String seriesName;
	private int seriesNumber;
	private String genre;
	private MultipartFile imageFile;
	private String imgPath;
	private int price;
	private String priceToString;
	private String releaseDate;
	private String description;
	
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Game(String title, String developer, String publisher, String seriesName, int price) {
		super();
		this.title = title;
		this.developer = developer;
		this.publisher = publisher;
		this.seriesName = seriesName;
		this.price = price;
		DecimalFormat df = new DecimalFormat("###,###");
		this.priceToString = df.format(price);
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getDeveloperCountry() {
		return developerCountry;
	}

	public void setDeveloperCountry(String developerCountry) {
		this.developerCountry = developerCountry;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisherCountry() {
		return publisherCountry;
	}

	public void setPublisherCountry(String publisherCountry) {
		this.publisherCountry = publisherCountry;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public int getSeriesNumber() {
		return seriesNumber;
	}

	public void setSeriesNumber(int seriesNumber) {
		this.seriesNumber = seriesNumber;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}


	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getPriceToString() {
		return priceToString;
	}


	public void setPriceToString(String priceToString) {
		this.priceToString = priceToString;
	}


	public MultipartFile getImageFile() {
		return imageFile;
	}


	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}

}
