package dto;

import java.sql.Date;

/**
 * 订单数据
 * 
 * @author aisino
 *
 */
public class OrderDTO {

	private Integer orderId;
	private Date saveTime;
	private Integer userId;
	private String userMobile;
	private Integer productId;
	private String productName;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getSaveTime() {
		return saveTime;
	}

	public void setSaveTime(Date saveTime) {
		this.saveTime = saveTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductNam() {
		return productName;
	}

	public void setProductNam(String productNam) {
		this.productName = productNam;
	}

	@Override
	public String toString() {
		return super.toString() + "订单时间" + saveTime;
	}

}
