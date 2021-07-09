/**
 * Snac Activity File
 *
 * Contains the data class for activities
 *
 * License:
 *
 *
 * @author Robbie Hott
 * @license https://opensource.org/licenses/BSD-3-Clause BSD 3-Clause
 * @copyright 2015 the Rector and Visitors of the University of Virginia, and
 *            the Regents of the University of California
 */
package org.snaccooperative.data;

/**
 * Activity data storage class
 *
 *  See the abstract parent class for common methods setDBInfo() and getDBInfo().
 *
 * @author Robbie Hott
 *
 */
public class Activity extends AbstractData {

    /**
     * Vocabulary Term
     *
     * From EAC-CPF tag(s):
     *
     * * activity/term
     *
     * @var snacdataTerm activity controlled vocabulary term
     */
    private Term term;

    /**
     * Type of activity
     *
     * From EAC-CPF tag(s):
     *
     * * activity/@localType
     *
     * @var snacdataTerm Type of the activity
     */
    private Term type;


    /**
     * Descriptive Note
     *
     * From EAC-CPF tag(s):
     *
     * * activity/descriptiveNote
     *
     * @var string Descriptive note for the activity
     */
    private String note;

    /**
     * Vocabulary Source
     *
     * From EAC-CPF tag(s):
     *
     * * activity/term/@vocabularySource
     *
     * @var string Vocabulary source for the activity
     */
    private String vocabularySource = null;

    /**
     * Constructor
     *
     * Activities may only have one date object.
     */
    public Activity() {
        super();
        this.setDataType("Activity");
        this.setMaxDateCount(1);
    }


    /**
     * Get the Term for this activity
     *
     * * activity/term
     *
     * @return snacdataTerm Activity controlled vocabulary term
     *
     */
    public Term getTerm()
    {
        return this.term;
    }

    /**
     * Get the type of this activity
     *
     * * activity/@localType
     *
     * @return snacdataTerm Type of the activity
     *
     */
    public Term getType()
    {
        return this.type;
    }


    /**
     * Get Descriptive Note
     *
     * Get the human-readable descriptive note for this activity
     *
     * * activity/descriptiveNote
     *
     * @return string Descriptive note for the activity
     *
     */
    public String getNote()
    {
        return this.note;
    }

    /**
     * Get the vocabulary source
     *
     * * activity/term/@vocabularySource
     *
     * @return string Vocabulary source for the activity
     *
     */
    public String getVocabularySource()
    {
        return this.vocabularySource;
    }

    /**
     * To String
     *
     * Converts this object to a human-readable summary string.  This is enough to identify
     * the object on sight, but not enough to discern programmatically.
     *
     * @return string A human-readable summary string of this object
     */
    public String toString() {
        return "Activity: " + this.term.getTerm();
    }

    /**
     * Set the term of this activity
     *
     * This comes from the controlled vocabulary
     */
    public void setTerm(Term term) {

        this.term = term;
    }

    /**
     * Set the type of this activity
     */
    public void setType(Term type) {

        this.type = type;
    }

    /**
     * Set the vocabulary source
     */
    public void setVocabularySource(String vocab) {

        this.vocabularySource = vocab;
    }

    /**
     * Set the descriptive note for this activity
     */
    public void setNote(String note) {

        this.note = note;
    }

    /**
     * {@inheritDoc}
     */
    public boolean equals(Object other) {

        if (other == null || ! (other instanceof Activity))
            return false;

        if (!super.equals(other))
            return false;

        Activity f = (Activity) other;

        if ((this.getVocabularySource() != null && ! this.getVocabularySource().equals(f.getVocabularySource())) ||
                (this.getVocabularySource() == null && f.getVocabularySource() != null))
            return false;
        if ((this.getNote() != null && ! this.getNote().equals(f.getNote())) ||
                (this.getNote() == null && f.getNote() != null))
            return false;

        if ((this.getTerm() != null && ! this.getTerm().equals(f.getTerm())) ||
                 (this.getTerm() == null && f.getTerm() != null))
            return false;
        if ((this.getType() != null && ! this.getType().equals(f.getType())) ||
                 (this.getType() == null && f.getType() != null))
            return false;

        return true;
    }
}
