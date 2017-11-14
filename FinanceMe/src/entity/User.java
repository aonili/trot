package entity;

public class User {

	/**
	 * ユーザーID
	 */
	private String id = null;
	/**
	 * 暗証番号
	 */
	private String password = null;
	/**
	 * ユーザー名
	 */
	private String name = null;

	/**
	 * ユーザーIDの取得
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * ユーザーIDの設定
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 暗証番号の取得
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 暗証番号の設定
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * ユーザー名の取得
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * ユーザー名の設定
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
