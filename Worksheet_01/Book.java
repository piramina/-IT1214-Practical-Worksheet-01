class Book{
	private String title;
	private String author;
	private double price;
	
	Book(String title,String author,double Price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	Book(String title,String author){
		this.price=0;
		this.author=author;
		this.title=title;
	}
}