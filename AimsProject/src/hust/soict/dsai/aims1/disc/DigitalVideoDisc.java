package hust.soict.dsai.aims1.disc;

public class DigitalVideoDisc {
	// Class (static) variable
    private static int nbDigitalVideoDiscs = 0;

    // Instance variables
    private int id; // Unique ID for each DVD
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    // Constructor
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        // Update the class variable and assign a unique ID
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;

        // Initialize instance variables
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(String string) {
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(String string, String string2, String string3, String string4, int i, double d) {
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(String string, String string2, float f) {
		// TODO Auto-generated constructor stub
	}

	// Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    // Static method to get the current count of DVDs
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // toString to display DVD information
    @Override
    public String toString() {
        return "DigitalVideoDisc [ID=" + id + ", Title=" + title + ", Category=" + category +
               ", Director=" + director + ", Length=" + length + " min, Cost=$" + cost + "]";
    }

	public void setTitle(String title2) {
		// TODO Auto-generated method stub
		
	}

	public static void add(DigitalVideoDisc disc) {
		// TODO Auto-generated method stub
		
	}
}
