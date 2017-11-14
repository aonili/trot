package transit;

import java.util.List;


public class Expense {
	/* 提出日 */
	private String submitDate = null;
	/* 精算開始日 */
	private String settlementDateFrom = null;
	/* 精算終了日 */
	private String settlementDateTo = null;
	/* 氏名 */
	private String name = null;
	/* 交通費明細DTOリスト */
	private List<ExpenseDetail> expDetailList = null;
	/**
	 * @return the submitDate
	 */
	public String getSubmitDate() {
		return submitDate;
	}
	/**
	 * @param submitDate the submitDate to set
	 */
	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}
	/**
	 * @return the settlementDateFrom
	 */
	public String getSettlementDateFrom() {
		return settlementDateFrom;
	}
	/**
	 * @param settlementDateFrom the settlementDateFrom to set
	 */
	public void setSettlementDateFrom(String settlementDateFrom) {
		this.settlementDateFrom = settlementDateFrom;
	}
	/**
	 * @return the settlementDateTo
	 */
	public String getSettlementDateTo() {
		return settlementDateTo;
	}
	/**
	 * @param settlementDateTo the settlementDateTo to set
	 */
	public void setSettlementDateTo(String settlementDateTo) {
		this.settlementDateTo = settlementDateTo;
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
	 * @return the expDetailList
	 */
	public List<ExpenseDetail> getExpDetailList() {
		return expDetailList;
	}
	/**
	 * @param expDetailList the expDetailList to set
	 */
	public void setExpDetailList(List<ExpenseDetail> expDetailList) {
		this.expDetailList = expDetailList;
	}

}
