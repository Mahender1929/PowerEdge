package com.cebi.entity;

import java.util.List;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableMetaData {

	private String tableName;
	private String name;
	List<AppMessages> appMessage;
	private List<ColumnNames> names;
	private List<ApplicationLabel> appLabels;

	public TableMetaData() {
	}

	public TableMetaData(String tableName, String name) {
		super();
		this.tableName = tableName;
		if (tableName.equalsIgnoreCase("INCT"))
			this.name = "Deposit Transaction";
		else if (tableName.equalsIgnoreCase("GLIF"))
			this.name = "General Ledger Interface";
		else if (tableName.equalsIgnoreCase("INCT@RRBINCT"))
			this.name = "OLD Deposit Transaction";
		else if (tableName.equalsIgnoreCase("GECT"))
			this.name = "NV_BGL Transaction";
		else if (tableName.equalsIgnoreCase("MCAD"))
			this.name = "NV_MCAD_Maker Checker Details";
		else if (tableName.equalsIgnoreCase("BOCT"))
			this.name = "NV_LOAN Account Transaction";
		else if (tableName.equalsIgnoreCase("AUDT"))
			this.name = "NV_Audit Master";
		else if (tableName.equalsIgnoreCase("RIGH"))
			this.name = "NV_RIGH_Account_Risk_Grade_History";
		else if (tableName.equalsIgnoreCase("STID"))
			this.name = "NV_STID_Staff ID details";
		else if (tableName.equalsIgnoreCase("CIFX"))
			this.name = "NV_CIFX_CKYC Customer Details";
		else if (tableName.equalsIgnoreCase("INSL"))
			this.name = "NV_Insurance-INSL";
		else if (tableName.equalsIgnoreCase("CUSM A,CUSVAA B "))
			this.name = "CUSM,CUSVAA";
		else if (tableName.equalsIgnoreCase("inct_err"))
			this.name = "INCT ERROR";
	}
	

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<ColumnNames> getNames() {
		return names;
	}

	public void setNames(List<ColumnNames> names) {
		this.names = names;
	}

	public List<AppMessages> getAppMessage() {
		return appMessage;
	}

	public void setAppMessage(List<AppMessages> appMessage) {
		this.appMessage = appMessage;
	}

	public List<ApplicationLabel> getAppLabels() {
		return appLabels;
	}

	public void setAppLabels(List<ApplicationLabel> appLabels) {
		this.appLabels = appLabels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
