package Beans;

import java.util.Date;

public class ProductStock {
	private String orderId;
	private String name;
	private double price_per_unit;
	private double quantityValue;
	private double quantityUnit;
	private double price;
	private String warehouseID;
	private Date deliveryDate;
	private Date manufacturingDate;
	private Date expiryDate;
	private String qualityCheck;
	private Date processDate;
	private int supplierID;
	private int distributorID;
	private int rawMaterialId;
	private boolean deliveryStatus;
	private Date exitDate;

	public ProductStock() {
		super();
	}

	public ProductStock(String orderId, String name, double price_per_unit, double quantityValue, double quantityUnit,
			double price, String warehouseID, Date deliveryDate, Date manufacturingDate, Date expiryDate,
			String qualityCheck, Date processDate, int supplierID, int distributorID, int rawMaterialId,
			boolean deliveryStatus, Date exitDate) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.price_per_unit = price_per_unit;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.warehouseID = warehouseID;
		this.deliveryDate = deliveryDate;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
		this.processDate = processDate;
		this.supplierID = supplierID;
		this.distributorID = distributorID;
		this.rawMaterialId = rawMaterialId;
		this.deliveryStatus = deliveryStatus;
		this.exitDate = exitDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice_per_unit() {
		return price_per_unit;
	}

	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}

	public double getQuantityValue() {
		return quantityValue;
	}

	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}

	public double getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(double quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getQualityCheck() {
		return qualityCheck;
	}

	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}

	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public int getDistributorID() {
		return distributorID;
	}

	public void setDistributorID(int distributorID) {
		this.distributorID = distributorID;
	}

	public int getRawMaterialId() {
		return rawMaterialId;
	}

	public void setRawMaterialId(int rawMaterialId) {
		this.rawMaterialId = rawMaterialId;
	}

	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public Date getExitDate() {
		return exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

}
