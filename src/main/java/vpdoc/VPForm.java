package vpdoc;

/**
 * @author RYANF This class is intended to describe the variety purity form
 *         object. This is a test performed on soybeans within a seed lab where
 *         I work.  The off-types are the seed that don't conform to the company's
 *         seed description.  And Sample size is just what you would expect... the 
 *         number of seed examined.
 */
public class VPForm {

	private int sampleSize;
	private int offTypeNum;

	/**
	 * Default Constructor
	 */
	public VPForm() {

	}

	/**
	 * Constructor
	 * 
	 * @param sampleSize Number of seed in sample
	 * @param offTypeNum Number of off-type seed in sample
	 */
	public VPForm(int sampleSize, int offTypeNum) {
		super();
		this.sampleSize = sampleSize;
		this.offTypeNum = offTypeNum;
	}

	// Getters and Setters
	public int getSampleSize() {
		return sampleSize;
	}

	public void setSampleSize(int sampleSize) {
		this.sampleSize = sampleSize;
	}

	public int getOffTypeNum() {
		return offTypeNum;
	}

	public void setOffTypeNum(int offTypeNum) {
		this.offTypeNum = offTypeNum;
	}

}
