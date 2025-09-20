class LibraryBook{
	private int copiesAvailable = 0;
	
	public void addCopies(int n){
		 if (n > 0) {
            copiesAvailable += n;
            System.out.println("Copies available = " + copiesAvailable);
        } else {
            System.out.println("Invalid number of copies to add");
        }
	}
	public void removeCopies(int n){
		if(copiesAvailable>=n){
			copiesAvailable-=n;
			System.out.println("CopiesAvailable ="+copiesAvailable);
		}else {
			System.out.println("Not enough copies Available ");
		}
	}
	
	public int getCopiesAvailable(){
		return copiesAvailable;
	}
}
class LibraryBookDriver{
	public static void main(String[]args){
		LibraryBook l1 = new LibraryBook();
		l1.addCopies(3);
		l1.removeCopies(1);
		System.out.println("Copies avaiable are :"+l1.getCopiesAvailable());
	}
}