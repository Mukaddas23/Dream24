package pojoClass;

public class CommentsItem{
	private String content;
	private int id;
	private Profile profile;

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setProfile(Profile profile){
		this.profile = profile;
	}

	public Profile getProfile(){
		return profile;
	}
}
