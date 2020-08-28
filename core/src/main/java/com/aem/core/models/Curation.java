/*

 * ***********************************************************************

 * Sanjay Rai CONFIDENTIAL

 * ___________________

 *

 * Copyright 2019 Sanjay Rai.

 * All Rights Reserved.

 *

 * NOTICE:  All information contained herein is, and remains the property

 * of Sanjay Rai and its suppliers, if any. The intellectual and

 * technical concepts contained herein are proprietary to Sanjay Rai

 * and its suppliers and are protected by trade secret or copyright law.

 * Dissemination of this information or reproduction of this material

 * is strictly forbidden unless prior written permission is obtained

 * from Sanjay Rai.

 * ***********************************************************************

 */


package com.aem.core.models;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Defines the {@code Curation} Sling Model used for the {@code gettingStarted/components/content/curation} component.
 */
@ConsumerType
public interface Curation {

    /**
     * Returns a list of tags
     * 
     * @return String
     */
    String[] getTags();

}
