

/**
 * Subject Class
 *
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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Subject Class
 *
 * Class that holds Subject Information
 *
 * @author Robbie Hott
 */
class Subject extends AbstractTermData {

    /**
     * Constructor
     */
    public Subject() {
        super();
        this.setDataType("Subject");
        this.setMaxDateCount(0);
    }


    public static void main(String[] args) {
        String test = "{\n            \"dataType\": \"SNACDate\",\n            \"fromDate\": \"1860-08-13\",\n            \"fromDateOriginal\": \"1860-08-13\",\n            \"fromType\": {\n                \"id\": \"689\",\n                \"term\": \"Birth\",\n                \"uri\": \"http:\\/\\/socialarchive.iath.virginia.edu\\/control\\/term#Birth\",\n                \"type\": \"date_type\"\n            },\n            \"toDate\": \"1926-11-03\",\n            \"toDateOriginal\": \"1926-11-03\",\n            \"toType\": {\n                \"id\": \"690\",\n                \"term\": \"Death\",\n                \"uri\": \"http:\\/\\/socialarchive.iath.virginia.edu\\/control\\/term#Death\",\n                \"type\": \"date_type\"\n            },\n            \"isRange\": true,\n            \"id\": \"25298391\",\n            \"version\": \"3694520\"\n        "
        + ",\n" +
                "            \"snacControlMetadata\": [\n" +
                "                {\n" +
                "                    \"dataType\": \"SNACControlMetadata\",\n" +
                "                    \"citation\": null,\n" +
                "                    \"subCitation\": null,\n" +
                "                    \"sourceData\": \"Francs-Bourgeois (rue des)\",\n" +
                "                    \"descriptiveRule\": null,\n" +
                "                    \"language\": null,\n" +
                "                    \"object\": null,\n" +
                "                    \"note\": \"Parsed from SNAC EAC-CPF.\",\n" +
                "                    \"id\": \"0\",\n" +
                "                    \"version\": \"0\",\n" +
                "                    \"operation\": null,\n" +
                "                    \"dates\": []\n" +
                "                },\n" +
                "                {\n" +
                "                    \"dataType\": \"SNACControlMetadata\",\n" +
                "                    \"citation\": null,\n" +
                "                    \"subCitation\": null,\n" +
                "                    \"sourceData\": \"SECOND Francs-Bourgeois (rue des)\",\n" +
                "                    \"descriptiveRule\": null,\n" +
                "                    \"language\": null,\n" +
                "                    \"object\": null,\n" +
                "                    \"note\": \"Parsed from SNAC EAC-CPF.\",\n" +
                "                    \"id\": \"8280096\",\n" +
                "                    \"version\": \"1201577\",\n" +
                "                    \"operation\": null,\n" +
                "                    \"dates\": []\n" +
                "                }\n" +
                "]" + "}";

        try {
            ObjectMapper om = new ObjectMapper();
            SNACDate d = om.readValue(test, SNACDate.class);
            System.out.println(d.toString());

            for (SNACControlMetadata s : d.getSnacControlMetadata()) {
                System.out.println(s.getSourceData());
            }
            om.enable(SerializationFeature.INDENT_OUTPUT);
            System.out.println(om.writeValueAsString(d));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
