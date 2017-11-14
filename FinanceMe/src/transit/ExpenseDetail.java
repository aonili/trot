package transit;

public class ExpenseDetail {

	/* 支払開始日 */
	private String dateFrom = null;
	/* 支払終了日 */
	private String dateTrom = null;
	/* 交通機関 */
	private String transportation = null;
	/* 出発区間 */
	private String sectionFrom = null;
	/* 到着区間 */
	private String sectionTo = null;
	/* 片道金額 */
	private String price = null;
	/* 通勤タイプ */
	private String transitMode = null;
	/* 要件 */
	private String comment = null;
	/* 合計金額 */
	private String ammount = null;
	/**
	 * @return the dateFrom
	 */
	public String getDateFrom() {
		return dateFrom;
	}
	/**
	 * @param dateFrom the dateFrom to set
	 */
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	/**
	 * @return the dateTrom
	 */
	public String getDateTrom() {
		return dateTrom;
	}
	/**
	 * @param dateTrom the dateTrom to set
	 */
	public void setDateTrom(String dateTrom) {
		this.dateTrom = dateTrom;
	}
	/**
	 * @return the transportation
	 */
	public String getTransportation() {
		return transportation;
	}
	/**
	 * @param transportation the transportation to set
	 */
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	/**
	 * @return the sectionFrom
	 */
	public String getSectionFrom() {
		return sectionFrom;
	}
	/**
	 * @param sectionFrom the sectionFrom to set
	 */
	public void setSectionFrom(String sectionFrom) {
		this.sectionFrom = sectionFrom;
	}
	/**
	 * @return the sectionTo
	 */
	public String getSectionTo() {
		return sectionTo;
	}
	/**
	 * @param sectionTo the sectionTo to set
	 */
	public void setSectionTo(String sectionTo) {
		this.sectionTo = sectionTo;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the transitMode
	 */
	public String getTransitMode() {
		return transitMode;
	}
	/**
	 * @param transitMode the transitMode to set
	 */
	public void setTransitMode(String transitMode) {
		this.transitMode = transitMode;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the ammount
	 */
	public String getAmmount() {
		return ammount;
	}
	/**
	 * @param ammount the ammount to set
	 */
	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}

	
}
