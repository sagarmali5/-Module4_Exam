import java.util.*;
class Item{
	int itemId;
	String itemName;
	Item(int itemId, String itemName){
		this.itemId = itemId;
		this.itemName = itemName;
	}
	Item(){}
		void setitemId(int itemId){
			this.itemId = itemId;
		}
		void setitemName(String itemName){
			this.itemName = itemName;
		}
		public String toString(){
			return this.itemId+ " " +this.itemName;
		}
	}

class namesort implements Comparator<Item>{
	public int compare(Item I1, Item I2){
		return I1.itemName.compareTo(I2.itemName);
	}
}
class idsort implements Comparator<Item>{
	public int compare(Item I1, Item I2){
		return I1.itemId-(I2.itemId);
	}
}

class inventory{
	static Item I = new Item();
	static ArrayList<Item> list = new ArrayList<> ();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;
		Item I1 = new Item(1, "A");
		Item I2 = new Item(3, "B");
		Item I3 = new Item(2, "C");
		Item I4 = new Item(4, "D");
		Item I5 = new Item(10, "E");
		
		list.add(I1);
		list.add(I2);
		list.add(I3);
		list.add(I4);
		list.add(I5);
		do{
			System.out.println("Enter your choice ==");
			System.out.println("1) Add Item. \n2) Display complete inventory insorted order of itemnames as well as itemId. \n3) Remove Item. \n4) exit");
		
			choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter your details as follows");
					System.out.println("Enter Item you want add");
					
					for (int i =1; i<=1; i++){
						System.out.println("Enter id of item ");
						int d = sc.nextInt();
						I.setitemId(d);
						System.out.println("Enter name of item ");
						sc.nextLine();
						String ss = sc.nextLine();
						I.setitemName(ss);
						list.add(I);
					}
					
			System.out.println("Addes item as follows");
			System.out.println(list);
			break;
			
				case 2:
				System.out.println("before sorting");
				System.out.println(list);
				System.out.println("Sorting by id");
				idsort n2 = new idsort();
				Collections.sort(list,n2);
				System.out.println(list);
				System.out.println("Sorting by name");
				namesort n1 = new namesort();
				Collections.sort(list, n1);
				System.out.println(list);
				break;
				
				case 3:
				System.out.println("List as follows");
				System.out.println(list);
				System.out.println("Enter index of item which you want to remove index start from 0");
				int re = sc.nextInt();
				list.remove(re);
				System.out.println("list after removal");
				System.out.println(list);
				break;
				
				case 4:
				System.out.println("Thank you");
				break;
		}
		
	} while(choice!=4);
}
}