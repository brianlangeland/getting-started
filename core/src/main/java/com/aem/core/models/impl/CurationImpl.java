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


package com.aem.core.models.impl;

import com.adobe.acs.commons.models.injectors.annotation.SharedValueMapValue;
import com.aem.core.models.Curation;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;

@Model(
        adaptables = { SlingHttpServletRequest.class },
        adapters = Curation.class,
        resourceType = CurationImpl.RESOURCE_TYPE)
public class CurationImpl implements Curation {

    public static final String RESOURCE_TYPE = "gettingStarted/components/content/curation";

    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String[] tags;

    @Override
    public String[] getTags() {
        return tags;
    }

}
