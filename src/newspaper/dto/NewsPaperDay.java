package newspaper.dto;

import newspaper.util.MyConstant.DAY_OF_WEEK_ENUM;

/**
 * @since Aug - 18 - 2013
 * @author Nguyen Hoang Anh
 */
public class NewsPaperDay {
    private int id;
    private int dayOfWeeks;
    private int noOfCopyRequired;
    private int requirementId;

    public int getDayOfWeeks() {
        return dayOfWeeks;
    }

    public void setDayOfWeeks(int dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    public int getId() {
        return id;
    }

    public int getNoOfCopyRequired() {
        return noOfCopyRequired;
    }

    public void setNoOfCopyRequired(int noOfCopyRequired) {
        this.noOfCopyRequired = noOfCopyRequired;
    }

    public int getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(int requirementId) {
        this.requirementId = requirementId;
    }

    /**
     * Create default values for new instance
     */
    public NewsPaperDay() {
        id = 0;
        dayOfWeeks = DAY_OF_WEEK_ENUM.SUN.getValue();
        noOfCopyRequired = 1;
        requirementId = 0;
    }

    /**
     * Create values for new instance
     * @param dayOfWeeks
     * @param noOfCopyRequired
     * @param requirementId 
     */
    public NewsPaperDay(int dayOfWeeks, int noOfCopyRequired, int requirementId) {
        this.dayOfWeeks = dayOfWeeks;
        this.noOfCopyRequired = noOfCopyRequired;
        this.requirementId = requirementId;
    }
}
