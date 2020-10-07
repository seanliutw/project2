package jim;
import java.io.Serializable;
public class ProductsBean implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	int price;
	String img;
	String descript;
	int quantity;
	int specialPrice;
	String rewardpoints;
	boolean isThumb;
	int memberId;
	int animalTypeId;
	int categoryId;
//	public ProductsBean(int id, String name, int price, String img, String descript, int quantity, int specialPrice,
//	String rewardpoints, boolean isThumb, int memberId, int animalTypeId, int categoryId) {
//super();
//this.id = id;
//this.name = name;
//this.price = price;
//this.img = img;
//this.descript = descript;
//this.quantity = quantity;
//this.specialPrice = specialPrice;
//this.rewardpoints = rewardpoints;
//this.isThumb = isThumb;
//this.memberId = memberId;
//this.animalTypeId = animalTypeId;
//this.categoryId = categoryId;
//}
//
//public ProductsBean() {
//super();
//}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSpecialPrice() {
		return specialPrice;
	}
	public void setSpecialPrice(int specialPrice) {
		this.specialPrice = specialPrice;
	}
	public String getRewardpoints() {
		return rewardpoints;
	}
	public void setRewardpoints(String rewardpoints) {
		this.rewardpoints = rewardpoints;
	}
	public boolean getIsThumb() {
		return isThumb;
	}
	public void setIsThumb(boolean isThumb) {
		this.isThumb = isThumb;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getAnimalTypeId() {
		return animalTypeId;
	}
	public void setAnimalTypeId(int animalTypeId) {
		this.animalTypeId = animalTypeId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	




	
}