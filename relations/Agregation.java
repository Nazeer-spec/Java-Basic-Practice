class Post
{
	int likes;
	int comments;

	public void likePost()
	{
		likes++;
	}

	public void commentPost()
	{
		comments++;
	}

	public void showLikeComment()
	{
		System.out.println("Likes = "+likes);
		System.out.println("Comments = "+comments);
	}
}
class User
{
	String username;
	String password;

	static Post p1 = new Post();//important
}
class Agregation
{
	public static void main(String[] args) 
	{
		//Post p1 = new Post();
		User.p1.showLikeComment();
		User.p1.likePost();
		User.p1.commentPost();
		User.p1.showLikeComment();
	}
}