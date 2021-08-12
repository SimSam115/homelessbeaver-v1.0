package data;

public class GameDetails {
	public int id;
	public String name, details, photoLink, gameLink;	
	
	/**
	 * @param id
	 * @param name
	 * @param details
	 * @param photoLink
	 * @param gameLink
	 */
	public GameDetails(int id, String name, String details, String photoLink, String gameLink) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
		this.photoLink = photoLink;
		this.gameLink = gameLink;
	}
	
	public GameDetails() {
		super();
		this.id = -999;
		this.name = "";
		this.details = "";
		this.photoLink = "";
		this.gameLink = "";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * @return the photoLink
	 */
	public String getPhotoLink() {
		return photoLink;
	}
	/**
	 * @param photoLink the photoLink to set
	 */
	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}
	/**
	 * @return the gameLink
	 */
	public String getGameLink() {
		return gameLink;
	}
	/**
	 * @param gameLink the gameLink to set
	 */
	public void setGameLink(String gameLink) {
		this.gameLink = gameLink;
	}

	@Override
	public String toString() {
		return "gameDetails [id=" + id + ", name=" + name + ", details=" + details + ", photoLink=" + photoLink
				+ ", gameLink=" + gameLink + "]";
	}
	
	
	
}
