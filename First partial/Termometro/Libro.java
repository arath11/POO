/*Julio Arath Rosales Oliden
A01630738*/
public class Libro{
	
	private String titulo;
	private String autor;
	private String editorial;
	private String isbn;

	public Libro(){
		titulo="Titulo desconocido";
		autor="Autor desconocido";
		editorial="Editorial desconocido";
		isbn="Isbn desconocido";
	}

	public Libro(String a, String b, String c, String d){
		titulo=a;
		autor=b;
		editorial=c;
		isbn=d;
	}

	public String getTitulo(){
		return titulo;
	}	

	public String getAutor(){
		return autor;
	}

	public String getEditorial(){
		return editorial;
	}

	public String getIsbn(){
		return isbn;
	}

	public void setTitulo(String t){
		titulo=t;
	}

	public void setAutor(String t){
		autor=t;
	}

	public void setEditorial(String t){
		editorial=t;
	}

	public void setIsbn(String t){
		isbn=t;
	}
	
	public static void main(String[] args){
		Libro de=new Libro();
		Libro tuVida= new Libro("Tu vida tu mejor negocio", "Salvador Alva", "LID", "978-607-9308-36-6");
		Libro mazeRunner=new Libro("Maze Runner", "James Dashner", "v&R", "978-987-612-742-4");
		Libro ferrari=new Libro("Ferrari", "Paul Turner", "Parragon Books", "1-40546-596-7");
		Libro porsche= new Libro("Porsche", "Paul Turner", "Parragon Books", "1-40546-570-0");
	

		System.out.println("El libro default tiene de titulo: \n" + de.getTitulo() + "\nautor: \n" + de.getAutor() + "\neditorial: \n" + de.getEditorial() + "\nisbn: \n" + de.getIsbn());
		System.out.println("");
		System.out.println("El libro Tu Vida tiene de titulo: \n" + tuVida.getTitulo() + "\n autor: \n" + tuVida.getAutor() + "\neditorial: \n" + tuVida.getEditorial() + "\nisbn: \n" + tuVida.getIsbn());
		System.out.println("");
		System.out.println("El libro Maze Runner tiene de titulo: \n" + mazeRunner.getTitulo() + "\nautor: \n" + mazeRunner.getAutor() + "\neditorial: \n" + mazeRunner.getEditorial() + "\nisbn: \n" + mazeRunner.getIsbn());
		System.out.println("");
		System.out.println("El libro Ferrari tiene de titulo: \n" + ferrari.getTitulo() + "\nautor: \n" + ferrari.getAutor() + "\neditorial: \n" + ferrari.getEditorial() + "\nisbn: \n" + ferrari.getIsbn());
		System.out.println("");
		System.out.println("El libro Porsche tiene de titulo: \n" + porsche.getTitulo() + "\nautor: \n " + porsche.getAutor() + "\neditorial: \n" + porsche.getEditorial() + "\nisbn: \n" +  porsche.getIsbn());
		System.out.println("");

		de.setTitulo("NUEVO TITULO");
		mazeRunner.setAutor("NUEVO AUTOR");
		ferrari.setEditorial("NUEVA EDITORIAL");
		porsche.setIsbn("NUEVO ISBN");
		
		System.out.println("El nuevo titulo de default es: \n" + de.getTitulo());
		System.out.println("El nuevo autor de mazeRunner es : \n" + mazeRunner.getAutor());
		System.out.println("El nuevo titulo de ferrari es: \n" + ferrari.getEditorial());
		System.out.println("El nuevo titulo de porsche es: \n" + porsche.getIsbn());


	}

}
