package assign.linklist;

public class BookL {
	
	// instance members
		private int bid;
		private String name;
		private double price;
		
		// constructor
		public BookL(int bid, String name, double price) {
			this.bid = bid;
			this.name = name;
			this.price = price;
		}

		// display 
		public String toString() {
			return "Book [bid =" + bid + ", name =" + name + ", price =" + price + "]";
		}

		/**
		 * @return the bid
		 */
		public int getBid() {
			return bid;
		}

		/**
		 * @param bid the bid to set
		 */
		public void setBid(int bid) {
			this.bid = bid;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the price
		 */
		public double getPrice() {
			return price;
		}

		/**
		 * @param price the price to set
		 */
		public void setPrice(double price) {
			this.price = price;
		}

}
